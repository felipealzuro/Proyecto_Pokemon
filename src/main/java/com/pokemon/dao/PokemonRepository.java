package com.pokemon.dao;

import com.pokemon.model.Pokemon;
import com.pokemon.model.PokemonList;

public interface PokemonRepository {
    PokemonList getPokemonList(int offset, int limit);
    Pokemon getPokemonDetails(String nameOrId);
}