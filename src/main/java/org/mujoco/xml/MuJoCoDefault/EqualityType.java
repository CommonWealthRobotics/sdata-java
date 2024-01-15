//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 10:23:33 PM EST 
//


package org.mujoco.xml.MuJoCoDefault;

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
 * <p>Java class for equalityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equalityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="solimp" type="{attributeTypes}solimpType" default="0.9 0.95 0.001 0.5 2" /&gt;
 *       &lt;attribute name="solref" type="{attributeTypes}twoRealsType" default="0.02 1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equalityType")
public class EqualityType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "active")
    protected Boolean active;
    @XmlAttribute(name = "solimp")
    protected String solimp;
    @XmlAttribute(name = "solref")
    protected String solref;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public EqualityType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a EqualityType copying the state of another EqualityType
     * 
     * @param _other
     *     The original EqualityType from which to copy state.
     */
    public EqualityType(final EqualityType _other) {
        this.active = _other.active;
        this.solimp = _other.solimp;
        this.solref = _other.solref;
    }

    /**
     * Instantiates a EqualityType copying the state of another EqualityType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original EqualityType from which to copy state.
     */
    public EqualityType(final EqualityType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public EqualityType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public EqualityType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
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

    @Override
    public EqualityType clone() {
        final EqualityType _newObject;
        try {
            _newObject = ((EqualityType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public EqualityType createCopy() {
        final EqualityType _newObject;
        try {
            _newObject = ((EqualityType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.active = this.active;
        _newObject.solimp = this.solimp;
        _newObject.solref = this.solref;
        return _newObject;
    }

    @Override
    public EqualityType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EqualityType _newObject;
        try {
            _newObject = ((EqualityType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
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
        return _newObject;
    }

    @Override
    public EqualityType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public EqualityType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EqualityType.Builder<_B> _other) {
        _other.active = this.active;
        _other.solimp = this.solimp;
        _other.solref = this.solref;
    }

    public<_B >EqualityType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EqualityType.Builder<_B>(_parentBuilder, this, true);
    }

    public EqualityType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EqualityType.Builder<Void> builder() {
        return new EqualityType.Builder<Void>(null, null, false);
    }

    public static<_B >EqualityType.Builder<_B> copyOf(final EqualityType _other) {
        final EqualityType.Builder<_B> _newBuilder = new EqualityType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EqualityType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
    }

    public<_B >EqualityType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EqualityType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public EqualityType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EqualityType.Builder<_B> copyOf(final EqualityType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EqualityType.Builder<_B> _newBuilder = new EqualityType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EqualityType.Builder<Void> copyExcept(final EqualityType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EqualityType.Builder<Void> copyOnly(final EqualityType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public EqualityType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final EqualityType _storedValue;
        private Boolean active;
        private String solimp;
        private String solref;

        public Builder(final _B _parentBuilder, final EqualityType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.active = _other.active;
                    this.solimp = _other.solimp;
                    this.solref = _other.solref;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final EqualityType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
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

        protected<_P extends EqualityType >_P init(final _P _product) {
            _product.active = this.active;
            _product.solimp = this.solimp;
            _product.solref = this.solref;
            return _product;
        }

        /**
         * Sets the new value of "active" (any previous value will be replaced)
         * 
         * @param active
         *     New value of the "active" property.
         */
        public EqualityType.Builder<_B> withActive(final Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * Sets the new value of "solimp" (any previous value will be replaced)
         * 
         * @param solimp
         *     New value of the "solimp" property.
         */
        public EqualityType.Builder<_B> withSolimp(final String solimp) {
            this.solimp = solimp;
            return this;
        }

        /**
         * Sets the new value of "solref" (any previous value will be replaced)
         * 
         * @param solref
         *     New value of the "solref" property.
         */
        public EqualityType.Builder<_B> withSolref(final String solref) {
            this.solref = solref;
            return this;
        }

        @Override
        public EqualityType build() {
            if (_storedValue == null) {
                return this.init(new EqualityType());
            } else {
                return ((EqualityType) _storedValue);
            }
        }

        public EqualityType.Builder<_B> copyOf(final EqualityType _other) {
            _other.copyTo(this);
            return this;
        }

        public EqualityType.Builder<_B> copyOf(final EqualityType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String ACTIVE = "active";
        public final static transient String SOLIMP = "solimp";
        public final static transient String SOLREF = "solref";

    }

    public static class Select
        extends EqualityType.Selector<EqualityType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EqualityType.Select _root() {
            return new EqualityType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EqualityType.Selector<TRoot, TParent>> active = null;
        private com.kscs.util.jaxb.Selector<TRoot, EqualityType.Selector<TRoot, TParent>> solimp = null;
        private com.kscs.util.jaxb.Selector<TRoot, EqualityType.Selector<TRoot, TParent>> solref = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.active!= null) {
                products.put("active", this.active.init());
            }
            if (this.solimp!= null) {
                products.put("solimp", this.solimp.init());
            }
            if (this.solref!= null) {
                products.put("solref", this.solref.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EqualityType.Selector<TRoot, TParent>> active() {
            return ((this.active == null)?this.active = new com.kscs.util.jaxb.Selector<TRoot, EqualityType.Selector<TRoot, TParent>>(this._root, this, "active"):this.active);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EqualityType.Selector<TRoot, TParent>> solimp() {
            return ((this.solimp == null)?this.solimp = new com.kscs.util.jaxb.Selector<TRoot, EqualityType.Selector<TRoot, TParent>>(this._root, this, "solimp"):this.solimp);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EqualityType.Selector<TRoot, TParent>> solref() {
            return ((this.solref == null)?this.solref = new com.kscs.util.jaxb.Selector<TRoot, EqualityType.Selector<TRoot, TParent>>(this._root, this, "solref"):this.solref);
        }

    }

}
