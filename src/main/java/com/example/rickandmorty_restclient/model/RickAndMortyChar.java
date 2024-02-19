package com.example.rickandmorty_restclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RickAndMortyChar {

    private String id;
    private String name;
    private String species;

}
