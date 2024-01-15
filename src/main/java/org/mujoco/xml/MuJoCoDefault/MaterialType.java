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
 * <p>Java class for materialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="texture" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="texrepeat" type="{attributeTypes}twoRealsType" default="1 1" /&gt;
 *       &lt;attribute name="texuniform" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="emission" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="specular" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0.5" /&gt;
 *       &lt;attribute name="shininess" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0.5" /&gt;
 *       &lt;attribute name="reflectance" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="rgba" type="{attributeTypes}fourRealsType" default="1 1 1 1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materialType")
public class MaterialType implements Cloneable, Copyable, PartialCopyable
{

    @XmlAttribute(name = "texture")
    protected String texture;
    @XmlAttribute(name = "texrepeat")
    protected String texrepeat;
    @XmlAttribute(name = "texuniform")
    protected Boolean texuniform;
    @XmlAttribute(name = "emission")
    protected BigDecimal emission;
    @XmlAttribute(name = "specular")
    protected BigDecimal specular;
    @XmlAttribute(name = "shininess")
    protected BigDecimal shininess;
    @XmlAttribute(name = "reflectance")
    protected BigDecimal reflectance;
    @XmlAttribute(name = "rgba")
    protected String rgba;
    protected final transient VetoableChangeSupport vetoableChange__Support = new VetoableChangeSupport(this);
    protected final transient PropertyChangeSupport propertyChange__Support = new PropertyChangeSupport(this);

    /**
     * Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
     * 
     */
    public MaterialType() {
        // Generated by copy-constructor plugin, JAXB requires public no-arg constructor.
    }

    /**
     * Instantiates a MaterialType copying the state of another MaterialType
     * 
     * @param _other
     *     The original MaterialType from which to copy state.
     */
    public MaterialType(final MaterialType _other) {
        this.texture = _other.texture;
        this.texrepeat = _other.texrepeat;
        this.texuniform = _other.texuniform;
        this.emission = _other.emission;
        this.specular = _other.specular;
        this.shininess = _other.shininess;
        this.reflectance = _other.reflectance;
        this.rgba = _other.rgba;
    }

