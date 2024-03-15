//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.mujoco.xml.equality;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.Copyable;
import com.kscs.util.jaxb.PartialCopyable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import com.kscs.util.jaxb.PropertyVisitor;


/**
 * <p>Java class for connectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="solimp" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" /&gt;
 *       &lt;attribute name="solref" type="{attributeTypes}twoRealsType" default="0.02 1" /&gt;
 *       &lt;attribute name="body1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="body2" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="anchor" use="required" type="{attributeTypes}threeRealsType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectType")
public class ConnectType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "active")
    protected Boolean active;
    @XmlAttribute(name = "solimp")
    protected String solimp;
    @XmlAttribute(name = "solref")
    protected String solref;
    @XmlAttribute(name = "body1", required = true)
    protected String body1;
    @XmlAttribute(name = "body2")
    protected String body2;
    @XmlAttribute(name = "anchor", required = true)
    protected String anchor;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public ConnectType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a ConnectType copying the state of another ConnectType
     * 
     * @param _other
     *     The original ConnectType from which to copy state.
     */
    public ConnectType(final ConnectType _other) {
        this.name = _other.name;
        this.clazz = _other.clazz;
        this.active = _other.active;
        this.solimp = _other.solimp;
        this.solref = _other.solref;
        this.body1 = _other.body1;
        this.body2 = _other.body2;
        this.anchor = _other.anchor;
    }

    /**
     * Instantiates a ConnectType copying the state of another ConnectType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original ConnectType from which to copy state.
     */
    public ConnectType(final ConnectType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            this.name = _other.name;
        }
        final PropertyTree clazzPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clazz"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clazzPropertyTree!= null):((clazzPropertyTree == null)||(!clazzPropertyTree.isLeaf())))) {
            this.clazz = _other.clazz;
        }
        final PropertyTree activePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("active"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(activePropertyTree!= null):((activePropertyTree == null)||(!activePropertyTree.isLeaf())))) {
            this.active = _other.active;
        }
        final PropertyTree solimpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpPropertyTree!= null):((solimpPropertyTree == null)||(!solimpPropertyTree.isLeaf())))) {
            this.solimp = _other.solimp;
        }
        final PropertyTree solrefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solref"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefPropertyTree!= null):((solrefPropertyTree == null)||(!solrefPropertyTree.isLeaf())))) {
            this.solref = _other.solref;
        }
        final PropertyTree body1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body1"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body1PropertyTree!= null):((body1PropertyTree == null)||(!body1PropertyTree.isLeaf())))) {
            this.body1 = _other.body1;
        }
        final PropertyTree body2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body2"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body2PropertyTree!= null):((body2PropertyTree == null)||(!body2PropertyTree.isLeaf())))) {
            this.body2 = _other.body2;
        }
        final PropertyTree anchorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("anchor"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(anchorPropertyTree!= null):((anchorPropertyTree == null)||(!anchorPropertyTree.isLeaf())))) {
            this.anchor = _other.anchor;
        }
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isActive() {
        if (active == null) {
            return true;
        } else {
            return active;
        }
    }

    /**
     * Gets the value of the solimp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolimp() {
        if (solimp == null) {
            return "0.9 0.95 0.001 0.5 2";
        } else {
            return solimp;
        }
    }

    /**
     * Gets the value of the solref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolref() {
        if (solref == null) {
            return "0.02 1";
        } else {
            return solref;
        }
    }

    /**
     * Gets the value of the body1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody1() {
        return body1;
    }

    /**
     * Gets the value of the body2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody2() {
        return body2;
    }

    /**
     * Gets the value of the anchor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchor() {
        return anchor;
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public ConnectType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public ConnectType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setName(final String value) {
        final String __oldValue = this.name;
        try {
            this.vetoableChange__Support.fireVetoableChange("name", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.name = value;
        this.propertyChange__Support.firePropertyChange("name", __oldValue, value);
    }

    public void setClazz(final String value) {
        final String __oldValue = this.clazz;
        try {
            this.vetoableChange__Support.fireVetoableChange("clazz", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.clazz = value;
        this.propertyChange__Support.firePropertyChange("clazz", __oldValue, value);
    }

    public void setActive(final Boolean value) {
        final Boolean __oldValue = this.active;
        try {
            this.vetoableChange__Support.fireVetoableChange("active", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.active = value;
        this.propertyChange__Support.firePropertyChange("active", __oldValue, value);
    }

    public void setSolimp(final String value) {
        final String __oldValue = this.solimp;
        try {
            this.vetoableChange__Support.fireVetoableChange("solimp", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.solimp = value;
        this.propertyChange__Support.firePropertyChange("solimp", __oldValue, value);
    }

    public void setSolref(final String value) {
        final String __oldValue = this.solref;
        try {
            this.vetoableChange__Support.fireVetoableChange("solref", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.solref = value;
        this.propertyChange__Support.firePropertyChange("solref", __oldValue, value);
    }

    public void setBody1(final String value) {
        final String __oldValue = this.body1;
        try {
            this.vetoableChange__Support.fireVetoableChange("body1", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.body1 = value;
        this.propertyChange__Support.firePropertyChange("body1", __oldValue, value);
    }

    public void setBody2(final String value) {
        final String __oldValue = this.body2;
        try {
            this.vetoableChange__Support.fireVetoableChange("body2", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.body2 = value;
        this.propertyChange__Support.firePropertyChange("body2", __oldValue, value);
    }

    public void setAnchor(final String value) {
        final String __oldValue = this.anchor;
        try {
            this.vetoableChange__Support.fireVetoableChange("anchor", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.anchor = value;
        this.propertyChange__Support.firePropertyChange("anchor", __oldValue, value);
    }

    @Override
    public ConnectType clone() {
        final ConnectType _newObject;
        try {
            _newObject = ((ConnectType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public ConnectType createCopy() {
        final ConnectType _newObject;
        try {
            _newObject = ((ConnectType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.name = this.name;
        _newObject.clazz = this.clazz;
        _newObject.active = this.active;
        _newObject.solimp = this.solimp;
        _newObject.solref = this.solref;
        _newObject.body1 = this.body1;
        _newObject.body2 = this.body2;
        _newObject.anchor = this.anchor;
        return _newObject;
    }

    @Override
    public ConnectType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ConnectType _newObject;
        try {
            _newObject = ((ConnectType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _newObject.name = this.name;
        }
        final PropertyTree clazzPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clazz"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clazzPropertyTree!= null):((clazzPropertyTree == null)||(!clazzPropertyTree.isLeaf())))) {
            _newObject.clazz = this.clazz;
        }
        final PropertyTree activePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("active"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(activePropertyTree!= null):((activePropertyTree == null)||(!activePropertyTree.isLeaf())))) {
            _newObject.active = this.active;
        }
        final PropertyTree solimpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpPropertyTree!= null):((solimpPropertyTree == null)||(!solimpPropertyTree.isLeaf())))) {
            _newObject.solimp = this.solimp;
        }
        final PropertyTree solrefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solref"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefPropertyTree!= null):((solrefPropertyTree == null)||(!solrefPropertyTree.isLeaf())))) {
            _newObject.solref = this.solref;
        }
        final PropertyTree body1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body1"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body1PropertyTree!= null):((body1PropertyTree == null)||(!body1PropertyTree.isLeaf())))) {
            _newObject.body1 = this.body1;
        }
        final PropertyTree body2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body2"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body2PropertyTree!= null):((body2PropertyTree == null)||(!body2PropertyTree.isLeaf())))) {
            _newObject.body2 = this.body2;
        }
        final PropertyTree anchorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("anchor"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(anchorPropertyTree!= null):((anchorPropertyTree == null)||(!anchorPropertyTree.isLeaf())))) {
            _newObject.anchor = this.anchor;
        }
        return _newObject;
    }

    @Override
    public ConnectType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public ConnectType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ConnectType.Builder<_B> _other) {
        _other.name = this.name;
        _other.clazz = this.clazz;
        _other.active = this.active;
        _other.solimp = this.solimp;
        _other.solref = this.solref;
        _other.body1 = this.body1;
        _other.body2 = this.body2;
        _other.anchor = this.anchor;
    }

    public<_B >ConnectType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ConnectType.Builder<_B>(_parentBuilder, this, true);
    }

    public ConnectType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ConnectType.Builder<Void> builder() {
        return new ConnectType.Builder<Void>(null, null, false);
    }

    public static<_B >ConnectType.Builder<_B> copyOf(final ConnectType _other) {
        final ConnectType.Builder<_B> _newBuilder = new ConnectType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ConnectType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree clazzPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clazz"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clazzPropertyTree!= null):((clazzPropertyTree == null)||(!clazzPropertyTree.isLeaf())))) {
            _other.clazz = this.clazz;
        }
        final PropertyTree activePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("active"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(activePropertyTree!= null):((activePropertyTree == null)||(!activePropertyTree.isLeaf())))) {
            _other.active = this.active;
        }
        final PropertyTree solimpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpPropertyTree!= null):((solimpPropertyTree == null)||(!solimpPropertyTree.isLeaf())))) {
            _other.solimp = this.solimp;
        }
        final PropertyTree solrefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solref"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefPropertyTree!= null):((solrefPropertyTree == null)||(!solrefPropertyTree.isLeaf())))) {
            _other.solref = this.solref;
        }
        final PropertyTree body1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body1"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body1PropertyTree!= null):((body1PropertyTree == null)||(!body1PropertyTree.isLeaf())))) {
            _other.body1 = this.body1;
        }
        final PropertyTree body2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body2"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body2PropertyTree!= null):((body2PropertyTree == null)||(!body2PropertyTree.isLeaf())))) {
            _other.body2 = this.body2;
        }
        final PropertyTree anchorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("anchor"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(anchorPropertyTree!= null):((anchorPropertyTree == null)||(!anchorPropertyTree.isLeaf())))) {
            _other.anchor = this.anchor;
        }
    }

    public<_B >ConnectType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ConnectType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ConnectType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ConnectType.Builder<_B> copyOf(final ConnectType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ConnectType.Builder<_B> _newBuilder = new ConnectType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ConnectType.Builder<Void> copyExcept(final ConnectType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ConnectType.Builder<Void> copyOnly(final ConnectType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public ConnectType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String name;
        private String clazz;
        private Boolean active;
        private String solimp;
        private String solref;
        private String body1;
        private String body2;
        private String anchor;

        public Builder(final _B _parentBuilder, final ConnectType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.name = _other.name;
                this.clazz = _other.clazz;
                this.active = _other.active;
                this.solimp = _other.solimp;
                this.solref = _other.solref;
                this.body1 = _other.body1;
                this.body2 = _other.body2;
                this.anchor = _other.anchor;
            }
        }

        public Builder(final _B _parentBuilder, final ConnectType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                    this.name = _other.name;
                }
                final PropertyTree clazzPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clazz"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clazzPropertyTree!= null):((clazzPropertyTree == null)||(!clazzPropertyTree.isLeaf())))) {
                    this.clazz = _other.clazz;
                }
                final PropertyTree activePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("active"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(activePropertyTree!= null):((activePropertyTree == null)||(!activePropertyTree.isLeaf())))) {
                    this.active = _other.active;
                }
                final PropertyTree solimpPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solimp"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solimpPropertyTree!= null):((solimpPropertyTree == null)||(!solimpPropertyTree.isLeaf())))) {
                    this.solimp = _other.solimp;
                }
                final PropertyTree solrefPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("solref"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(solrefPropertyTree!= null):((solrefPropertyTree == null)||(!solrefPropertyTree.isLeaf())))) {
                    this.solref = _other.solref;
                }
                final PropertyTree body1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body1"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body1PropertyTree!= null):((body1PropertyTree == null)||(!body1PropertyTree.isLeaf())))) {
                    this.body1 = _other.body1;
                }
                final PropertyTree body2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body2"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(body2PropertyTree!= null):((body2PropertyTree == null)||(!body2PropertyTree.isLeaf())))) {
                    this.body2 = _other.body2;
                }
                final PropertyTree anchorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("anchor"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(anchorPropertyTree!= null):((anchorPropertyTree == null)||(!anchorPropertyTree.isLeaf())))) {
                    this.anchor = _other.anchor;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends ConnectType >_P init(final _P _product) {
            _product.name = this.name;
            _product.clazz = this.clazz;
            _product.active = this.active;
            _product.solimp = this.solimp;
            _product.solref = this.solref;
            _product.body1 = this.body1;
            _product.body2 = this.body2;
            _product.anchor = this.anchor;
            return _product;
        }

        /**
         * Sets the new value of "name" (any previous value will be replaced)
         * 
         * @param name
         *     New value of the "name" property.
         */
        public ConnectType.Builder<_B> withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the new value of "clazz" (any previous value will be replaced)
         * 
         * @param clazz
         *     New value of the "clazz" property.
         */
        public ConnectType.Builder<_B> withClazz(final String clazz) {
            this.clazz = clazz;
            return this;
        }

        /**
         * Sets the new value of "active" (any previous value will be replaced)
         * 
         * @param active
         *     New value of the "active" property.
         */
        public ConnectType.Builder<_B> withActive(final Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * Sets the new value of "solimp" (any previous value will be replaced)
         * 
         * @param solimp
         *     New value of the "solimp" property.
         */
        public ConnectType.Builder<_B> withSolimp(final String solimp) {
            this.solimp = solimp;
            return this;
        }

        /**
         * Sets the new value of "solref" (any previous value will be replaced)
         * 
         * @param solref
         *     New value of the "solref" property.
         */
        public ConnectType.Builder<_B> withSolref(final String solref) {
            this.solref = solref;
            return this;
        }

        /**
         * Sets the new value of "body1" (any previous value will be replaced)
         * 
         * @param body1
         *     New value of the "body1" property.
         */
        public ConnectType.Builder<_B> withBody1(final String body1) {
            this.body1 = body1;
            return this;
        }

        /**
         * Sets the new value of "body2" (any previous value will be replaced)
         * 
         * @param body2
         *     New value of the "body2" property.
         */
        public ConnectType.Builder<_B> withBody2(final String body2) {
            this.body2 = body2;
            return this;
        }

        /**
         * Sets the new value of "anchor" (any previous value will be replaced)
         * 
         * @param anchor
         *     New value of the "anchor" property.
         */
        public ConnectType.Builder<_B> withAnchor(final String anchor) {
            this.anchor = anchor;
            return this;
        }

        @Override
        public ConnectType build() {
            return this.init(new ConnectType());
        }

        public ConnectType.Builder<_B> copyOf(final ConnectType _other) {
            _other.copyTo(this);
            return this;
        }

        public ConnectType.Builder<_B> copyOf(final ConnectType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String NAME = "name";
        public final static transient String CLAZZ = "clazz";
        public final static transient String ACTIVE = "active";
        public final static transient String SOLIMP = "solimp";
        public final static transient String SOLREF = "solref";
        public final static transient String BODY_1 = "body1";
        public final static transient String BODY_2 = "body2";
        public final static transient String ANCHOR = "anchor";

    }

    public static class Select
        extends ConnectType.Selector<ConnectType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ConnectType.Select _root() {
            return new ConnectType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> clazz = null;
        private com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> active = null;
        private com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> solimp = null;
        private com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> solref = null;
        private com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> body1 = null;
        private com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> body2 = null;
        private com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> anchor = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.name!= null) {
                products.put("name", this.name.init());
            }
            if (this.clazz!= null) {
                products.put("clazz", this.clazz.init());
            }
            if (this.active!= null) {
                products.put("active", this.active.init());
            }
            if (this.solimp!= null) {
                products.put("solimp", this.solimp.init());
            }
            if (this.solref!= null) {
                products.put("solref", this.solref.init());
            }
            if (this.body1 != null) {
                products.put("body1", this.body1 .init());
            }
            if (this.body2 != null) {
                products.put("body2", this.body2 .init());
            }
            if (this.anchor!= null) {
                products.put("anchor", this.anchor.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> clazz() {
            return ((this.clazz == null)?this.clazz = new com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>>(this._root, this, "clazz"):this.clazz);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> active() {
            return ((this.active == null)?this.active = new com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>>(this._root, this, "active"):this.active);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> solimp() {
            return ((this.solimp == null)?this.solimp = new com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>>(this._root, this, "solimp"):this.solimp);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> solref() {
            return ((this.solref == null)?this.solref = new com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>>(this._root, this, "solref"):this.solref);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> body1() {
            return ((this.body1 == null)?this.body1 = new com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>>(this._root, this, "body1"):this.body1);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> body2() {
            return ((this.body2 == null)?this.body2 = new com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>>(this._root, this, "body2"):this.body2);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>> anchor() {
            return ((this.anchor == null)?this.anchor = new com.kscs.util.jaxb.Selector<TRoot, ConnectType.Selector<TRoot, TParent>>(this._root, this, "anchor"):this.anchor);
        }

    }

}
