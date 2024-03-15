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
 * <p>Java class for markType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="markType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="edge"/&gt;
 *     &lt;enumeration value="cross"/&gt;
 *     &lt;enumeration value="random"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "markType", namespace = "attributeTypes")
@XmlEnum
public enum MarkType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("edge")
    EDGE("edge"),
    @XmlEnumValue("cross")
    CROSS("cross"),
    @XmlEnumValue("random")
    RANDOM("random");
    private final String value;

    MarkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarkType fromValue(String v) {
        for (MarkType c: MarkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
