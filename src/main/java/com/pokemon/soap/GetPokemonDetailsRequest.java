package com.pokemon.soap;

public class GetPokemonDetailsRequest {
    private String nameOrId;
    
    public String getNameOrId() {
        return nameOrId;
    }
    
    public void setNameOrId(String nameOrId) {
        this.nameOrId = nameOrId;
    }
}
