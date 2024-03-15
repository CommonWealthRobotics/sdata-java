//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.mujoco.xml.visual;

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
 * <p>Java class for qualityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qualityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="shadowsize" type="{http://www.w3.org/2001/XMLSchema}int" default="1024" /&gt;
 *       &lt;attribute name="offsamples" type="{http://www.w3.org/2001/XMLSchema}int" default="4" /&gt;
 *       &lt;attribute name="numslices" type="{http://www.w3.org/2001/XMLSchema}int" default="28" /&gt;
 *       &lt;attribute name="numstacks" type="{http://www.w3.org/2001/XMLSchema}int" default="16" /&gt;
 *       &lt;attribute name="numquads" type="{http://www.w3.org/2001/XMLSchema}int" default="4" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qualityType")
public class QualityType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "shadowsize")
    protected Integer shadowsize;
    @XmlAttribute(name = "offsamples")
    protected Integer offsamples;
    @XmlAttribute(name = "numslices")
    protected Integer numslices;
    @XmlAttribute(name = "numstacks")
    protected Integer numstacks;
    @XmlAttribute(name = "numquads")
    protected Integer numquads;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public QualityType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a QualityType copying the state of another QualityType
     * 
     * @param _other
     *     The original QualityType from which to copy state.
     */
    public QualityType(final QualityType _other) {
        this.shadowsize = _other.shadowsize;
        this.offsamples = _other.offsamples;
        this.numslices = _other.numslices;
        this.numstacks = _other.numstacks;
        this.numquads = _other.numquads;
    }

    /**
     * Instantiates a QualityType copying the state of another QualityType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original QualityType from which to copy state.
     */
    public QualityType(final QualityType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree shadowsizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("shadowsize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(shadowsizePropertyTree!= null):((shadowsizePropertyTree == null)||(!shadowsizePropertyTree.isLeaf())))) {
            this.shadowsize = _other.shadowsize;
        }
        final PropertyTree offsamplesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offsamples"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offsamplesPropertyTree!= null):((offsamplesPropertyTree == null)||(!offsamplesPropertyTree.isLeaf())))) {
            this.offsamples = _other.offsamples;
        }
        final PropertyTree numslicesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numslices"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numslicesPropertyTree!= null):((numslicesPropertyTree == null)||(!numslicesPropertyTree.isLeaf())))) {
            this.numslices = _other.numslices;
        }
        final PropertyTree numstacksPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numstacks"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numstacksPropertyTree!= null):((numstacksPropertyTree == null)||(!numstacksPropertyTree.isLeaf())))) {
            this.numstacks = _other.numstacks;
        }
        final PropertyTree numquadsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numquads"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numquadsPropertyTree!= null):((numquadsPropertyTree == null)||(!numquadsPropertyTree.isLeaf())))) {
            this.numquads = _other.numquads;
        }
    }

    /**
     * Gets the value of the shadowsize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getShadowsize() {
        if (shadowsize == null) {
            return  1024;
        } else {
            return shadowsize;
        }
    }

    /**
     * Gets the value of the offsamples property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getOffsamples() {
        if (offsamples == null) {
            return  4;
        } else {
            return offsamples;
        }
    }

    /**
     * Gets the value of the numslices property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumslices() {
        if (numslices == null) {
            return  28;
        } else {
            return numslices;
        }
    }

    /**
     * Gets the value of the numstacks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumstacks() {
        if (numstacks == null) {
            return  16;
        } else {
            return numstacks;
        }
    }

    /**
     * Gets the value of the numquads property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumquads() {
        if (numquads == null) {
            return  4;
        } else {
            return numquads;
        }
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public QualityType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public QualityType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setShadowsize(final Integer value) {
        final Integer __oldValue = this.shadowsize;
        try {
            this.vetoableChange__Support.fireVetoableChange("shadowsize", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.shadowsize = value;
        this.propertyChange__Support.firePropertyChange("shadowsize", __oldValue, value);
    }

    public void setOffsamples(final Integer value) {
        final Integer __oldValue = this.offsamples;
        try {
            this.vetoableChange__Support.fireVetoableChange("offsamples", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.offsamples = value;
        this.propertyChange__Support.firePropertyChange("offsamples", __oldValue, value);
    }

    public void setNumslices(final Integer value) {
        final Integer __oldValue = this.numslices;
        try {
            this.vetoableChange__Support.fireVetoableChange("numslices", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.numslices = value;
        this.propertyChange__Support.firePropertyChange("numslices", __oldValue, value);
    }

    public void setNumstacks(final Integer value) {
        final Integer __oldValue = this.numstacks;
        try {
            this.vetoableChange__Support.fireVetoableChange("numstacks", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.numstacks = value;
        this.propertyChange__Support.firePropertyChange("numstacks", __oldValue, value);
    }

    public void setNumquads(final Integer value) {
        final Integer __oldValue = this.numquads;
        try {
            this.vetoableChange__Support.fireVetoableChange("numquads", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.numquads = value;
        this.propertyChange__Support.firePropertyChange("numquads", __oldValue, value);
    }

    @Override
    public QualityType clone() {
        final QualityType _newObject;
        try {
            _newObject = ((QualityType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public QualityType createCopy() {
        final QualityType _newObject;
        try {
            _newObject = ((QualityType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.shadowsize = this.shadowsize;
        _newObject.offsamples = this.offsamples;
        _newObject.numslices = this.numslices;
        _newObject.numstacks = this.numstacks;
        _newObject.numquads = this.numquads;
        return _newObject;
    }

    @Override
    public QualityType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final QualityType _newObject;
        try {
            _newObject = ((QualityType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree shadowsizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("shadowsize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(shadowsizePropertyTree!= null):((shadowsizePropertyTree == null)||(!shadowsizePropertyTree.isLeaf())))) {
            _newObject.shadowsize = this.shadowsize;
        }
        final PropertyTree offsamplesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offsamples"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offsamplesPropertyTree!= null):((offsamplesPropertyTree == null)||(!offsamplesPropertyTree.isLeaf())))) {
            _newObject.offsamples = this.offsamples;
        }
        final PropertyTree numslicesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numslices"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numslicesPropertyTree!= null):((numslicesPropertyTree == null)||(!numslicesPropertyTree.isLeaf())))) {
            _newObject.numslices = this.numslices;
        }
        final PropertyTree numstacksPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numstacks"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numstacksPropertyTree!= null):((numstacksPropertyTree == null)||(!numstacksPropertyTree.isLeaf())))) {
            _newObject.numstacks = this.numstacks;
        }
        final PropertyTree numquadsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numquads"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numquadsPropertyTree!= null):((numquadsPropertyTree == null)||(!numquadsPropertyTree.isLeaf())))) {
            _newObject.numquads = this.numquads;
        }
        return _newObject;
    }

    @Override
    public QualityType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public QualityType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final QualityType.Builder<_B> _other) {
        _other.shadowsize = this.shadowsize;
        _other.offsamples = this.offsamples;
        _other.numslices = this.numslices;
        _other.numstacks = this.numstacks;
        _other.numquads = this.numquads;
    }

    public<_B >QualityType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new QualityType.Builder<_B>(_parentBuilder, this, true);
    }

    public QualityType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static QualityType.Builder<Void> builder() {
        return new QualityType.Builder<Void>(null, null, false);
    }

    public static<_B >QualityType.Builder<_B> copyOf(final QualityType _other) {
        final QualityType.Builder<_B> _newBuilder = new QualityType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final QualityType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree shadowsizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("shadowsize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(shadowsizePropertyTree!= null):((shadowsizePropertyTree == null)||(!shadowsizePropertyTree.isLeaf())))) {
            _other.shadowsize = this.shadowsize;
        }
        final PropertyTree offsamplesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offsamples"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offsamplesPropertyTree!= null):((offsamplesPropertyTree == null)||(!offsamplesPropertyTree.isLeaf())))) {
            _other.offsamples = this.offsamples;
        }
        final PropertyTree numslicesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numslices"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numslicesPropertyTree!= null):((numslicesPropertyTree == null)||(!numslicesPropertyTree.isLeaf())))) {
            _other.numslices = this.numslices;
        }
        final PropertyTree numstacksPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numstacks"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numstacksPropertyTree!= null):((numstacksPropertyTree == null)||(!numstacksPropertyTree.isLeaf())))) {
            _other.numstacks = this.numstacks;
        }
        final PropertyTree numquadsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numquads"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numquadsPropertyTree!= null):((numquadsPropertyTree == null)||(!numquadsPropertyTree.isLeaf())))) {
            _other.numquads = this.numquads;
        }
    }

    public<_B >QualityType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new QualityType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public QualityType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >QualityType.Builder<_B> copyOf(final QualityType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final QualityType.Builder<_B> _newBuilder = new QualityType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static QualityType.Builder<Void> copyExcept(final QualityType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static QualityType.Builder<Void> copyOnly(final QualityType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public QualityType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private Integer shadowsize;
        private Integer offsamples;
        private Integer numslices;
        private Integer numstacks;
        private Integer numquads;

        public Builder(final _B _parentBuilder, final QualityType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.shadowsize = _other.shadowsize;
                this.offsamples = _other.offsamples;
                this.numslices = _other.numslices;
                this.numstacks = _other.numstacks;
                this.numquads = _other.numquads;
            }
        }

        public Builder(final _B _parentBuilder, final QualityType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree shadowsizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("shadowsize"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(shadowsizePropertyTree!= null):((shadowsizePropertyTree == null)||(!shadowsizePropertyTree.isLeaf())))) {
                    this.shadowsize = _other.shadowsize;
                }
                final PropertyTree offsamplesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offsamples"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offsamplesPropertyTree!= null):((offsamplesPropertyTree == null)||(!offsamplesPropertyTree.isLeaf())))) {
                    this.offsamples = _other.offsamples;
                }
                final PropertyTree numslicesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numslices"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numslicesPropertyTree!= null):((numslicesPropertyTree == null)||(!numslicesPropertyTree.isLeaf())))) {
                    this.numslices = _other.numslices;
                }
                final PropertyTree numstacksPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numstacks"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numstacksPropertyTree!= null):((numstacksPropertyTree == null)||(!numstacksPropertyTree.isLeaf())))) {
                    this.numstacks = _other.numstacks;
                }
                final PropertyTree numquadsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numquads"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numquadsPropertyTree!= null):((numquadsPropertyTree == null)||(!numquadsPropertyTree.isLeaf())))) {
                    this.numquads = _other.numquads;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends QualityType >_P init(final _P _product) {
            _product.shadowsize = this.shadowsize;
            _product.offsamples = this.offsamples;
            _product.numslices = this.numslices;
            _product.numstacks = this.numstacks;
            _product.numquads = this.numquads;
            return _product;
        }

        /**
         * Sets the new value of "shadowsize" (any previous value will be replaced)
         * 
         * @param shadowsize
         *     New value of the "shadowsize" property.
         */
        public QualityType.Builder<_B> withShadowsize(final Integer shadowsize) {
            this.shadowsize = shadowsize;
            return this;
        }

        /**
         * Sets the new value of "offsamples" (any previous value will be replaced)
         * 
         * @param offsamples
         *     New value of the "offsamples" property.
         */
        public QualityType.Builder<_B> withOffsamples(final Integer offsamples) {
            this.offsamples = offsamples;
            return this;
        }

        /**
         * Sets the new value of "numslices" (any previous value will be replaced)
         * 
         * @param numslices
         *     New value of the "numslices" property.
         */
        public QualityType.Builder<_B> withNumslices(final Integer numslices) {
            this.numslices = numslices;
            return this;
        }

        /**
         * Sets the new value of "numstacks" (any previous value will be replaced)
         * 
         * @param numstacks
         *     New value of the "numstacks" property.
         */
        public QualityType.Builder<_B> withNumstacks(final Integer numstacks) {
            this.numstacks = numstacks;
            return this;
        }

        /**
         * Sets the new value of "numquads" (any previous value will be replaced)
         * 
         * @param numquads
         *     New value of the "numquads" property.
         */
        public QualityType.Builder<_B> withNumquads(final Integer numquads) {
            this.numquads = numquads;
            return this;
        }

        @Override
        public QualityType build() {
            return this.init(new QualityType());
        }

        public QualityType.Builder<_B> copyOf(final QualityType _other) {
            _other.copyTo(this);
            return this;
        }

        public QualityType.Builder<_B> copyOf(final QualityType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String SHADOWSIZE = "shadowsize";
        public final static transient String OFFSAMPLES = "offsamples";
        public final static transient String NUMSLICES = "numslices";
        public final static transient String NUMSTACKS = "numstacks";
        public final static transient String NUMQUADS = "numquads";

    }

    public static class Select
        extends QualityType.Selector<QualityType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static QualityType.Select _root() {
            return new QualityType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>> shadowsize = null;
        private com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>> offsamples = null;
        private com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>> numslices = null;
        private com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>> numstacks = null;
        private com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>> numquads = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.shadowsize!= null) {
                products.put("shadowsize", this.shadowsize.init());
            }
            if (this.offsamples!= null) {
                products.put("offsamples", this.offsamples.init());
            }
            if (this.numslices!= null) {
                products.put("numslices", this.numslices.init());
            }
            if (this.numstacks!= null) {
                products.put("numstacks", this.numstacks.init());
            }
            if (this.numquads!= null) {
                products.put("numquads", this.numquads.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>> shadowsize() {
            return ((this.shadowsize == null)?this.shadowsize = new com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>>(this._root, this, "shadowsize"):this.shadowsize);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>> offsamples() {
            return ((this.offsamples == null)?this.offsamples = new com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>>(this._root, this, "offsamples"):this.offsamples);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>> numslices() {
            return ((this.numslices == null)?this.numslices = new com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>>(this._root, this, "numslices"):this.numslices);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>> numstacks() {
            return ((this.numstacks == null)?this.numstacks = new com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>>(this._root, this, "numstacks"):this.numstacks);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>> numquads() {
            return ((this.numquads == null)?this.numquads = new com.kscs.util.jaxb.Selector<TRoot, QualityType.Selector<TRoot, TParent>>(this._root, this, "numquads"):this.numquads);
        }

    }

}
