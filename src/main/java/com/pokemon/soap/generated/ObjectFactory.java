//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.04.02 a las 04:53:01 PM GMT-05:00 
//


package com.pokemon.soap.generated;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pokemon.soap.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pokemon.soap.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPokemonRequest }
     * 
     */
    public GetPokemonRequest createGetPokemonRequest() {
        return new GetPokemonRequest();
    }

    /**
     * Create an instance of {@link GetPokemonResponse }
     * 
     */
    public GetPokemonResponse createGetPokemonResponse() {
        return new GetPokemonResponse();
    }

    /**
     * Create an instance of {@link Pokemon }
     * 
     */
    public Pokemon createPokemon() {
        return new Pokemon();
    }

    /**
     * Create an instance of {@link GetAllPokemonRequest }
     * 
     */
    public GetAllPokemonRequest createGetAllPokemonRequest() {
        return new GetAllPokemonRequest();
    }

    /**
     * Create an instance of {@link GetAllPokemonResponse }
     * 
     */
    public GetAllPokemonResponse createGetAllPokemonResponse() {
        return new GetAllPokemonResponse();
    }

    /**
     * Create an instance of {@link Abilities }
     * 
     */
    public Abilities createAbilities() {
        return new Abilities();
    }

}
