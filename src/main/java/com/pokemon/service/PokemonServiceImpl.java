package com.pokemon.service;

import com.pokemon.dao.PokemonRepository;
import com.pokemon.dao.PokemonRepositoryImpl;
import com.pokemon.model.Pokemon;
import com.pokemon.model.PokemonList;
import org.springframework.stereotype.Service;

@Service
public class PokemonServiceImpl implements PokemonService {
    private final PokemonRepository pokemonRepository;
    
    public PokemonServiceImpl() {
        // Using the Singleton pattern
        this.pokemonRepository = PokemonRepositoryImpl.getInstance();
    }
    
    @Override
    public PokemonList getPokemonList(int page, int size) {
        int offset = page * size;
        return pokemonRepository.getPokemonList(offset, size);
    }
    
    @Override
    public Pokemon getPokemonDetails(String nameOrId) {
        return pokemonRepository.getPokemonDetails(nameOrId);
    }
}