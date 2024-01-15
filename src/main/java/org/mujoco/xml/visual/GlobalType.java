//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 10:23:33 PM EST 
//


package org.mujoco.xml.visual;

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
 * <p>Java class for globalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="globalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="fovy" type="{http://www.w3.org/2001/XMLSchema}decimal" default="45" /&gt;
 *       &lt;attribute name="ipd" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0.068" /&gt;
 *       &lt;attribute name="linewidth" type="{http://www.w3.org/2001/XMLSchema}decimal" default="1" /&gt;
 *       &lt;attribute name="glow" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0.3" /&gt;
 *       &lt;attribute name="offwidth" type="{http://www.w3.org/2001/XMLSchema}int" default="640" /&gt;
 *       &lt;attribute name="offheight" type="{http://www.w3.org/2001/XMLSchema}int" default="480" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "globalType")
public class GlobalType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "fovy")
    protected BigDecimal fovy;
    @XmlAttribute(name = "ipd")
    protected BigDecimal ipd;
    @XmlAttribute(name = "linewidth")
    protected BigDecimal linewidth;
    @XmlAttribute(name = "glow")
    protected BigDecimal glow;
    @XmlAttribute(name = "offwidth")
    protected Integer offwidth;
    @XmlAttribute(name = "offheight")
    protected Integer offheight;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public GlobalType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a GlobalType copying the state of another GlobalType
     * 
     * @param _other
     *     The original GlobalType from which to copy state.
     */
    public GlobalType(final GlobalType _other) {
        this.fovy = _other.fovy;
        this.ipd = _other.ipd;
        this.linewidth = _other.linewidth;
        this.glow = _other.glow;
        this.offwidth = _other.offwidth;
        this.offheight = _other.offheight;
    }

    /**
     * Instantiates a GlobalType copying the state of another GlobalType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original GlobalType from which to copy state.
     */
    public GlobalType(final GlobalType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree fovyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fovy"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fovyPropertyTree!= null):((fovyPropertyTree == null)||(!fovyPropertyTree.isLeaf())))) {
            this.fovy = _other.fovy;
        }
        final PropertyTree ipdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("ipd"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(ipdPropertyTree!= null):((ipdPropertyTree == null)||(!ipdPropertyTree.isLeaf())))) {
            this.ipd = _other.ipd;
        }
        final PropertyTree linewidthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("linewidth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(linewidthPropertyTree!= null):((linewidthPropertyTree == null)||(!linewidthPropertyTree.isLeaf())))) {
            this.linewidth = _other.linewidth;
        }
        final PropertyTree glowPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("glow"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(glowPropertyTree!= null):((glowPropertyTree == null)||(!glowPropertyTree.isLeaf())))) {
            this.glow = _other.glow;
        }
        final PropertyTree offwidthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offwidth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offwidthPropertyTree!= null):((offwidthPropertyTree == null)||(!offwidthPropertyTree.isLeaf())))) {
            this.offwidth = _other.offwidth;
        }
        final PropertyTree offheightPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offheight"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offheightPropertyTree!= null):((offheightPropertyTree == null)||(!offheightPropertyTree.isLeaf())))) {
            this.offheight = _other.offheight;
        }
    }

    /**
     * Gets the value of the fovy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFovy() {
        if (fovy == null) {
            return new BigDecimal("45");
        } else {
            return fovy;
        }
    }

    /**
     * Gets the value of the ipd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIpd() {
        if (ipd == null) {
            return new BigDecimal("0.068");
        } else {
            return ipd;
        }
    }

    /**
     * Gets the value of the linewidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLinewidth() {
        if (linewidth == null) {
            return new BigDecimal("1");
        } else {
            return linewidth;
        }
    }

    /**
     * Gets the value of the glow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGlow() {
        if (glow == null) {
            return new BigDecimal("0.3");
        } else {
            return glow;
        }
    }

    /**
     * Gets the value of the offwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getOffwidth() {
        if (offwidth == null) {
            return  640;
        } else {
            return offwidth;
        }
    }

    /**
     * Gets the value of the offheight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getOffheight() {
        if (offheight == null) {
            return  480;
        } else {
            return offheight;
        }
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public GlobalType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public GlobalType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setFovy(final BigDecimal value) {
        final BigDecimal __oldValue = this.fovy;
        try {
            this.vetoableChange__Support.fireVetoableChange("fovy", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.fovy = value;
        this.propertyChange__Support.firePropertyChange("fovy", __oldValue, value);
    }

    public void setIpd(final BigDecimal value) {
        final BigDecimal __oldValue = this.ipd;
        try {
            this.vetoableChange__Support.fireVetoableChange("ipd", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.ipd = value;
        this.propertyChange__Support.firePropertyChange("ipd", __oldValue, value);
    }

    public void setLinewidth(final BigDecimal value) {
        final BigDecimal __oldValue = this.linewidth;
        try {
            this.vetoableChange__Support.fireVetoableChange("linewidth", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.linewidth = value;
        this.propertyChange__Support.firePropertyChange("linewidth", __oldValue, value);
    }

    public void setGlow(final BigDecimal value) {
        final BigDecimal __oldValue = this.glow;
        try {
            this.vetoableChange__Support.fireVetoableChange("glow", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.glow = value;
        this.propertyChange__Support.firePropertyChange("glow", __oldValue, value);
    }

    public void setOffwidth(final Integer value) {
        final Integer __oldValue = this.offwidth;
        try {
            this.vetoableChange__Support.fireVetoableChange("offwidth", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.offwidth = value;
        this.propertyChange__Support.firePropertyChange("offwidth", __oldValue, value);
    }

    public void setOffheight(final Integer value) {
        final Integer __oldValue = this.offheight;
        try {
            this.vetoableChange__Support.fireVetoableChange("offheight", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.offheight = value;
        this.propertyChange__Support.firePropertyChange("offheight", __oldValue, value);
    }

    @Override
    public GlobalType clone() {
        final GlobalType _newObject;
        try {
            _newObject = ((GlobalType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public GlobalType createCopy() {
        final GlobalType _newObject;
        try {
            _newObject = ((GlobalType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.fovy = this.fovy;
        _newObject.ipd = this.ipd;
        _newObject.linewidth = this.linewidth;
        _newObject.glow = this.glow;
        _newObject.offwidth = this.offwidth;
        _newObject.offheight = this.offheight;
        return _newObject;
    }

    @Override
    public GlobalType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final GlobalType _newObject;
        try {
            _newObject = ((GlobalType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree fovyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fovy"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fovyPropertyTree!= null):((fovyPropertyTree == null)||(!fovyPropertyTree.isLeaf())))) {
            _newObject.fovy = this.fovy;
        }
        final PropertyTree ipdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("ipd"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(ipdPropertyTree!= null):((ipdPropertyTree == null)||(!ipdPropertyTree.isLeaf())))) {
            _newObject.ipd = this.ipd;
        }
        final PropertyTree linewidthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("linewidth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(linewidthPropertyTree!= null):((linewidthPropertyTree == null)||(!linewidthPropertyTree.isLeaf())))) {
            _newObject.linewidth = this.linewidth;
        }
        final PropertyTree glowPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("glow"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(glowPropertyTree!= null):((glowPropertyTree == null)||(!glowPropertyTree.isLeaf())))) {
            _newObject.glow = this.glow;
        }
        final PropertyTree offwidthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offwidth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offwidthPropertyTree!= null):((offwidthPropertyTree == null)||(!offwidthPropertyTree.isLeaf())))) {
            _newObject.offwidth = this.offwidth;
        }
        final PropertyTree offheightPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offheight"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offheightPropertyTree!= null):((offheightPropertyTree == null)||(!offheightPropertyTree.isLeaf())))) {
            _newObject.offheight = this.offheight;
        }
        return _newObject;
    }

    @Override
    public GlobalType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public GlobalType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final GlobalType.Builder<_B> _other) {
        _other.fovy = this.fovy;
        _other.ipd = this.ipd;
        _other.linewidth = this.linewidth;
        _other.glow = this.glow;
        _other.offwidth = this.offwidth;
        _other.offheight = this.offheight;
    }

    public<_B >GlobalType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new GlobalType.Builder<_B>(_parentBuilder, this, true);
    }

    public GlobalType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static GlobalType.Builder<Void> builder() {
        return new GlobalType.Builder<Void>(null, null, false);
    }

    public static<_B >GlobalType.Builder<_B> copyOf(final GlobalType _other) {
        final GlobalType.Builder<_B> _newBuilder = new GlobalType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final GlobalType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree fovyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fovy"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fovyPropertyTree!= null):((fovyPropertyTree == null)||(!fovyPropertyTree.isLeaf())))) {
            _other.fovy = this.fovy;
        }
        final PropertyTree ipdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("ipd"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(ipdPropertyTree!= null):((ipdPropertyTree == null)||(!ipdPropertyTree.isLeaf())))) {
            _other.ipd = this.ipd;
        }
        final PropertyTree linewidthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("linewidth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(linewidthPropertyTree!= null):((linewidthPropertyTree == null)||(!linewidthPropertyTree.isLeaf())))) {
            _other.linewidth = this.linewidth;
        }
        final PropertyTree glowPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("glow"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(glowPropertyTree!= null):((glowPropertyTree == null)||(!glowPropertyTree.isLeaf())))) {
            _other.glow = this.glow;
        }
        final PropertyTree offwidthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offwidth"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offwidthPropertyTree!= null):((offwidthPropertyTree == null)||(!offwidthPropertyTree.isLeaf())))) {
            _other.offwidth = this.offwidth;
        }
        final PropertyTree offheightPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offheight"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offheightPropertyTree!= null):((offheightPropertyTree == null)||(!offheightPropertyTree.isLeaf())))) {
            _other.offheight = this.offheight;
        }
    }

    public<_B >GlobalType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new GlobalType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public GlobalType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >GlobalType.Builder<_B> copyOf(final GlobalType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final GlobalType.Builder<_B> _newBuilder = new GlobalType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static GlobalType.Builder<Void> copyExcept(final GlobalType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static GlobalType.Builder<Void> copyOnly(final GlobalType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public GlobalType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final GlobalType _storedValue;
        private BigDecimal fovy;
        private BigDecimal ipd;
        private BigDecimal linewidth;
        private BigDecimal glow;
        private Integer offwidth;
        private Integer offheight;

        public Builder(final _B _parentBuilder, final GlobalType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.fovy = _other.fovy;
                    this.ipd = _other.ipd;
                    this.linewidth = _other.linewidth;
                    this.glow = _other.glow;
                    this.offwidth = _other.offwidth;
                    this.offheight = _other.offheight;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final GlobalType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree fovyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fovy"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fovyPropertyTree!= null):((fovyPropertyTree == null)||(!fovyPropertyTree.isLeaf())))) {
                        this.fovy = _other.fovy;
                    }
                    final PropertyTree ipdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("ipd"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(ipdPropertyTree!= null):((ipdPropertyTree == null)||(!ipdPropertyTree.isLeaf())))) {
                        this.ipd = _other.ipd;
                    }
                    final PropertyTree linewidthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("linewidth"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(linewidthPropertyTree!= null):((linewidthPropertyTree == null)||(!linewidthPropertyTree.isLeaf())))) {
                        this.linewidth = _other.linewidth;
                    }
                    final PropertyTree glowPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("glow"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(glowPropertyTree!= null):((glowPropertyTree == null)||(!glowPropertyTree.isLeaf())))) {
                        this.glow = _other.glow;
                    }
                    final PropertyTree offwidthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offwidth"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offwidthPropertyTree!= null):((offwidthPropertyTree == null)||(!offwidthPropertyTree.isLeaf())))) {
                        this.offwidth = _other.offwidth;
                    }
                    final PropertyTree offheightPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offheight"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offheightPropertyTree!= null):((offheightPropertyTree == null)||(!offheightPropertyTree.isLeaf())))) {
                        this.offheight = _other.offheight;
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends GlobalType >_P init(final _P _product) {
            _product.fovy = this.fovy;
            _product.ipd = this.ipd;
            _product.linewidth = this.linewidth;
            _product.glow = this.glow;
            _product.offwidth = this.offwidth;
            _product.offheight = this.offheight;
            return _product;
        }

        /**
         * Sets the new value of "fovy" (any previous value will be replaced)
         * 
         * @param fovy
         *     New value of the "fovy" property.
         */
        public GlobalType.Builder<_B> withFovy(final BigDecimal fovy) {
            this.fovy = fovy;
            return this;
        }

        /**
         * Sets the new value of "ipd" (any previous value will be replaced)
         * 
         * @param ipd
         *     New value of the "ipd" property.
         */
        public GlobalType.Builder<_B> withIpd(final BigDecimal ipd) {
            this.ipd = ipd;
            return this;
        }

        /**
         * Sets the new value of "linewidth" (any previous value will be replaced)
         * 
         * @param linewidth
         *     New value of the "linewidth" property.
         */
        public GlobalType.Builder<_B> withLinewidth(final BigDecimal linewidth) {
            this.linewidth = linewidth;
            return this;
        }

        /**
         * Sets the new value of "glow" (any previous value will be replaced)
         * 
         * @param glow
         *     New value of the "glow" property.
         */
        public GlobalType.Builder<_B> withGlow(final BigDecimal glow) {
            this.glow = glow;
            return this;
        }

        /**
         * Sets the new value of "offwidth" (any previous value will be replaced)
         * 
         * @param offwidth
         *     New value of the "offwidth" property.
         */
        public GlobalType.Builder<_B> withOffwidth(final Integer offwidth) {
            this.offwidth = offwidth;
            return this;
        }

        /**
         * Sets the new value of "offheight" (any previous value will be replaced)
         * 
         * @param offheight
         *     New value of the "offheight" property.
         */
        public GlobalType.Builder<_B> withOffheight(final Integer offheight) {
            this.offheight = offheight;
            return this;
        }

        @Override
        public GlobalType build() {
            if (_storedValue == null) {
                return this.init(new GlobalType());
            } else {
                return ((GlobalType) _storedValue);
            }
        }

        public GlobalType.Builder<_B> copyOf(final GlobalType _other) {
            _other.copyTo(this);
            return this;
        }

        public GlobalType.Builder<_B> copyOf(final GlobalType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String FOVY = "fovy";
        public final static transient String IPD = "ipd";
        public final static transient String LINEWIDTH = "linewidth";
        public final static transient String GLOW = "glow";
        public final static transient String OFFWIDTH = "offwidth";
        public final static transient String OFFHEIGHT = "offheight";

    }

    public static class Select
        extends GlobalType.Selector<GlobalType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static GlobalType.Select _root() {
            return new GlobalType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> fovy = null;
        private com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> ipd = null;
        private com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> linewidth = null;
        private com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> glow = null;
        private com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> offwidth = null;
        private com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> offheight = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.fovy!= null) {
                products.put("fovy", this.fovy.init());
            }
            if (this.ipd!= null) {
                products.put("ipd", this.ipd.init());
            }
            if (this.linewidth!= null) {
                products.put("linewidth", this.linewidth.init());
            }
            if (this.glow!= null) {
                products.put("glow", this.glow.init());
            }
            if (this.offwidth!= null) {
                products.put("offwidth", this.offwidth.init());
            }
            if (this.offheight!= null) {
                products.put("offheight", this.offheight.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> fovy() {
            return ((this.fovy == null)?this.fovy = new com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>>(this._root, this, "fovy"):this.fovy);
        }

        public com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> ipd() {
            return ((this.ipd == null)?this.ipd = new com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>>(this._root, this, "ipd"):this.ipd);
        }

        public com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> linewidth() {
            return ((this.linewidth == null)?this.linewidth = new com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>>(this._root, this, "linewidth"):this.linewidth);
        }

        public com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> glow() {
            return ((this.glow == null)?this.glow = new com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>>(this._root, this, "glow"):this.glow);
        }

        public com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> offwidth() {
            return ((this.offwidth == null)?this.offwidth = new com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>>(this._root, this, "offwidth"):this.offwidth);
        }

        public com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>> offheight() {
            return ((this.offheight == null)?this.offheight = new com.kscs.util.jaxb.Selector<TRoot, GlobalType.Selector<TRoot, TParent>>(this._root, this, "offheight"):this.offheight);
        }

    }

}
