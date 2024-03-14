//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.13 at 04:45:57 PM EDT 
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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.Copyable;
import com.kscs.util.jaxb.PartialCopyable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import com.kscs.util.jaxb.PropertyVisitor;


/**
 * <p>Java class for defaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaultType")
@XmlSeeAlso({
    org.mujoco.xml.DefaultType.class
})
public class DefaultType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "class", required = true)
    protected String clazz;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public DefaultType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a DefaultType copying the state of another DefaultType
     * 
     * @param _other
     *     The original DefaultType from which to copy state.
     */
    public DefaultType(final DefaultType _other) {
        this.clazz = _other.clazz;
    }

    /**
     * Instantiates a DefaultType copying the state of another DefaultType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original DefaultType from which to copy state.
     */
    public DefaultType(final DefaultType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree clazzPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clazz"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clazzPropertyTree!= null):((clazzPropertyTree == null)||(!clazzPropertyTree.isLeaf())))) {
            this.clazz = _other.clazz;
        }
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

    public void addVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.addVetoableChangeListener(vetoableChangeListener);
    }

    public void removeVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        this.vetoableChange__Support.removeVetoableChangeListener(vetoableChangeListener);
    }

    public DefaultType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public DefaultType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
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

    @Override
    public DefaultType clone() {
        final DefaultType _newObject;
        try {
            _newObject = ((DefaultType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public DefaultType createCopy() {
        final DefaultType _newObject;
        try {
            _newObject = ((DefaultType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.clazz = this.clazz;
        return _newObject;
    }

    @Override
    public DefaultType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DefaultType _newObject;
        try {
            _newObject = ((DefaultType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree clazzPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clazz"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clazzPropertyTree!= null):((clazzPropertyTree == null)||(!clazzPropertyTree.isLeaf())))) {
            _newObject.clazz = this.clazz;
        }
        return _newObject;
    }

    @Override
    public DefaultType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public DefaultType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DefaultType.Builder<_B> _other) {
        _other.clazz = this.clazz;
    }

    public<_B >DefaultType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DefaultType.Builder<_B>(_parentBuilder, this, true);
    }

    public DefaultType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DefaultType.Builder<Void> builder() {
        return new DefaultType.Builder<Void>(null, null, false);
    }

    public static<_B >DefaultType.Builder<_B> copyOf(final DefaultType _other) {
        final DefaultType.Builder<_B> _newBuilder = new DefaultType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DefaultType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree clazzPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clazz"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clazzPropertyTree!= null):((clazzPropertyTree == null)||(!clazzPropertyTree.isLeaf())))) {
            _other.clazz = this.clazz;
        }
    }

    public<_B >DefaultType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DefaultType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DefaultType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DefaultType.Builder<_B> copyOf(final DefaultType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DefaultType.Builder<_B> _newBuilder = new DefaultType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DefaultType.Builder<Void> copyExcept(final DefaultType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DefaultType.Builder<Void> copyOnly(final DefaultType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public DefaultType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        private String clazz;

        public Builder(final _B _parentBuilder, final DefaultType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                this.clazz = _other.clazz;
            }
        }

        public Builder(final _B _parentBuilder, final DefaultType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                final PropertyTree clazzPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clazz"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clazzPropertyTree!= null):((clazzPropertyTree == null)||(!clazzPropertyTree.isLeaf())))) {
                    this.clazz = _other.clazz;
                }
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends DefaultType >_P init(final _P _product) {
            _product.clazz = this.clazz;
            return _product;
        }

        /**
         * Sets the new value of "clazz" (any previous value will be replaced)
         * 
         * @param clazz
         *     New value of the "clazz" property.
         */
        public DefaultType.Builder<_B> withClazz(final String clazz) {
            this.clazz = clazz;
            return this;
        }

        @Override
        public DefaultType build() {
            return this.init(new DefaultType());
        }

        public DefaultType.Builder<_B> copyOf(final DefaultType _other) {
            _other.copyTo(this);
            return this;
        }

        public DefaultType.Builder<_B> copyOf(final DefaultType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String CLAZZ = "clazz";

    }

    public static class Select
        extends DefaultType.Selector<DefaultType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DefaultType.Select _root() {
            return new DefaultType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DefaultType.Selector<TRoot, TParent>> clazz = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.clazz!= null) {
                products.put("clazz", this.clazz.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DefaultType.Selector<TRoot, TParent>> clazz() {
            return ((this.clazz == null)?this.clazz = new com.kscs.util.jaxb.Selector<TRoot, DefaultType.Selector<TRoot, TParent>>(this._root, this, "clazz"):this.clazz);
        }

    }

}
