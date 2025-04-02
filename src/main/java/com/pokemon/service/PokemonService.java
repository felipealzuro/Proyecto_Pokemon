package com.pokemon.service;

import com.pokemon.model.Pokemon;
import com.pokemon.model.PokemonList;

public interface PokemonService {
    
    PokemonList getPokemonList(int offset, int limit);
    
    Pokemon getPokemonDetails(String nameOrId);
}