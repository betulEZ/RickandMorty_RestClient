package com.example.rickandmorty_restclient.controller;

import com.example.rickandmorty_restclient.model.RickAndMortyApiResponse;
import com.example.rickandmorty_restclient.model.RickAndMortyChar;
import com.example.rickandmorty_restclient.service.RickAndMortyService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rick")
@RequiredArgsConstructor
public class RickAndMortyController {
    private final RickAndMortyService service;

    @GetMapping
    public RickAndMortyApiResponse getAllRickAndMortyChars(){
        return service.getAllRickAndMortyChars();
    }
    @GetMapping("/{id}")
    public RickAndMortyChar getById(@PathVariable String id){
        return service.searchById(id);
    }
    @GetMapping("/status")
    public RickAndMortyApiResponse getByStatus(@RequestParam String status){
        return service.searchByStatus(status);
    }
}
