//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 10:23:33 PM EST 
//


package org.mujoco.xml.attributetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jointtypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jointtypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="free"/&gt;
 *     &lt;enumeration value="ball"/&gt;
 *     &lt;enumeration value="slide"/&gt;
 *     &lt;enumeration value="hinge"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "jointtypeType", namespace = "attributeTypes")
@XmlEnum
public enum JointtypeType {

    @XmlEnumValue("free")
    FREE("free"),
    @XmlEnumValue("ball")
    BALL("ball"),
    @XmlEnumValue("slide")
    SLIDE("slide"),
    @XmlEnumValue("hinge")
    HINGE("hinge");
    private final String value;

    JointtypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JointtypeType fromValue(String v) {
        for (JointtypeType c: JointtypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
