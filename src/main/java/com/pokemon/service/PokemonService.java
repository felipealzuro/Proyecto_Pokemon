package com.pokemon.service;

import com.pokemon.model.Pokemon;
import com.pokemon.model.PokemonList;

public interface PokemonService {
    PokemonList getPokemonList(int page, int size);
    Pokemon getPokemonDetails(String nameOrId);
}