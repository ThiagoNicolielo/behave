//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.13 at 12:00:05 PM BRT 
//


package com.ibm.rqm.xml.bind;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="files">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="file" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="urn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="relativepath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="folders">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="folder" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="urn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "fullpath",
    "files",
    "folders"
})
@XmlRootElement(name = "foldercontent")
public class Foldercontent {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String fullpath;
    @XmlElement(required = true)
    protected Foldercontent.Files files;
    @XmlElement(required = true)
    protected Foldercontent.Folders folders;

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
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fullpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullpath() {
        return fullpath;
    }

    /**
     * Sets the value of the fullpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullpath(String value) {
        this.fullpath = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link Foldercontent.Files }
     *     
     */
    public Foldercontent.Files getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link Foldercontent.Files }
     *     
     */
    public void setFiles(Foldercontent.Files value) {
        this.files = value;
    }

    /**
     * Gets the value of the folders property.
     * 
     * @return
     *     possible object is
     *     {@link Foldercontent.Folders }
     *     
     */
    public Foldercontent.Folders getFolders() {
        return folders;
    }

    /**
     * Sets the value of the folders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Foldercontent.Folders }
     *     
     */
    public void setFolders(Foldercontent.Folders value) {
        this.folders = value;
    }


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
     *         &lt;element name="file" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="urn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="relativepath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "file"
    })
    public static class Files {

        @XmlElement(required = true)
        protected List<Foldercontent.Files.File> file;

        /**
         * Gets the value of the file property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Foldercontent.Files.File }
         * 
         * 
         */
        public List<Foldercontent.Files.File> getFile() {
            if (file == null) {
                file = new ArrayList<Foldercontent.Files.File>();
            }
            return this.file;
        }


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
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="urn" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="relativepath" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "urn",
            "relativepath"
        })
        public static class File {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String urn;
            @XmlElement(required = true)
            protected String relativepath;

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
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the urn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrn() {
                return urn;
            }

            /**
             * Sets the value of the urn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrn(String value) {
                this.urn = value;
            }

            /**
             * Gets the value of the relativepath property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelativepath() {
                return relativepath;
            }

            /**
             * Sets the value of the relativepath property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelativepath(String value) {
                this.relativepath = value;
            }

        }

    }


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
     *         &lt;element name="folder" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="urn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "folder"
    })
    public static class Folders {

        @XmlElement(required = true)
        protected List<Foldercontent.Folders.Folder> folder;

        /**
         * Gets the value of the folder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the folder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFolder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Foldercontent.Folders.Folder }
         * 
         * 
         */
        public List<Foldercontent.Folders.Folder> getFolder() {
            if (folder == null) {
                folder = new ArrayList<Foldercontent.Folders.Folder>();
            }
            return this.folder;
        }


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
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="urn" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "urn"
        })
        public static class Folder {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String urn;

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
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the urn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrn() {
                return urn;
            }

            /**
             * Sets the value of the urn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrn(String value) {
                this.urn = value;
            }

        }

    }

}
