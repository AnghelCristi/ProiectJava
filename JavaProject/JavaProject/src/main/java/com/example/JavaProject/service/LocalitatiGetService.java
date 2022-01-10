package com.example.JavaProject.service;

import com.example.JavaProject.model.Localitati;
import com.example.JavaProject.repository.LocalitatiRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service
public class LocalitatiGetService {

    private LocalitatiRepository localitatiRepository;

    public LocalitatiGetService(LocalitatiRepository localitatiRepository) {
        this.localitatiRepository = localitatiRepository;
    }

    public Localitati getLocalitate(Long id){
        Optional<Localitati> localitatiOptional = localitatiRepository.findById(id);
        if(localitatiOptional.isPresent()){
            return localitatiOptional.get();
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public List<Localitati> getLocalitatiAll() {

        if (localitatiRepository.findAll().isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        else{
            return localitatiRepository.findAll();
        }
    }
}
