//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.14 at 10:23:33 PM EST 
//


package org.mujoco.xml.custom;

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
 * <p>Java class for textType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="data" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textType")
public class TextType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "data", required = true)
    protected String data;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public TextType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a TextType copying the state of another TextType
     * 
     * @param _other
     *     The original TextType from which to copy state.
     */
    public TextType(final TextType _other) {
        this.name = _other.name;
        this.data = _other.data;
    }

    /**
     * Instantiates a TextType copying the state of another TextType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original TextType from which to copy state.
     */
    public TextType(final TextType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            this.name = _other.name;
        }
        final PropertyTree dataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("data"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataPropertyTree!= null):((dataPropertyTree == null)||(!dataPropertyTree.isLeaf())))) {
            this.data = _other.data;
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
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public TextType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public TextType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
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

    public void setData(final String value) {
        final String __oldValue = this.data;
        try {
            this.vetoableChange__Support.fireVetoableChange("data", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.data = value;
        this.propertyChange__Support.firePropertyChange("data", __oldValue, value);
    }

    @Override
    public TextType clone() {
        final TextType _newObject;
        try {
            _newObject = ((TextType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public TextType createCopy() {
        final TextType _newObject;
        try {
            _newObject = ((TextType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.name = this.name;
        _newObject.data = this.data;
        return _newObject;
    }

    @Override
    public TextType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final TextType _newObject;
        try {
            _newObject = ((TextType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _newObject.name = this.name;
        }
        final PropertyTree dataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("data"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataPropertyTree!= null):((dataPropertyTree == null)||(!dataPropertyTree.isLeaf())))) {
            _newObject.data = this.data;
        }
        return _newObject;
    }

    @Override
    public TextType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public TextType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final TextType.Builder<_B> _other) {
        _other.name = this.name;
        _other.data = this.data;
    }

    public<_B >TextType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new TextType.Builder<_B>(_parentBuilder, this, true);
    }

    public TextType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static TextType.Builder<Void> builder() {
        return new TextType.Builder<Void>(null, null, false);
    }

    public static<_B >TextType.Builder<_B> copyOf(final TextType _other) {
        final TextType.Builder<_B> _newBuilder = new TextType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final TextType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree dataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("data"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataPropertyTree!= null):((dataPropertyTree == null)||(!dataPropertyTree.isLeaf())))) {
            _other.data = this.data;
        }
    }

    public<_B >TextType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new TextType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public TextType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >TextType.Builder<_B> copyOf(final TextType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final TextType.Builder<_B> _newBuilder = new TextType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static TextType.Builder<Void> copyExcept(final TextType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static TextType.Builder<Void> copyOnly(final TextType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public TextType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final TextType _storedValue;
        private String name;
        private String data;

        public Builder(final _B _parentBuilder, final TextType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.name = _other.name;
                    this.data = _other.data;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final TextType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                        this.name = _other.name;
                    }
                    final PropertyTree dataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("data"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataPropertyTree!= null):((dataPropertyTree == null)||(!dataPropertyTree.isLeaf())))) {
                        this.data = _other.data;
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

        protected<_P extends TextType >_P init(final _P _product) {
            _product.name = this.name;
            _product.data = this.data;
            return _product;
        }

        /**
         * Sets the new value of "name" (any previous value will be replaced)
         * 
         * @param name
         *     New value of the "name" property.
         */
        public TextType.Builder<_B> withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the new value of "data" (any previous value will be replaced)
         * 
         * @param data
         *     New value of the "data" property.
         */
        public TextType.Builder<_B> withData(final String data) {
            this.data = data;
            return this;
        }

        @Override
        public TextType build() {
            if (_storedValue == null) {
                return this.init(new TextType());
            } else {
                return ((TextType) _storedValue);
            }
        }

        public TextType.Builder<_B> copyOf(final TextType _other) {
            _other.copyTo(this);
            return this;
        }

        public TextType.Builder<_B> copyOf(final TextType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String NAME = "name";
        public final static transient String DATA = "data";

    }

    public static class Select
        extends TextType.Selector<TextType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static TextType.Select _root() {
            return new TextType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, TextType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, TextType.Selector<TRoot, TParent>> data = null;

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
            if (this.data!= null) {
                products.put("data", this.data.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, TextType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, TextType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TextType.Selector<TRoot, TParent>> data() {
            return ((this.data == null)?this.data = new com.kscs.util.jaxb.Selector<TRoot, TextType.Selector<TRoot, TParent>>(this._root, this, "data"):this.data);
        }

    }

}
