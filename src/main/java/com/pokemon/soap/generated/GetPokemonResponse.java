//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.04.02 a las 04:53:01 PM GMT-05:00 
//


package com.pokemon.soap.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pokemon" type="{http://pokemon.com/soap/generated}pokemon"/&gt;
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
    "pokemon"
})
@XmlRootElement(name = "getPokemonResponse")
public class GetPokemonResponse {

    @XmlElement(required = true)
    protected Pokemon pokemon;

    /**
     * Obtiene el valor de la propiedad pokemon.
     * 
     * @return
     *     possible object is
     *     {@link Pokemon }
     *     
     */
    public Pokemon getPokemon() {
        return pokemon;
    }

    /**
     * Define el valor de la propiedad pokemon.
     * 
     * @param value
     *     allowed object is
     *     {@link Pokemon }
     *     
     */
    public void setPokemon(Pokemon value) {
        this.pokemon = value;
    }

}
