//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.13 at 04:45:57 PM EDT 
//


package org.mujoco.xml.attributetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sitetypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sitetypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="sphere"/&gt;
 *     &lt;enumeration value="capsule"/&gt;
 *     &lt;enumeration value="ellipsoid"/&gt;
 *     &lt;enumeration value="cylinder"/&gt;
 *     &lt;enumeration value="box"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sitetypeType", namespace = "attributeTypes")
@XmlEnum
public enum SitetypeType {

    @XmlEnumValue("sphere")
    SPHERE("sphere"),
    @XmlEnumValue("capsule")
    CAPSULE("capsule"),
    @XmlEnumValue("ellipsoid")
    ELLIPSOID("ellipsoid"),
    @XmlEnumValue("cylinder")
    CYLINDER("cylinder"),
    @XmlEnumValue("box")
    BOX("box");
    private final String value;

    SitetypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SitetypeType fromValue(String v) {
        for (SitetypeType c: SitetypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}