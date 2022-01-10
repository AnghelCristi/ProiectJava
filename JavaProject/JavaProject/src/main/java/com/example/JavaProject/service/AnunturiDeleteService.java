package com.example.JavaProject.service;

import com.example.JavaProject.model.Anunturi;
import com.example.JavaProject.repository.AnunturiRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class AnunturiDeleteService {

    private AnunturiRepository anunturiRepository;

    public AnunturiDeleteService(AnunturiRepository anunturiRepository) {
        this.anunturiRepository = anunturiRepository;
    }

    public void deleteAnunt(Long id){
        Optional<Anunturi> anunturiOptional = anunturiRepository.findById(id);

        if(anunturiOptional.isPresent()){
            anunturiRepository.deleteAnunturiByIdAnunt(id);
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }
}
