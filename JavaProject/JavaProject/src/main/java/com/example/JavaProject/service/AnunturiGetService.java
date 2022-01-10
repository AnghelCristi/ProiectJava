package com.example.JavaProject.service;

import com.example.JavaProject.model.Anunturi;
import com.example.JavaProject.repository.AnunturiRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AnunturiGetService {

    private AnunturiRepository anunturiRepository;

    public AnunturiGetService(AnunturiRepository anunturiRepository) {
        this.anunturiRepository = anunturiRepository;
    }

    public Anunturi getAnunt(Long id){
        Optional<Anunturi> anunturiOptional = anunturiRepository.findById(id);
        if(anunturiOptional.isPresent()){
            return anunturiOptional.get();
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public List<Anunturi> getAnunturiAll(){

        if(anunturiRepository.findAll().isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        else{
            return anunturiRepository.findAll();
        }
    }

    public List<Anunturi> getAnunturiBySport(String sport){

        if(anunturiRepository.findBySport(sport).isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        else{
            return anunturiRepository.findBySport(sport);
        }
    }

    public List<Anunturi> getAnunturibyDate(long dataIn, long dataOut){

        if(anunturiRepository.findByMonthInEqualsAndMonthOutEquals(dataIn,dataOut).isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        else{
            return anunturiRepository.findByMonthInEqualsAndMonthOutEquals(dataIn, dataOut);
        }
    }


}
