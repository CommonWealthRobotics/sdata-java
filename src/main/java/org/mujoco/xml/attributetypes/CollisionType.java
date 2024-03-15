//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.mujoco.xml.attributetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collisionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="collisionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="predefined"/&gt;
 *     &lt;enumeration value="dynamic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "collisionType", namespace = "attributeTypes")
@XmlEnum
public enum CollisionType {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("predefined")
    PREDEFINED("predefined"),
    @XmlEnumValue("dynamic")
    DYNAMIC("dynamic");
    private final String value;

    CollisionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollisionType fromValue(String v) {
        for (CollisionType c: CollisionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
