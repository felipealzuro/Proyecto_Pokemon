package com.pokemon.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    private int id;
    private String name;
    private int height;
    private int weight;
    
    @JsonProperty("base_experience")
    private int baseExperience;
    
    private List<TypeWrapper> types = new ArrayList<>();
    private List<AbilityWrapper> abilities = new ArrayList<>();
    private Sprites sprites;
    
    // Getters y setters
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
    
    public List<TypeWrapper> getTypes() {
        return types;
    }
    
    public void setTypes(List<TypeWrapper> types) {
        this.types = types;
    }
    
    public List<AbilityWrapper> getAbilities() {
        return abilities;
    }
    
    public void setAbilities(List<AbilityWrapper> abilities) {
        this.abilities = abilities;
    }
    
    public Sprites getSprites() {
        return sprites;
    }
    
    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypeWrapper {
        private int slot;
        private Type type;
        
        public int getSlot() {
            return slot;
        }
        
        public void setSlot(int slot) {
            this.slot = slot;
        }
        
        public Type getType() {
            return type;
        }
        
        public void setType(Type soapType) {
            this.type = soapType;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Type {
        private String name;
        private String url;
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getUrl() {
            return url;
        }
        
        public void setUrl(String url) {
            this.url = url;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AbilityWrapper {
        private boolean hidden;
        private int slot;
        private Ability ability;
        
        public boolean isHidden() {
            return hidden;
        }
        
        public void setHidden(boolean hidden) {
            this.hidden = hidden;
        }
        
        public int getSlot() {
            return slot;
        }
        
        public void setSlot(int slot) {
            this.slot = slot;
        }
        
        public Ability getAbility() {
            return ability;
        }
        
        public void setAbility(Ability ability) {
            this.ability = ability;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Ability {
        private String name;
        private String url;
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getUrl() {
            return url;
        }
        
        public void setUrl(String url) {
            this.url = url;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Sprites {
        @JsonProperty("front_default")
        private String frontDefault;
        
        @JsonProperty("back_default")
        private String backDefault;
        
        public String getFrontDefault() {
            return frontDefault;
        }
        
        public void setFrontDefault(String frontDefault) {
            this.frontDefault = frontDefault;
        }
        
        public String getBackDefault() {
            return backDefault;
        }
        
        public void setBackDefault(String backDefault) {
            this.backDefault = backDefault;
        }
    }
}