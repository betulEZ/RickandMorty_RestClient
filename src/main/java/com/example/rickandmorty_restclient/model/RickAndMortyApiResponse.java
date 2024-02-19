package com.example.rickandmorty_restclient.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RickAndMortyApiResponse {

    List<RickAndMortyChar> results;

    public int getSize() {
        if (results != null) {
            return results.size();
        } else {
            return 0;
        }
    }
}