package com.pokemon.pokemon_soap_service.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.pokemon.soap.generated.Abilities;
import com.pokemon.soap.generated.Pokemon;

import jakarta.annotation.PostConstruct;

@Component
public class PokemonRepository {
    private static final Map<Integer, Pokemon> pokemonMap = new HashMap<>();

    @PostConstruct
    public void initData() {
        // Pikachu
        Pokemon pikachu = new Pokemon();
        pikachu.setId(25);
        pikachu.setName("Pikachu");
        pikachu.setType("Electric");
        pikachu.setHeight(0.4);
        pikachu.setWeight(6.0);
        
        Abilities pikachuAbilities = new Abilities();
        pikachuAbilities.getAbility().add("Static");
        pikachuAbilities.getAbility().add("Lightning Rod");
        pikachu.setAbilities(pikachuAbilities);
        
        pokemonMap.put(pikachu.getId(), pikachu);

        // Charizard
        Pokemon charizard = new Pokemon();
        charizard.setId(6);
        charizard.setName("Charizard");
        charizard.setType("Fire/Flying");
        charizard.setHeight(1.7);
        charizard.setWeight(90.5);
        
        Abilities charizardAbilities = new Abilities();
        charizardAbilities.getAbility().add("Blaze");
        charizardAbilities.getAbility().add("Solar Power");
        charizard.setAbilities(charizardAbilities);
        
        pokemonMap.put(charizard.getId(), charizard);

        // Bulbasaur
        Pokemon bulbasaur = new Pokemon();
        bulbasaur.setId(1);
        bulbasaur.setName("Bulbasaur");
        bulbasaur.setType("Grass/Poison");
        bulbasaur.setHeight(0.7);
        bulbasaur.setWeight(6.9);
        
        Abilities bulbasaurAbilities = new Abilities();
        bulbasaurAbilities.getAbility().add("Overgrow");
        bulbasaurAbilities.getAbility().add("Chlorophyll");
        bulbasaur.setAbilities(bulbasaurAbilities);
        
        pokemonMap.put(bulbasaur.getId(), bulbasaur);
    }

    public Pokemon findPokemonById(int id) {
        return pokemonMap.get(id);
    }

    public List<Pokemon> findAllPokemon() {
        return new ArrayList<>(pokemonMap.values());
    }
}

