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
import java.math.BigDecimal;
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
 * <p>Java class for distanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="solimp" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" /&gt;
 *       &lt;attribute name="solref" type="{attributeTypes}twoRealsType" default="0.02 1" /&gt;
 *       &lt;attribute name="geom1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="geom2" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distanceType")
public class DistanceType implements Cloneable, Copyable, PartialCopyable
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
    @XmlAttribute(name = "geom1", required = true)
    protected String geom1;
    @XmlAttribute(name = "geom2")
    protected String geom2;
    @XmlAttribute(name = "distance")
    protected BigDecimal distance;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public DistanceType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a DistanceType copying the state of another DistanceType
     * 
     * @param _other
     *     The original DistanceType from which to copy state.
     */
    public DistanceType(final DistanceType _other) {
        this.name = _other.name;
        this.clazz = _other.clazz;
        this.active = _other.active;
        this.solimp = _other.solimp;
        this.solref = _other.solref;
        this.geom1 = _other.geom1;
        this.geom2 = _other.geom2;
        this.distance = _other.distance;
    }

    /**
     * Instantiates a DistanceType copying the state of another DistanceType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original DistanceType from which to copy state.
     */
    public DistanceType(final DistanceType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
        final PropertyTree geom1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom1"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geom1PropertyTree!= null):((geom1PropertyTree == null)||(!geom1PropertyTree.isLeaf())))) {
            this.geom1 = _other.geom1;
        }
        final PropertyTree geom2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom2"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geom2PropertyTree!= null):((geom2PropertyTree == null)||(!geom2PropertyTree.isLeaf())))) {
            this.geom2 = _other.geom2;
        }
        final PropertyTree distancePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("distance"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(distancePropertyTree!= null):((distancePropertyTree == null)||(!distancePropertyTree.isLeaf())))) {
            this.distance = _other.distance;
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
     * Gets the value of the geom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeom1() {
        return geom1;
    }

    /**
     * Gets the value of the geom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeom2() {
        return geom2;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        if (distance == null) {
            return new BigDecimal("0");
        } else {
            return distance;
        }
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public DistanceType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public DistanceType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
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

    public void setGeom1(final String value) {
        final String __oldValue = this.geom1;
        try {
            this.vetoableChange__Support.fireVetoableChange("geom1", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.geom1 = value;
        this.propertyChange__Support.firePropertyChange("geom1", __oldValue, value);
    }

    public void setGeom2(final String value) {
        final String __oldValue = this.geom2;
        try {
            this.vetoableChange__Support.fireVetoableChange("geom2", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.geom2 = value;
        this.propertyChange__Support.firePropertyChange("geom2", __oldValue, value);
    }

    public void setDistance(final BigDecimal value) {
        final BigDecimal __oldValue = this.distance;
        try {
            this.vetoableChange__Support.fireVetoableChange("distance", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.distance = value;
        this.propertyChange__Support.firePropertyChange("distance", __oldValue, value);
    }

    @Override
    public DistanceType clone() {
        final DistanceType _newObject;
        try {
            _newObject = ((DistanceType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public DistanceType createCopy() {
        final DistanceType _newObject;
        try {
            _newObject = ((DistanceType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.name = this.name;
        _newObject.clazz = this.clazz;
        _newObject.active = this.active;
        _newObject.solimp = this.solimp;
        _newObject.solref = this.solref;
        _newObject.geom1 = this.geom1;
        _newObject.geom2 = this.geom2;
        _newObject.distance = this.distance;
        return _newObject;
    }

    @Override
    public DistanceType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DistanceType _newObject;
        try {
            _newObject = ((DistanceType) super.clone());
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
        final PropertyTree geom1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom1"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geom1PropertyTree!= null):((geom1PropertyTree == null)||(!geom1PropertyTree.isLeaf())))) {
            _newObject.geom1 = this.geom1;
        }
        final PropertyTree geom2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom2"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geom2PropertyTree!= null):((geom2PropertyTree == null)||(!geom2PropertyTree.isLeaf())))) {
            _newObject.geom2 = this.geom2;
        }
        final PropertyTree distancePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("distance"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(distancePropertyTree!= null):((distancePropertyTree == null)||(!distancePropertyTree.isLeaf())))) {
            _newObject.distance = this.distance;
        }
        return _newObject;
    }

    @Override
    public DistanceType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public DistanceType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DistanceType.Builder<_B> _other) {
        _other.name = this.name;
        _other.clazz = this.clazz;
        _other.active = this.active;
        _other.solimp = this.solimp;
        _other.solref = this.solref;
        _other.geom1 = this.geom1;
        _other.geom2 = this.geom2;
        _other.distance = this.distance;
    }

    public<_B >DistanceType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DistanceType.Builder<_B>(_parentBuilder, this, true);
    }

    public DistanceType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DistanceType.Builder<Void> builder() {
        return new DistanceType.Builder<Void>(null, null, false);
    }

    public static<_B >DistanceType.Builder<_B> copyOf(final DistanceType _other) {
        final DistanceType.Builder<_B> _newBuilder = new DistanceType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DistanceType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
        final PropertyTree geom1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom1"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geom1PropertyTree!= null):((geom1PropertyTree == null)||(!geom1PropertyTree.isLeaf())))) {
            _other.geom1 = this.geom1;
        }
        final PropertyTree geom2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom2"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geom2PropertyTree!= null):((geom2PropertyTree == null)||(!geom2PropertyTree.isLeaf())))) {
            _other.geom2 = this.geom2;
        }
        final PropertyTree distancePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("distance"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(distancePropertyTree!= null):((distancePropertyTree == null)||(!distancePropertyTree.isLeaf())))) {
            _other.distance = this.distance;
        }
    }

    public<_B >DistanceType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DistanceType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DistanceType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DistanceType.Builder<_B> copyOf(final DistanceType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DistanceType.Builder<_B> _newBuilder = new DistanceType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DistanceType.Builder<Void> copyExcept(final DistanceType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DistanceType.Builder<Void> copyOnly(final DistanceType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public DistanceType visit(final PropertyVisitor _visitor_) {
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
        private String geom1;
        private String geom2;
        private BigDecimal distance;

        public Builder(final _B _parentBuilder, final DistanceType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.name = _other.name;
                this.clazz = _other.clazz;
                this.active = _other.active;
                this.solimp = _other.solimp;
                this.solref = _other.solref;
                this.geom1 = _other.geom1;
                this.geom2 = _other.geom2;
                this.distance = _other.distance;
            }
        }

        public Builder(final _B _parentBuilder, final DistanceType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
                final PropertyTree geom1PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom1"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geom1PropertyTree!= null):((geom1PropertyTree == null)||(!geom1PropertyTree.isLeaf())))) {
                    this.geom1 = _other.geom1;
                }
                final PropertyTree geom2PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("geom2"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(geom2PropertyTree!= null):((geom2PropertyTree == null)||(!geom2PropertyTree.isLeaf())))) {
                    this.geom2 = _other.geom2;
                }
                final PropertyTree distancePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("distance"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(distancePropertyTree!= null):((distancePropertyTree == null)||(!distancePropertyTree.isLeaf())))) {
                    this.distance = _other.distance;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends DistanceType >_P init(final _P _product) {
            _product.name = this.name;
            _product.clazz = this.clazz;
            _product.active = this.active;
            _product.solimp = this.solimp;
            _product.solref = this.solref;
            _product.geom1 = this.geom1;
            _product.geom2 = this.geom2;
            _product.distance = this.distance;
            return _product;
        }

        /**
         * Sets the new value of "name" (any previous value will be replaced)
         * 
         * @param name
         *     New value of the "name" property.
         */
        public DistanceType.Builder<_B> withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the new value of "clazz" (any previous value will be replaced)
         * 
         * @param clazz
         *     New value of the "clazz" property.
         */
        public DistanceType.Builder<_B> withClazz(final String clazz) {
            this.clazz = clazz;
            return this;
        }

        /**
         * Sets the new value of "active" (any previous value will be replaced)
         * 
         * @param active
         *     New value of the "active" property.
         */
        public DistanceType.Builder<_B> withActive(final Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * Sets the new value of "solimp" (any previous value will be replaced)
         * 
         * @param solimp
         *     New value of the "solimp" property.
         */
        public DistanceType.Builder<_B> withSolimp(final String solimp) {
            this.solimp = solimp;
            return this;
        }

        /**
         * Sets the new value of "solref" (any previous value will be replaced)
         * 
         * @param solref
         *     New value of the "solref" property.
         */
        public DistanceType.Builder<_B> withSolref(final String solref) {
            this.solref = solref;
            return this;
        }

        /**
         * Sets the new value of "geom1" (any previous value will be replaced)
         * 
         * @param geom1
         *     New value of the "geom1" property.
         */
        public DistanceType.Builder<_B> withGeom1(final String geom1) {
            this.geom1 = geom1;
            return this;
        }

        /**
         * Sets the new value of "geom2" (any previous value will be replaced)
         * 
         * @param geom2
         *     New value of the "geom2" property.
         */
        public DistanceType.Builder<_B> withGeom2(final String geom2) {
            this.geom2 = geom2;
            return this;
        }

        /**
         * Sets the new value of "distance" (any previous value will be replaced)
         * 
         * @param distance
         *     New value of the "distance" property.
         */
        public DistanceType.Builder<_B> withDistance(final BigDecimal distance) {
            this.distance = distance;
            return this;
        }

        @Override
        public DistanceType build() {
            return this.init(new DistanceType());
        }

        public DistanceType.Builder<_B> copyOf(final DistanceType _other) {
            _other.copyTo(this);
            return this;
        }

        public DistanceType.Builder<_B> copyOf(final DistanceType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String NAME = "name";
        public final static transient String CLAZZ = "clazz";
        public final static transient String ACTIVE = "active";
        public final static transient String SOLIMP = "solimp";
        public final static transient String SOLREF = "solref";
        public final static transient String GEOM_1 = "geom1";
        public final static transient String GEOM_2 = "geom2";
        public final static transient String DISTANCE = "distance";

    }

    public static class Select
        extends DistanceType.Selector<DistanceType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DistanceType.Select _root() {
            return new DistanceType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> clazz = null;
        private com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> active = null;
        private com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> solimp = null;
        private com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> solref = null;
        private com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> geom1 = null;
        private com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> geom2 = null;
        private com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> distance = null;

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
            if (this.geom1 != null) {
                products.put("geom1", this.geom1 .init());
            }
            if (this.geom2 != null) {
                products.put("geom2", this.geom2 .init());
            }
            if (this.distance!= null) {
                products.put("distance", this.distance.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> clazz() {
            return ((this.clazz == null)?this.clazz = new com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>>(this._root, this, "clazz"):this.clazz);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> active() {
            return ((this.active == null)?this.active = new com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>>(this._root, this, "active"):this.active);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> solimp() {
            return ((this.solimp == null)?this.solimp = new com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>>(this._root, this, "solimp"):this.solimp);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> solref() {
            return ((this.solref == null)?this.solref = new com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>>(this._root, this, "solref"):this.solref);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> geom1() {
            return ((this.geom1 == null)?this.geom1 = new com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>>(this._root, this, "geom1"):this.geom1);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> geom2() {
            return ((this.geom2 == null)?this.geom2 = new com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>>(this._root, this, "geom2"):this.geom2);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>> distance() {
            return ((this.distance == null)?this.distance = new com.kscs.util.jaxb.Selector<TRoot, DistanceType.Selector<TRoot, TParent>>(this._root, this, "distance"):this.distance);
        }

    }

}