    /**
     * Instantiates a MaterialType copying the state of another MaterialType
     * 
     * @param _propertyTreeUse
     *     Meaning of the {@link PropertyPath}: Exclude or include members contained in property path.
     * @param _propertyTree
     *     A restricting {@link PropertyPath} that defines which nodes of the source object tree should actually be copied.
     * @param _other
     *     The original MaterialType from which to copy state.
     */
    public MaterialType(final MaterialType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree texturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texture"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texturePropertyTree!= null):((texturePropertyTree == null)||(!texturePropertyTree.isLeaf())))) {
            this.texture = _other.texture;
        }
        final PropertyTree texrepeatPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texrepeat"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texrepeatPropertyTree!= null):((texrepeatPropertyTree == null)||(!texrepeatPropertyTree.isLeaf())))) {
            this.texrepeat = _other.texrepeat;
        }
        final PropertyTree texuniformPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texuniform"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texuniformPropertyTree!= null):((texuniformPropertyTree == null)||(!texuniformPropertyTree.isLeaf())))) {
            this.texuniform = _other.texuniform;
        }
        final PropertyTree emissionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("emission"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(emissionPropertyTree!= null):((emissionPropertyTree == null)||(!emissionPropertyTree.isLeaf())))) {
            this.emission = _other.emission;
        }
        final PropertyTree specularPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specular"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specularPropertyTree!= null):((specularPropertyTree == null)||(!specularPropertyTree.isLeaf())))) {
            this.specular = _other.specular;
        }
        final PropertyTree shininessPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("shininess"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(shininessPropertyTree!= null):((shininessPropertyTree == null)||(!shininessPropertyTree.isLeaf())))) {
            this.shininess = _other.shininess;
        }
        final PropertyTree reflectancePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("reflectance"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(reflectancePropertyTree!= null):((reflectancePropertyTree == null)||(!reflectancePropertyTree.isLeaf())))) {
            this.reflectance = _other.reflectance;
        }
        final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
            this.rgba = _other.rgba;
        }
    }

    /**
     * Gets the value of the texture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexture() {
        return texture;
    }

    /**
     * Gets the value of the texrepeat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexrepeat() {
        if (texrepeat == null) {
            return "1 1";
        } else {
            return texrepeat;
        }
    }

    /**
     * Gets the value of the texuniform property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTexuniform() {
        if (texuniform == null) {
            return false;
        } else {
            return texuniform;
        }
    }

    /**
     * Gets the value of the emission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmission() {
        if (emission == null) {
            return new BigDecimal("0");
        } else {
            return emission;
        }
    }

    /**
     * Gets the value of the specular property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecular() {
        if (specular == null) {
            return new BigDecimal("0.5");
        } else {
            return specular;
        }
    }

    /**
     * Gets the value of the shininess property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShininess() {
        if (shininess == null) {
            return new BigDecimal("0.5");
        } else {
            return shininess;
        }
    }

    /**
     * Gets the value of the reflectance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReflectance() {
        if (reflectance == null) {
            return new BigDecimal("0");
        } else {
            return reflectance;
        }
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
            return "1 1 1 1";
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

    public MaterialType withVetoableChangeListener(final VetoableChangeListener vetoableChangeListener) {
        addVetoableChangeListener(vetoableChangeListener);
        return this;
    }

    public void addPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        this.propertyChange__Support.removePropertyChangeListener(propertyChangeListener);
    }

    public MaterialType withPropertyChangeListener(final PropertyChangeListener propertyChangeListener) {
        addPropertyChangeListener(propertyChangeListener);
        return this;
    }

    public void setTexture(final String value) {
        final String __oldValue = this.texture;
        try {
            this.vetoableChange__Support.fireVetoableChange("texture", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.texture = value;
        this.propertyChange__Support.firePropertyChange("texture", __oldValue, value);
    }

    public void setTexrepeat(final String value) {
        final String __oldValue = this.texrepeat;
        try {
            this.vetoableChange__Support.fireVetoableChange("texrepeat", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.texrepeat = value;
        this.propertyChange__Support.firePropertyChange("texrepeat", __oldValue, value);
    }

    public void setTexuniform(final Boolean value) {
        final Boolean __oldValue = this.texuniform;
        try {
            this.vetoableChange__Support.fireVetoableChange("texuniform", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.texuniform = value;
        this.propertyChange__Support.firePropertyChange("texuniform", __oldValue, value);
    }

    public void setEmission(final BigDecimal value) {
        final BigDecimal __oldValue = this.emission;
        try {
            this.vetoableChange__Support.fireVetoableChange("emission", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.emission = value;
        this.propertyChange__Support.firePropertyChange("emission", __oldValue, value);
    }

    public void setSpecular(final BigDecimal value) {
        final BigDecimal __oldValue = this.specular;
        try {
            this.vetoableChange__Support.fireVetoableChange("specular", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.specular = value;
        this.propertyChange__Support.firePropertyChange("specular", __oldValue, value);
    }

    public void setShininess(final BigDecimal value) {
        final BigDecimal __oldValue = this.shininess;
        try {
            this.vetoableChange__Support.fireVetoableChange("shininess", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.shininess = value;
        this.propertyChange__Support.firePropertyChange("shininess", __oldValue, value);
    }

    public void setReflectance(final BigDecimal value) {
        final BigDecimal __oldValue = this.reflectance;
        try {
            this.vetoableChange__Support.fireVetoableChange("reflectance", __oldValue, value);
        } catch (PropertyVetoException x) {
            throw new RuntimeException(x);
        }
        this.reflectance = value;
        this.propertyChange__Support.firePropertyChange("reflectance", __oldValue, value);
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
    public MaterialType clone() {
        final MaterialType _newObject;
        try {
            _newObject = ((MaterialType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return _newObject;
    }

    @Override
    public MaterialType createCopy() {
        final MaterialType _newObject;
        try {
            _newObject = ((MaterialType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        _newObject.texture = this.texture;
        _newObject.texrepeat = this.texrepeat;
        _newObject.texuniform = this.texuniform;
        _newObject.emission = this.emission;
        _newObject.specular = this.specular;
        _newObject.shininess = this.shininess;
        _newObject.reflectance = this.reflectance;
        _newObject.rgba = this.rgba;
        return _newObject;
    }

    @Override
    public MaterialType createCopy(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MaterialType _newObject;
        try {
            _newObject = ((MaterialType) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        final PropertyTree texturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texture"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texturePropertyTree!= null):((texturePropertyTree == null)||(!texturePropertyTree.isLeaf())))) {
            _newObject.texture = this.texture;
        }
        final PropertyTree texrepeatPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texrepeat"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texrepeatPropertyTree!= null):((texrepeatPropertyTree == null)||(!texrepeatPropertyTree.isLeaf())))) {
            _newObject.texrepeat = this.texrepeat;
        }
        final PropertyTree texuniformPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texuniform"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texuniformPropertyTree!= null):((texuniformPropertyTree == null)||(!texuniformPropertyTree.isLeaf())))) {
            _newObject.texuniform = this.texuniform;
        }
        final PropertyTree emissionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("emission"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(emissionPropertyTree!= null):((emissionPropertyTree == null)||(!emissionPropertyTree.isLeaf())))) {
            _newObject.emission = this.emission;
        }
        final PropertyTree specularPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specular"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specularPropertyTree!= null):((specularPropertyTree == null)||(!specularPropertyTree.isLeaf())))) {
            _newObject.specular = this.specular;
        }
        final PropertyTree shininessPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("shininess"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(shininessPropertyTree!= null):((shininessPropertyTree == null)||(!shininessPropertyTree.isLeaf())))) {
            _newObject.shininess = this.shininess;
        }
        final PropertyTree reflectancePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("reflectance"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(reflectancePropertyTree!= null):((reflectancePropertyTree == null)||(!reflectancePropertyTree.isLeaf())))) {
            _newObject.reflectance = this.reflectance;
        }
        final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
            _newObject.rgba = this.rgba;
        }
        return _newObject;
    }

    @Override
    public MaterialType copyExcept(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.EXCLUDE);
    }

    @Override
    public MaterialType copyOnly(final PropertyTree _propertyTree) {
        return createCopy(_propertyTree, PropertyTreeUse.INCLUDE);
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final MaterialType.Builder<_B> _other) {
        _other.texture = this.texture;
        _other.texrepeat = this.texrepeat;
        _other.texuniform = this.texuniform;
        _other.emission = this.emission;
        _other.specular = this.specular;
        _other.shininess = this.shininess;
        _other.reflectance = this.reflectance;
        _other.rgba = this.rgba;
    }

    public<_B >MaterialType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new MaterialType.Builder<_B>(_parentBuilder, this, true);
    }

    public MaterialType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static MaterialType.Builder<Void> builder() {
        return new MaterialType.Builder<Void>(null, null, false);
    }

    public static<_B >MaterialType.Builder<_B> copyOf(final MaterialType _other) {
        final MaterialType.Builder<_B> _newBuilder = new MaterialType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final MaterialType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree texturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texture"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texturePropertyTree!= null):((texturePropertyTree == null)||(!texturePropertyTree.isLeaf())))) {
            _other.texture = this.texture;
        }
        final PropertyTree texrepeatPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texrepeat"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texrepeatPropertyTree!= null):((texrepeatPropertyTree == null)||(!texrepeatPropertyTree.isLeaf())))) {
            _other.texrepeat = this.texrepeat;
        }
        final PropertyTree texuniformPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texuniform"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texuniformPropertyTree!= null):((texuniformPropertyTree == null)||(!texuniformPropertyTree.isLeaf())))) {
            _other.texuniform = this.texuniform;
        }
        final PropertyTree emissionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("emission"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(emissionPropertyTree!= null):((emissionPropertyTree == null)||(!emissionPropertyTree.isLeaf())))) {
            _other.emission = this.emission;
        }
        final PropertyTree specularPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specular"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specularPropertyTree!= null):((specularPropertyTree == null)||(!specularPropertyTree.isLeaf())))) {
            _other.specular = this.specular;
        }
        final PropertyTree shininessPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("shininess"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(shininessPropertyTree!= null):((shininessPropertyTree == null)||(!shininessPropertyTree.isLeaf())))) {
            _other.shininess = this.shininess;
        }
        final PropertyTree reflectancePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("reflectance"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(reflectancePropertyTree!= null):((reflectancePropertyTree == null)||(!reflectancePropertyTree.isLeaf())))) {
            _other.reflectance = this.reflectance;
        }
        final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
            _other.rgba = this.rgba;
        }
    }

    public<_B >MaterialType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new MaterialType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public MaterialType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >MaterialType.Builder<_B> copyOf(final MaterialType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MaterialType.Builder<_B> _newBuilder = new MaterialType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static MaterialType.Builder<Void> copyExcept(final MaterialType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static MaterialType.Builder<Void> copyOnly(final MaterialType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public MaterialType visit(final PropertyVisitor _visitor_) {
        _visitor_.visit(this);
        return this;
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final MaterialType _storedValue;
        private String texture;
        private String texrepeat;
        private Boolean texuniform;
        private BigDecimal emission;
        private BigDecimal specular;
        private BigDecimal shininess;
        private BigDecimal reflectance;
        private String rgba;

        public Builder(final _B _parentBuilder, final MaterialType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.texture = _other.texture;
                    this.texrepeat = _other.texrepeat;
                    this.texuniform = _other.texuniform;
                    this.emission = _other.emission;
                    this.specular = _other.specular;
                    this.shininess = _other.shininess;
                    this.reflectance = _other.reflectance;
                    this.rgba = _other.rgba;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final MaterialType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree texturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texture"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texturePropertyTree!= null):((texturePropertyTree == null)||(!texturePropertyTree.isLeaf())))) {
                        this.texture = _other.texture;
                    }
                    final PropertyTree texrepeatPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texrepeat"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texrepeatPropertyTree!= null):((texrepeatPropertyTree == null)||(!texrepeatPropertyTree.isLeaf())))) {
                        this.texrepeat = _other.texrepeat;
                    }
                    final PropertyTree texuniformPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("texuniform"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(texuniformPropertyTree!= null):((texuniformPropertyTree == null)||(!texuniformPropertyTree.isLeaf())))) {
                        this.texuniform = _other.texuniform;
                    }
                    final PropertyTree emissionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("emission"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(emissionPropertyTree!= null):((emissionPropertyTree == null)||(!emissionPropertyTree.isLeaf())))) {
                        this.emission = _other.emission;
                    }
                    final PropertyTree specularPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specular"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specularPropertyTree!= null):((specularPropertyTree == null)||(!specularPropertyTree.isLeaf())))) {
                        this.specular = _other.specular;
                    }
                    final PropertyTree shininessPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("shininess"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(shininessPropertyTree!= null):((shininessPropertyTree == null)||(!shininessPropertyTree.isLeaf())))) {
                        this.shininess = _other.shininess;
                    }
                    final PropertyTree reflectancePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("reflectance"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(reflectancePropertyTree!= null):((reflectancePropertyTree == null)||(!reflectancePropertyTree.isLeaf())))) {
                        this.reflectance = _other.reflectance;
                    }
                    final PropertyTree rgbaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rgba"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rgbaPropertyTree!= null):((rgbaPropertyTree == null)||(!rgbaPropertyTree.isLeaf())))) {
                        this.rgba = _other.rgba;
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

        protected<_P extends MaterialType >_P init(final _P _product) {
            _product.texture = this.texture;
            _product.texrepeat = this.texrepeat;
            _product.texuniform = this.texuniform;
            _product.emission = this.emission;
            _product.specular = this.specular;
            _product.shininess = this.shininess;
            _product.reflectance = this.reflectance;
            _product.rgba = this.rgba;
            return _product;
        }

        /**
         * Sets the new value of "texture" (any previous value will be replaced)
         * 
         * @param texture
         *     New value of the "texture" property.
         */
        public MaterialType.Builder<_B> withTexture(final String texture) {
            this.texture = texture;
            return this;
        }

        /**
         * Sets the new value of "texrepeat" (any previous value will be replaced)
         * 
         * @param texrepeat
         *     New value of the "texrepeat" property.
         */
        public MaterialType.Builder<_B> withTexrepeat(final String texrepeat) {
            this.texrepeat = texrepeat;
            return this;
        }

        /**
         * Sets the new value of "texuniform" (any previous value will be replaced)
         * 
         * @param texuniform
         *     New value of the "texuniform" property.
         */
        public MaterialType.Builder<_B> withTexuniform(final Boolean texuniform) {
            this.texuniform = texuniform;
            return this;
        }

        /**
         * Sets the new value of "emission" (any previous value will be replaced)
         * 
         * @param emission
         *     New value of the "emission" property.
         */
        public MaterialType.Builder<_B> withEmission(final BigDecimal emission) {
            this.emission = emission;
            return this;
        }

        /**
         * Sets the new value of "specular" (any previous value will be replaced)
         * 
         * @param specular
         *     New value of the "specular" property.
         */
        public MaterialType.Builder<_B> withSpecular(final BigDecimal specular) {
            this.specular = specular;
            return this;
        }

        /**
         * Sets the new value of "shininess" (any previous value will be replaced)
         * 
         * @param shininess
         *     New value of the "shininess" property.
         */
        public MaterialType.Builder<_B> withShininess(final BigDecimal shininess) {
            this.shininess = shininess;
            return this;
        }

        /**
         * Sets the new value of "reflectance" (any previous value will be replaced)
         * 
         * @param reflectance
         *     New value of the "reflectance" property.
         */
        public MaterialType.Builder<_B> withReflectance(final BigDecimal reflectance) {
            this.reflectance = reflectance;
            return this;
        }

        /**
         * Sets the new value of "rgba" (any previous value will be replaced)
         * 
         * @param rgba
         *     New value of the "rgba" property.
         */
        public MaterialType.Builder<_B> withRgba(final String rgba) {
            this.rgba = rgba;
            return this;
        }

        @Override
        public MaterialType build() {
            if (_storedValue == null) {
                return this.init(new MaterialType());
            } else {
                return ((MaterialType) _storedValue);
            }
        }

        public MaterialType.Builder<_B> copyOf(final MaterialType _other) {
            _other.copyTo(this);
            return this;
        }

        public MaterialType.Builder<_B> copyOf(final MaterialType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class PropInfo {

        public final static transient String TEXTURE = "texture";
        public final static transient String TEXREPEAT = "texrepeat";
        public final static transient String TEXUNIFORM = "texuniform";
        public final static transient String EMISSION = "emission";
        public final static transient String SPECULAR = "specular";
        public final static transient String SHININESS = "shininess";
        public final static transient String REFLECTANCE = "reflectance";
        public final static transient String RGBA = "rgba";

    }

    public static class Select
        extends MaterialType.Selector<MaterialType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static MaterialType.Select _root() {
            return new MaterialType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> texture = null;
        private com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> texrepeat = null;
        private com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> texuniform = null;
        private com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> emission = null;
        private com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> specular = null;
        private com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> shininess = null;
        private com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> reflectance = null;
        private com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> rgba = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.texture!= null) {
                products.put("texture", this.texture.init());
            }
            if (this.texrepeat!= null) {
                products.put("texrepeat", this.texrepeat.init());
            }
            if (this.texuniform!= null) {
                products.put("texuniform", this.texuniform.init());
            }
            if (this.emission!= null) {
                products.put("emission", this.emission.init());
            }
            if (this.specular!= null) {
                products.put("specular", this.specular.init());
            }
            if (this.shininess!= null) {
                products.put("shininess", this.shininess.init());
            }
            if (this.reflectance!= null) {
                products.put("reflectance", this.reflectance.init());
            }
            if (this.rgba!= null) {
                products.put("rgba", this.rgba.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> texture() {
            return ((this.texture == null)?this.texture = new com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>>(this._root, this, "texture"):this.texture);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> texrepeat() {
            return ((this.texrepeat == null)?this.texrepeat = new com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>>(this._root, this, "texrepeat"):this.texrepeat);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> texuniform() {
            return ((this.texuniform == null)?this.texuniform = new com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>>(this._root, this, "texuniform"):this.texuniform);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> emission() {
            return ((this.emission == null)?this.emission = new com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>>(this._root, this, "emission"):this.emission);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> specular() {
            return ((this.specular == null)?this.specular = new com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>>(this._root, this, "specular"):this.specular);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> shininess() {
            return ((this.shininess == null)?this.shininess = new com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>>(this._root, this, "shininess"):this.shininess);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> reflectance() {
            return ((this.reflectance == null)?this.reflectance = new com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>>(this._root, this, "reflectance"):this.reflectance);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>> rgba() {
            return ((this.rgba == null)?this.rgba = new com.kscs.util.jaxb.Selector<TRoot, MaterialType.Selector<TRoot, TParent>>(this._root, this, "rgba"):this.rgba);
        }

    }

}
