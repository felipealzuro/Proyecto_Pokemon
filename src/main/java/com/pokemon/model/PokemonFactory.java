package com.pokemon.model;

// Factory Pattern implementation
public class PokemonFactory {
    public static Pokemon createPokemon(String type, String name, int id) {
        Pokemon pokemon = new Pokemon();
        pokemon.setName(name);
        pokemon.setId(id);
        
        // Configure based on type
        switch (type.toLowerCase()) {
            case "fire":
                configureFire(pokemon);
                break;
            case "water":
                configureWater(pokemon);
                break;
            case "grass":
                configureGrass(pokemon);
                break;
            default:
                configureNormal(pokemon);
                break;
        }
        
        return pokemon;
    }
    
    private static void configureFire(Pokemon pokemon) {
        // Configure fire type specific attributes
        pokemon.setBaseExperience(150);
    }
    
    private static void configureWater(Pokemon pokemon) {
        // Configure water type specific attributes
        pokemon.setBaseExperience(140);
    }
    
    private static void configureGrass(Pokemon pokemon) {
        // Configure grass type specific attributes
        pokemon.setBaseExperience(130);
    }
    
    private static void configureNormal(Pokemon pokemon) {
        // Configure normal type specific attributes
        pokemon.setBaseExperience(100);
    }
}