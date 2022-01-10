package com.example.JavaProject.service;

import com.example.JavaProject.model.Regiuni;
import com.example.JavaProject.repository.RegiuniRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class RegiuniGetService {

    private RegiuniRepository regiuniRepository;

    public RegiuniGetService(RegiuniRepository regiuniRepository) {
        this.regiuniRepository = regiuniRepository;
    }

    public Regiuni getRegiune(Long id){
        Optional<Regiuni> regiuniOptional = regiuniRepository.findById(id);
        if(regiuniOptional.isPresent()){
            return regiuniOptional.get();
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public List<Regiuni> getRegiuniAll() {

        if (regiuniRepository.findAll().isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        else{
            return regiuniRepository.findAll();
        }

    }
}
