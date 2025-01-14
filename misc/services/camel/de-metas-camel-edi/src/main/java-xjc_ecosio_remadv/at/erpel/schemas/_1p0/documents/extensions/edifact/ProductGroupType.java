//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.12 at 10:38:39 AM CET 
//


package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MainGroup"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}AlphaNumIDType"/&gt;
 *                   &lt;element name="Description" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}GroupDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubGroups" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubGroup" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}AlphaNumIDType" minOccurs="0"/&gt;
 *                             &lt;element name="SubDescription" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}GroupDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductGroupType", propOrder = {
    "mainGroup",
    "subGroups"
})
public class ProductGroupType {

    @XmlElement(name = "MainGroup", required = true)
    protected ProductGroupType.MainGroup mainGroup;
    @XmlElement(name = "SubGroups")
    protected ProductGroupType.SubGroups subGroups;

    /**
     * Gets the value of the mainGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupType.MainGroup }
     *     
     */
    public ProductGroupType.MainGroup getMainGroup() {
        return mainGroup;
    }

    /**
     * Sets the value of the mainGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupType.MainGroup }
     *     
     */
    public void setMainGroup(ProductGroupType.MainGroup value) {
        this.mainGroup = value;
    }

    /**
     * Gets the value of the subGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupType.SubGroups }
     *     
     */
    public ProductGroupType.SubGroups getSubGroups() {
        return subGroups;
    }

    /**
     * Sets the value of the subGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupType.SubGroups }
     *     
     */
    public void setSubGroups(ProductGroupType.SubGroups value) {
        this.subGroups = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ID" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}AlphaNumIDType"/&gt;
     *         &lt;element name="Description" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}GroupDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "description"
    })
    public static class MainGroup {

        @XmlElement(name = "ID", required = true)
        protected String id;
        @XmlElement(name = "Description")
        protected List<GroupDescriptionType> description;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GroupDescriptionType }
         * 
         * 
         */
        public List<GroupDescriptionType> getDescription() {
            if (description == null) {
                description = new ArrayList<GroupDescriptionType>();
            }
            return this.description;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SubGroup" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}AlphaNumIDType" minOccurs="0"/&gt;
     *                   &lt;element name="SubDescription" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}GroupDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subGroup"
    })
    public static class SubGroups {

        @XmlElement(name = "SubGroup")
        protected List<ProductGroupType.SubGroups.SubGroup> subGroup;

        /**
         * Gets the value of the subGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductGroupType.SubGroups.SubGroup }
         * 
         * 
         */
        public List<ProductGroupType.SubGroups.SubGroup> getSubGroup() {
            if (subGroup == null) {
                subGroup = new ArrayList<ProductGroupType.SubGroups.SubGroup>();
            }
            return this.subGroup;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ID" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}AlphaNumIDType" minOccurs="0"/&gt;
         *         &lt;element name="SubDescription" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}GroupDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "subDescription"
        })
        public static class SubGroup {

            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "SubDescription")
            protected List<GroupDescriptionType> subDescription;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the subDescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subDescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GroupDescriptionType }
             * 
             * 
             */
            public List<GroupDescriptionType> getSubDescription() {
                if (subDescription == null) {
                    subDescription = new ArrayList<GroupDescriptionType>();
                }
                return this.subDescription;
            }

        }

    }

}
