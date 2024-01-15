//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 10:23:33 PM EST 
//


package org.mujoco.xml.MuJoCoDefault;

import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
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
 * <p>Java class for velocityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="velocityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{default}motorType"&gt;
 *       &lt;attribute name="kv" type="{http://www.w3.org/2001/XMLSchema}decimal" default="1" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "velocityType")
public class VelocityType
    extends MotorType
    implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "kv")
    protected BigDecimal kv;

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public VelocityType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a VelocityType copying the state of another VelocityType
     * 
     * @param _other
     *     The original VelocityType from which to copy state.
     */
    public VelocityType(final VelocityType _other) {
        super(_other);
        this.kv = _other.kv;
    }

    /**
     * Instantiates a VelocityType copying the state of another VelocityType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original VelocityType from which to copy state.
     */
    public VelocityType(final VelocityType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree kvPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("kv"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(kvPropertyTree!= null):((kvPropertyTree == null)||(!kvPropertyTree.isLeaf())))) {
            this.kv = _other.kv;
        }
    }

    /**
     * Gets the value of the kv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKv() {
        if (kv == null) {
            return new BigDecimal("1");
        } else {
            return kv;
        }
    }

    @Override
    public VelocityType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    @Override
    public VelocityType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setKv(final BigDecimal value) {
        final BigDecimal __oldValue = this.kv;
        try {
            this.vetoableChange__Support.fireVetoableChange("kv", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.kv = value;
        this.propertyChange__Support.firePropertyChange("kv", __oldValue, value);
    }

    @Override
    public VelocityType clone() {
        final VelocityType _newObject;
        _newObject = ((VelocityType) super.clone());
        return _newObject;
    }

    @Override
    public VelocityType createCopy() {
        final VelocityType _newObject = ((VelocityType) super.createCopy());
        _newObject.kv = this.kv;
        return _newObject;
    }

    @Override
    public VelocityType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final VelocityType _newObject = ((VelocityType) super.createCopy(_propertyTree, _propertyTreeUse));
        final PropertyTree kvPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("kv"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(kvPropertyTree!= null):((kvPropertyTree == null)||(!kvPropertyTree.isLeaf())))) {
            _newObject.kv = this.kv;
        }
        return _newObject;
    }

    @Override
    public VelocityType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public VelocityType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final VelocityType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.kv = this.kv;
    }

    @Override
    public<_B >VelocityType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new VelocityType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public VelocityType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static VelocityType.Builder<Void> builder() {
        return new VelocityType.Builder<Void>(null, null, false);
    }

    public static<_B >VelocityType.Builder<_B> copyOf(final MotorType _other) {
        final VelocityType.Builder<_B> _newBuilder = new VelocityType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >VelocityType.Builder<_B> copyOf(final VelocityType _other) {
        final VelocityType.Builder<_B> _newBuilder = new VelocityType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final VelocityType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree kvPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("kv"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(kvPropertyTree!= null):((kvPropertyTree == null)||(!kvPropertyTree.isLeaf())))) {
            _other.kv = this.kv;
        }
    }

    @Override
    public<_B >VelocityType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new VelocityType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public VelocityType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >VelocityType.Builder<_B> copyOf(final MotorType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final VelocityType.Builder<_B> _newBuilder = new VelocityType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >VelocityType.Builder<_B> copyOf(final VelocityType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final VelocityType.Builder<_B> _newBuilder = new VelocityType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static VelocityType.Builder<Void> copyExcept(final MotorType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static VelocityType.Builder<Void> copyExcept(final VelocityType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static VelocityType.Builder<Void> copyOnly(final MotorType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static VelocityType.Builder<Void> copyOnly(final VelocityType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public VelocityType visit(final PropertyVisitor _visitor_) {
        super.visit(_visitor_);
        return this;
    }

    public static class Builder<_B >
        extends MotorType.Builder<_B>
        implements Buildable
    {

        private BigDecimal kv;

        public Builder(final _B _parentBuilder, final VelocityType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.kv = _other.kv;
            }
        }

        public Builder(final _B _parentBuilder, final VelocityType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree kvPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("kv"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(kvPropertyTree!= null):((kvPropertyTree == null)||(!kvPropertyTree.isLeaf())))) {
                    this.kv = _other.kv;
                }
            }
        }

        protected<_P extends VelocityType >_P init(final _P _product) {
            _product.kv = this.kv;
            return super.init(_product);
        }

        /**
         * Sets the new value of "kv" (any previous value will be replaced)
         * 
         * @param kv
         *     New value of the "kv" property.
         */
        public VelocityType.Builder<_B> withKv(final BigDecimal kv) {
            this.kv = kv;
            return this;
        }

        /**
         * Sets the new value of "group" (any previous value will be replaced)
         * 
         * @param group
         *     New value of the "group" property.
         */
        @Override
        public VelocityType.Builder<_B> withGroup(final Integer group) {
            super.withGroup(group);
            return this;
        }

        /**
         * Sets the new value of "ctrllimited" (any previous value will be replaced)
         * 
         * @param ctrllimited
         *     New value of the "ctrllimited" property.
         */
        @Override
        public VelocityType.Builder<_B> withCtrllimited(final Boolean ctrllimited) {
            super.withCtrllimited(ctrllimited);
            return this;
        }

        /**
         * Sets the new value of "forcelimited" (any previous value will be replaced)
         * 
         * @param forcelimited
         *     New value of the "forcelimited" property.
         */
        @Override
        public VelocityType.Builder<_B> withForcelimited(final Boolean forcelimited) {
            super.withForcelimited(forcelimited);
            return this;
        }

        /**
         * Sets the new value of "ctrlrange" (any previous value will be replaced)
         * 
         * @param ctrlrange
         *     New value of the "ctrlrange" property.
         */
        @Override
        public VelocityType.Builder<_B> withCtrlrange(final String ctrlrange) {
            super.withCtrlrange(ctrlrange);
            return this;
        }

        /**
         * Sets the new value of "forcerange" (any previous value will be replaced)
         * 
         * @param forcerange
         *     New value of the "forcerange" property.
         */
        @Override
        public VelocityType.Builder<_B> withForcerange(final String forcerange) {
            super.withForcerange(forcerange);
            return this;
        }

        /**
         * Sets the new value of "lengthrange" (any previous value will be replaced)
         * 
         * @param lengthrange
         *     New value of the "lengthrange" property.
         */
        @Override
        public VelocityType.Builder<_B> withLengthrange(final String lengthrange) {
            super.withLengthrange(lengthrange);
            return this;
        }

        /**
         * Sets the new value of "gear" (any previous value will be replaced)
         * 
         * @param gear
         *     New value of the "gear" property.
         */
        @Override
        public VelocityType.Builder<_B> withGear(final String gear) {
            super.withGear(gear);
            return this;
        }

        /**
         * Sets the new value of "cranklength" (any previous value will be replaced)
         * 
         * @param cranklength
         *     New value of the "cranklength" property.
         */
        @Override
        public VelocityType.Builder<_B> withCranklength(final BigDecimal cranklength) {
            super.withCranklength(cranklength);
            return this;
        }

        /**
         * Sets the new value of "user" (any previous value will be replaced)
         * 
         * @param user
         *     New value of the "user" property.
         */
        @Override
        public VelocityType.Builder<_B> withUser(final String user) {
            super.withUser(user);
            return this;
        }

        @Override
        public VelocityType build() {
            if (_storedValue == null) {
                return this.init(new VelocityType());
            } else {
                return ((VelocityType) _storedValue);
            }
        }

        public VelocityType.Builder<_B> copyOf(final VelocityType _other) {
            _other.copyTo(this);
            return this;
        }

        public VelocityType.Builder<_B> copyOf(final VelocityType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String KV = "kv";

    }

    public static class Select
        extends VelocityType.Selector<VelocityType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static VelocityType.Select _root() {
            return new VelocityType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends MotorType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, VelocityType.Selector<TRoot, TParent>> kv = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.kv!= null) {
                products.put("kv", this.kv.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, VelocityType.Selector<TRoot, TParent>> kv() {
            return ((this.kv == null)?this.kv = new com.kscs.util.jaxb.Selector<TRoot, VelocityType.Selector<TRoot, TParent>>(this._root, this, "kv"):this.kv);
        }

    }

}
