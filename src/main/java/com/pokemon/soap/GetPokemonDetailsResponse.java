package com.pokemon.soap;

import java.util.ArrayList;
import java.util.List;

import com.pokemon.model.Pokemon;

public class GetPokemonDetailsResponse {
    private int id;
    private String name;
    private int height;
    private int weight;
    private int baseExperience;
    private List<String> types = new ArrayList<>();
    private List<String> abilities = new ArrayList<>();
    private String frontSprite;
    private String backSprite;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public int getBaseExperience() {
        return baseExperience;
    }
    
    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }
    
    public List<String> getTypes() {
        return types;
    }
    
    public void setTypes(List<String> types) {
        this.types = types;
    }
    
    public List<String> getAbilities() {
        return abilities;
    }
    
    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }
    
    public String getFrontSprite() {
        return frontSprite;
    }
    
    public void setFrontSprite(String frontSprite) {
        this.frontSprite = frontSprite;
    }
    
    public String getBackSprite() {
        return backSprite;
    }
    
    public void setBackSprite(String backSprite) {
        this.backSprite = backSprite;
    }
    
    // Método de conveniencia para mapear desde el modelo Pokemon
    public void mapFromPokemon(Pokemon pokemon) {
        this.id = pokemon.getId();
        this.name = pokemon.getName();
        this.height = pokemon.getHeight();
        this.weight = pokemon.getWeight();
        this.baseExperience = pokemon.getBaseExperience();
        
        // Mapear tipos
        if (pokemon.getTypes() != null) {
            for (Pokemon.TypeWrapper typeWrapper : pokemon.getTypes()) {
                this.types.add(typeWrapper.getType().getName());
            }
        }
        
        // Mapear habilidades
        if (pokemon.getAbilities() != null) {
            for (Pokemon.AbilityWrapper abilityWrapper : pokemon.getAbilities()) {
                this.abilities.add(abilityWrapper.getAbility().getName());
            }
        }
        
        // Mapear sprites
        if (pokemon.getSprites() != null) {
            this.frontSprite = pokemon.getSprites().getFrontDefault();
            this.backSprite = pokemon.getSprites().getBackDefault();
        }
    }
}