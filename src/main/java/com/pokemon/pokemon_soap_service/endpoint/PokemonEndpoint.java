package com.pokemon.pokemon_soap_service.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.pokemon.pokemon_soap_service.repository.PokemonRepository;
import com.pokemon.soap.generated.GetAllPokemonRequest;
import com.pokemon.soap.generated.GetAllPokemonResponse;
import com.pokemon.soap.generated.GetPokemonRequest;
import com.pokemon.soap.generated.GetPokemonResponse;

@Endpoint
public class PokemonEndpoint {
    private static final String NAMESPACE_URI = "http://pokemon.com/soap/generated";

    private final PokemonRepository pokemonRepository;

    @Autowired
    public PokemonEndpoint(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonRequest")
    @ResponsePayload
    public GetPokemonResponse getPokemon(@RequestPayload GetPokemonRequest request) {
        GetPokemonResponse response = new GetPokemonResponse();
        response.setPokemon(pokemonRepository.findPokemonById(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllPokemonRequest")
    @ResponsePayload
    public GetAllPokemonResponse getAllPokemon(@RequestPayload GetAllPokemonRequest request) {
        GetAllPokemonResponse response = new GetAllPokemonResponse();
        pokemonRepository.findAllPokemon().forEach(response.getPokemon()::add);
        return response;
    }
}

