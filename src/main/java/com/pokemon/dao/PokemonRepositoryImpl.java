package com.pokemon.dao;

import com.pokemon.model.Pokemon;
import com.pokemon.model.PokemonList;
import org.springframework.stereotype.Repository;

@Repository
public class PokemonRepositoryImpl implements PokemonRepository {
    private static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon";
    private final RestTemplate restTemplate;
    
    // Singleton pattern - private instance
    private static PokemonRepositoryImpl instance;
    
    // Private constructor
    private PokemonRepositoryImpl() {
        this.restTemplate = new RestTemplate();
    }
    
    // Singleton pattern - get instance method
    public static synchronized PokemonRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new PokemonRepositoryImpl();
        }
        return instance;
    }
    
    @Override
    public PokemonList getPokemonList(int offset, int limit) {
        String url = BASE_URL + "?offset=" + offset + "&limit=" + limit;
        return ((Object) restTemplate).getForObject(url, PokemonList.class);
    }
    
    @Override
    public Pokemon getPokemonDetails(String nameOrId) {
        String url = BASE_URL + "/" + nameOrId;
        return restTemplate.getForObject(url, Pokemon.class);
    }
}