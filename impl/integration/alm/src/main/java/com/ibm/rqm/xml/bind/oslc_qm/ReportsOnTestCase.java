//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.13 at 12:00:05 PM BRT 
//


package com.ibm.rqm.xml.bind.oslc_qm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://open-services.net/ns/qm#}TestCase"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/1999/02/22-rdf-syntax-ns#}resource"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "testCase"
})
@XmlRootElement(name = "reportsOnTestCase")
public class ReportsOnTestCase {

    @XmlElement(name = "TestCase", required = true)
    protected TestCase testCase;
    @XmlAttribute(namespace = "http://www.w3.org/1999/02/22-rdf-syntax-ns#")
    @XmlSchemaType(name = "anyURI")
    protected String resource;

    /**
     * Gets the value of the testCase property.
     * 
     * @return
     *     possible object is
     *     {@link TestCase }
     *     
     */
    public TestCase getTestCase() {
        return testCase;
    }

    /**
     * Sets the value of the testCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestCase }
     *     
     */
    public void setTestCase(TestCase value) {
        this.testCase = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResource(String value) {
        this.resource = value;
    }

}