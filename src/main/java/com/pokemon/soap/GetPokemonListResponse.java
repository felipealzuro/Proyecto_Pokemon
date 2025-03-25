package com.pokemon.soap;

import java.util.List;

import com.pokemon.model.PokemonList.PokemonEntry;

public interface GetPokemonListResponse {

    void setCount(int count);

    void setNext(String next);

    void setPrevious(String previous);

    List<PokemonEntry> getResults();

}
