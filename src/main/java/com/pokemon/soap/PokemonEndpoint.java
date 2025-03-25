package com.pokemon.soap;

import com.pokemon.model.Pokemon;
import com.pokemon.model.Pokemon.Ability;
import com.pokemon.model.Pokemon.AbilityWrapper;
import com.pokemon.model.Pokemon.TypeWrapper;
import com.pokemon.model.PokemonList;
import com.pokemon.model.PokemonList.PokemonEntry;
import com.pokemon.service.PokemonService;
import com.pokemon.service.PokemonServiceImpl;

import ch.qos.logback.core.subst.Token.Type;

@Endpoint
public class PokemonEndpoint {
    private static final String NAMESPACE_URI = "http://pokemon.com/soap";
    private final PokemonService pokemonService;

    public PokemonEndpoint() {
        this.pokemonService = new PokemonServiceImpl();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonListRequest")
    @ResponsePayload
    public GetPokemonListResponse getPokemonList(@RequestPayload GetPokemonListRequest request) {
        GetPokemonListResponse response = new GetPokemonListResponse();
        
        PokemonList pokemonList = pokemonService.getPokemonList(request.getPage(), request.getSize());
        
        response.setCount(pokemonList.getCount());
        response.setNext(pokemonList.getNext());
        response.setPrevious(pokemonList.getPrevious());
        
        // Map results
        if (pokemonList.getResults() != null) {
            for (PokemonList.PokemonEntry entry : pokemonList.getResults()) {
                PokemonEntry soapEntry = new PokemonEntry();
                soapEntry.setName(entry.getName());
                soapEntry.setUrl(entry.getUrl());
                response.getResults().add(soapEntry);
            }
        }
        
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonDetailsRequest")
    @ResponsePayload
    public GetPokemonDetailsResponse getPokemonDetails(@RequestPayload GetPokemonDetailsRequest request) {
        GetPokemonDetailsResponse response = new GetPokemonDetailsResponse();
        
        Pokemon pokemon = pokemonService.getPokemonDetails(request.getNameOrId());
        
        response.setId(pokemon.getId());
        response.setName(pokemon.getName());
        response.setHeight(pokemon.getHeight());
        response.setHeight(pokemon.getWeight());
        response.setBaseExperience(pokemon.getBaseExperience());
        
        // Map types
        if (pokemon.getTypes() != null) {
            for (Pokemon.TypeWrapper typeWrapper : pokemon.getTypes()) {
                TypeWrapper soapTypeWrapper = new TypeWrapper();
                soapTypeWrapper.setSlot(typeWrapper.getSlot());
                
                Type soapType = new Type();
                soapType.setName(typeWrapper.getType().getName());
                soapType.setUrl(typeWrapper.getType().getUrl());
                
                soapTypeWrapper.setType(soapType);
                response.getTypes().add(soapTypeWrapper);
            }
        }
        
        // Map abilities
        if (pokemon.getAbilities() != null) {
            for (Pokemon.AbilityWrapper abilityWrapper : pokemon.getAbilities()) {
                AbilityWrapper soapAbilityWrapper = new AbilityWrapper();
                soapAbilityWrapper.setHidden(abilityWrapper.isHidden());
                soapAbilityWrapper.setSlot(abilityWrapper.getSlot());
                
                Ability soapAbility = new Ability();
                soapAbility.setName(abilityWrapper.getAbility().getName());
                soapAbility.setUrl(abilityWrapper.getAbility().getUrl());
                
                soapAbilityWrapper.setAbility(soapAbility);
                ((Pokemon) response).getAbilities().add(soapAbilityWrapper);
            }
        }
        
        // Map sprites
        if (pokemon.getSprites() != null) {
            Sprites soapSprites = new Sprites();
            soapSprites.setFrontDefault(pokemon.getSprites().getFrontDefault());
            soapSprites.setBackDefault(pokemon.getSprites().getBackDefault());
            response.setSprites(soapSprites);
        }
        
        return response;
    }
}