package com.example.rickandmorty_restclient.service;

import com.example.rickandmorty_restclient.model.RickAndMortyApiResponse;
import com.example.rickandmorty_restclient.model.RickAndMortyChar;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClient;

@Service
public class RickAndMortyService {
    private RestClient restClient = RestClient.builder()
            .baseUrl("https://rickandmortyapi.com/api")
            .build();
    public RickAndMortyApiResponse getAllRickAndMortyChars() {
        RickAndMortyApiResponse response = restClient.get()
                .uri("/character")
                .retrieve()
                .body(RickAndMortyApiResponse.class);
        return response;
    }
    public RickAndMortyChar searchById(String id){
        RickAndMortyChar response = restClient.get()
                .uri("/character/"+id)
                .retrieve()
                .body(RickAndMortyChar.class);
        return response;
    }
    public RickAndMortyApiResponse searchByStatus(String status){
        RickAndMortyApiResponse response = restClient.get()
                .uri("/character/?status="+status)
                .retrieve()
                .body(RickAndMortyApiResponse.class);
        return response;
    }
}
