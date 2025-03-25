//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.03.24 a las 08:21:03 PM COT 
//


package com.pokemon.soap.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sprites complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sprites"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="frontDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="backDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sprites", propOrder = {
    "frontDefault",
    "backDefault"
})
public class Sprites {

    protected String frontDefault;
    protected String backDefault;

    /**
     * Obtiene el valor de la propiedad frontDefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontDefault() {
        return frontDefault;
    }

    /**
     * Define el valor de la propiedad frontDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontDefault(String value) {
        this.frontDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad backDefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackDefault() {
        return backDefault;
    }

    /**
     * Define el valor de la propiedad backDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackDefault(String value) {
        this.backDefault = value;
    }

}
