package com.example.JavaProject.controller;

import com.example.JavaProject.model.Localitati;
import com.example.JavaProject.service.LocalitatiGetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/localitati")
public class LocalitatiController {

    public LocalitatiGetService localitatiGetService;

    public LocalitatiController(LocalitatiGetService localitatiGetService) {
        this.localitatiGetService = localitatiGetService;
    }

    @GetMapping
    public List<Localitati> getAllLocalitati(){
        return localitatiGetService.getLocalitatiAll();
    }

    @GetMapping("/{id}")
    public Localitati getLocalitate(@PathVariable Long id){
        return localitatiGetService.getLocalitate(id);
    }

}