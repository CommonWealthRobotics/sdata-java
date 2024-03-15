//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.mujoco.xml.body;

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
 * <p>Java class for compositesiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compositesiteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="size" type="{attributeTypes}upToThreeRealsType" default="0.005 0.005 0.005" /&gt;
 *       &lt;attribute name="material" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rgba" type="{attributeTypes}fourRealsType" default="0.5 0.5 0.5 1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compositesiteType")
public class CompositesiteType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "group")
    protected Integer group;
    @XmlAttribute(name = "size")
    protected String size;
    @XmlAttribute(name = "material")
    protected String material;
    @XmlAttribute(name = "rgba")
    protected String rgba;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public CompositesiteType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a CompositesiteType copying the state of another CompositesiteType
     * 
     * @param _other
     *     The original CompositesiteType from which to copy state.
     */
    public CompositesiteType(final CompositesiteType _other) {
        this.group = _other.group;
        this.size = _other.size;
        this.material = _other.material;
        this.rgba = _other.rgba;
    }

    /**
     * Instantiates a CompositesiteType copying the state of another CompositesiteType
     * 
     * @param _propertyTreeUse
     *     Meaning of the : Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting  that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original CompositesiteType from which to copy state.
     */
    public CompositesiteType(final CompositesiteType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree groupPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("group"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(groupPropertyTree!= null):((groupPropertyTree == null)||(!groupPropertyTree.isLeaf())))) {
            this.group = _other.group;
        }
        final PropertyTree sizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("size"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sizePropertyTree!= null):((sizePropertyTree == null)||(!sizePropertyTree.isLeaf())))) {
            this.size = _other.size;
        }
        final PropertyTree materialPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("material"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(materialPropertyTree!= null):((materialPropertyTree == null)||(!materialPropertyTree.isLeaf())))) {
            this.material = _other.material;
        }
        final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
            this.rgba = _other.rgba;
        }
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getGroup() {
        if (group == null) {
            return  0;
        } else {
            return group;
        }
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        if (size == null) {
            return "0.005 0.005 0.005";
        } else {
            return size;
        }
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Gets the value of the rgba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgba() {
        if (rgba == null) {
            return "0.5 0.5 0.5 1";
        } else {
            return rgba;
        }
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public CompositesiteType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public CompositesiteType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setGroup(final Integer value) {
        final Integer __oldValue = this.group;
        try {
            this.vetoableChange__Support.fireVetoableChange("group", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.group = value;
        this.propertyChange__Support.firePropertyChange("group", __oldValue, value);
    }

    public void setSize(final String value) {
        final String __oldValue = this.size;
        try {
            this.vetoableChange__Support.fireVetoableChange("size", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.size = value;
        this.propertyChange__Support.firePropertyChange("size", __oldValue, value);
    }

    public void setMaterial(final String value) {
        final String __oldValue = this.material;
        try {
            this.vetoableChange__Support.fireVetoableChange("material", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.material = value;
        this.propertyChange__Support.firePropertyChange("material", __oldValue, value);
    }

    public void setRgba(final String value) {
        final String __oldValue = this.rgba;
        try {
            this.vetoableChange__Support.fireVetoableChange("rgba", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.rgba = value;
        this.propertyChange__Support.firePropertyChange("rgba", __oldValue, value);
    }

    @Override
    public CompositesiteType clone() {
        final CompositesiteType _newObject;
        try {
            _newObject = ((CompositesiteType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public CompositesiteType createCopy() {
        final CompositesiteType _newObject;
        try {
            _newObject = ((CompositesiteType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.group = this.group;
        _newObject.size = this.size;
        _newObject.material = this.material;
        _newObject.rgba = this.rgba;
        return _newObject;
    }

    @Override
    public CompositesiteType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CompositesiteType _newObject;
        try {
            _newObject = ((CompositesiteType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree groupPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("group"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(groupPropertyTree!= null):((groupPropertyTree == null)||(!groupPropertyTree.isLeaf())))) {
            _newObject.group = this.group;
        }
        final PropertyTree sizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("size"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sizePropertyTree!= null):((sizePropertyTree == null)||(!sizePropertyTree.isLeaf())))) {
            _newObject.size = this.size;
        }
        final PropertyTree materialPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("material"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(materialPropertyTree!= null):((materialPropertyTree == null)||(!materialPropertyTree.isLeaf())))) {
            _newObject.material = this.material;
        }
        final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
            _newObject.rgba = this.rgba;
        }
        return _newObject;
    }

    @Override
    public CompositesiteType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public CompositesiteType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CompositesiteType.Builder<_B> _other) {
        _other.group = this.group;
        _other.size = this.size;
        _other.material = this.material;
        _other.rgba = this.rgba;
    }

    public<_B >CompositesiteType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CompositesiteType.Builder<_B>(_parentBuilder, this, true);
    }

    public CompositesiteType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CompositesiteType.Builder<Void> builder() {
        return new CompositesiteType.Builder<Void>(null, null, false);
    }

    public static<_B >CompositesiteType.Builder<_B> copyOf(final CompositesiteType _other) {
        final CompositesiteType.Builder<_B> _newBuilder = new CompositesiteType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CompositesiteType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree groupPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("group"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(groupPropertyTree!= null):((groupPropertyTree == null)||(!groupPropertyTree.isLeaf())))) {
            _other.group = this.group;
        }
        final PropertyTree sizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("size"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sizePropertyTree!= null):((sizePropertyTree == null)||(!sizePropertyTree.isLeaf())))) {
            _other.size = this.size;
        }
        final PropertyTree materialPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("material"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(materialPropertyTree!= null):((materialPropertyTree == null)||(!materialPropertyTree.isLeaf())))) {
            _other.material = this.material;
        }
        final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
            _other.rgba = this.rgba;
        }
    }

    public<_B >CompositesiteType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CompositesiteType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CompositesiteType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CompositesiteType.Builder<_B> copyOf(final CompositesiteType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CompositesiteType.Builder<_B> _newBuilder = new CompositesiteType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CompositesiteType.Builder<Void> copyExcept(final CompositesiteType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CompositesiteType.Builder<Void> copyOnly(final CompositesiteType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public CompositesiteType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private Integer group;
        private String size;
        private String material;
        private String rgba;

        public Builder(final _B _parentBuilder, final CompositesiteType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.group = _other.group;
                this.size = _other.size;
                this.material = _other.material;
                this.rgba = _other.rgba;
            }
        }

        public Builder(final _B _parentBuilder, final CompositesiteType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree groupPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("group"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(groupPropertyTree!= null):((groupPropertyTree == null)||(!groupPropertyTree.isLeaf())))) {
                    this.group = _other.group;
                }
                final PropertyTree sizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("size"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sizePropertyTree!= null):((sizePropertyTree == null)||(!sizePropertyTree.isLeaf())))) {
                    this.size = _other.size;
                }
                final PropertyTree materialPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("material"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(materialPropertyTree!= null):((materialPropertyTree == null)||(!materialPropertyTree.isLeaf())))) {
                    this.material = _other.material;
                }
                final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
                    this.rgba = _other.rgba;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends CompositesiteType >_P init(final _P _product) {
            _product.group = this.group;
            _product.size = this.size;
            _product.material = this.material;
            _product.rgba = this.rgba;
            return _product;
        }

        /**
         * Sets the new value of "group" (any previous value will be replaced)
         * 
         * @param group
         *     New value of the "group" property.
         */
        public CompositesiteType.Builder<_B> withGroup(final Integer group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the new value of "size" (any previous value will be replaced)
         * 
         * @param size
         *     New value of the "size" property.
         */
        public CompositesiteType.Builder<_B> withSize(final String size) {
            this.size = size;
            return this;
        }

        /**
         * Sets the new value of "material" (any previous value will be replaced)
         * 
         * @param material
         *     New value of the "material" property.
         */
        public CompositesiteType.Builder<_B> withMaterial(final String material) {
            this.material = material;
            return this;
        }

        /**
         * Sets the new value of "rgba" (any previous value will be replaced)
         * 
         * @param rgba
         *     New value of the "rgba" property.
         */
        public CompositesiteType.Builder<_B> withRgba(final String rgba) {
            this.rgba = rgba;
            return this;
        }

        @Override
        public CompositesiteType build() {
            return this.init(new CompositesiteType());
        }

        public CompositesiteType.Builder<_B> copyOf(final CompositesiteType _other) {
            _other.copyTo(this);
            return this;
        }

        public CompositesiteType.Builder<_B> copyOf(final CompositesiteType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String GROUP = "group";
        public final static transient String SIZE = "size";
        public final static transient String MATERIAL = "material";
        public final static transient String RGBA = "rgba";

    }

    public static class Select
        extends CompositesiteType.Selector<CompositesiteType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CompositesiteType.Select _root() {
            return new CompositesiteType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>> group = null;
        private com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>> size = null;
        private com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>> material = null;
        private com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>> rgba = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.group!= null) {
                products.put("group", this.group.init());
            }
            if (this.size!= null) {
                products.put("size", this.size.init());
            }
            if (this.material!= null) {
                products.put("material", this.material.init());
            }
            if (this.rgba!= null) {
                products.put("rgba", this.rgba.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>> group() {
            return ((this.group == null)?this.group = new com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>>(this._root, this, "group"):this.group);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>> size() {
            return ((this.size == null)?this.size = new com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>>(this._root, this, "size"):this.size);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>> material() {
            return ((this.material == null)?this.material = new com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>>(this._root, this, "material"):this.material);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>> rgba() {
            return ((this.rgba == null)?this.rgba = new com.kscs.util.jaxb.Selector<TRoot, CompositesiteType.Selector<TRoot, TParent>>(this._root, this, "rgba"):this.rgba);
        }

    }

}
