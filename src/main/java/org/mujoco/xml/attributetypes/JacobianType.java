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
 * <p>Java class for jacobianType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jacobianType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dense"/&gt;
 *     &lt;enumeration value="sparse"/&gt;
 *     &lt;enumeration value="auto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "jacobianType", namespace = "attributeTypes")
@XmlEnum
public enum JacobianType {

    @XmlEnumValue("dense")
    DENSE("dense"),
    @XmlEnumValue("sparse")
    SPARSE("sparse"),
    @XmlEnumValue("auto")
    AUTO("auto");
    private final String value;

    JacobianType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JacobianType fromValue(String v) {
        for (JacobianType c: JacobianType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
