//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.03.24 a las 09:24:43 PM GMT-05:00 
//


package com.pokemon.soap.generated;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="baseExperience" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="types" type="{http://pokemon.com/soap}typeWrapper" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="abilities" type="{http://pokemon.com/soap}abilityWrapper" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sprites" type="{http://pokemon.com/soap}sprites" minOccurs="0"/&gt;
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
    "name",
    "height",
    "weight",
    "baseExperience",
    "types",
    "abilities",
    "sprites"
})
@XmlRootElement(name = "getPokemonDetailsResponse")
public class GetPokemonDetailsResponse {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    protected int height;
    protected int weight;
    protected int baseExperience;
    protected List<TypeWrapper> types;
    protected List<AbilityWrapper> abilities;
    protected Sprites sprites;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
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
     * Define el valor de la propiedad name.
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
     * Obtiene el valor de la propiedad height.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Obtiene el valor de la propiedad weight.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Define el valor de la propiedad weight.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

    /**
     * Obtiene el valor de la propiedad baseExperience.
     * 
     */
    public int getBaseExperience() {
        return baseExperience;
    }

    /**
     * Define el valor de la propiedad baseExperience.
     * 
     */
    public void setBaseExperience(int value) {
        this.baseExperience = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWrapper }
     * 
     * 
     */
    public List<TypeWrapper> getTypes() {
        if (types == null) {
            types = new ArrayList<TypeWrapper>();
        }
        return this.types;
    }

    /**
     * Gets the value of the abilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the abilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbilityWrapper }
     * 
     * 
     */
    public List<AbilityWrapper> getAbilities() {
        if (abilities == null) {
            abilities = new ArrayList<AbilityWrapper>();
        }
        return this.abilities;
    }

    /**
     * Obtiene el valor de la propiedad sprites.
     * 
     * @return
     *     possible object is
     *     {@link Sprites }
     *     
     */
    public Sprites getSprites() {
        return sprites;
    }

    /**
     * Define el valor de la propiedad sprites.
     * 
     * @param value
     *     allowed object is
     *     {@link Sprites }
     *     
     */
    public void setSprites(Sprites value) {
        this.sprites = value;
    }

}
