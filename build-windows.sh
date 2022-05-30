#!/bin/bash

echo "Windows Build"
VER=$(cat mujocoRelease.txt)
TYPE=windows-x86_64
ARCHIVE=mujoco-$VER-$TYPE.zip
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

if [ -f "/tmp/$ARCHIVE" ]; then
    echo "/tmp/$ARCHIVE exists."
else
	rm -rf /tmp/mujoco*
	curl https://github.com/deepmind/mujoco/releases/download/$VER/$ARCHIVE -o /tmp/$ARCHIVE
	cd /tmp/
	tar -xf $ARCHIVE
	mv /tmp/mujoco-$VER /tmp/mujoco/
	ln -s /tmp/mujoco $SCRIPT_DIR/
	cd $SCRIPT_DIR/
fi
set -e
JAVACPP_VER=1.5.7
JAVACPP=javacpp-platform-$JAVACPP_VER-bin.zip
if [ -f "$JAVACPP" ]; then
    echo "$JAVACPP exists."
else
	curl https://github.com/bytedeco/javacpp/releases/download/$JAVACPP_VER/$JAVACPP -o $JAVACPP
	tar -xf $JAVACPP
fi

cd src/main/java/
java -jar ../../../javacpp-platform-1.5.7-bin/javacpp.jar mujoco/java/MuJoCoConfig.java
java -jar ../../../javacpp-platform-1.5.7-bin/javacpp.jar org/mujoco/MuJoCoLib.java
LIBPATH=$PWD/../resources/$TYPE/
ls -al
if [ -d "$LIBPATH" ] 
then
	rm $LIBPATH/libjni*.so
    mv $TYPE/* $LIBPATH 
else
    mv $TYPE/ ../resources/
fi

cd $SCRIPT_DIR/

./gradlew jar  --stacktrace test


