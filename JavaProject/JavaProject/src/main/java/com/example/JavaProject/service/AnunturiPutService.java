package com.example.JavaProject.service;

import com.example.JavaProject.dto.UpdatePretRequest;
import com.example.JavaProject.model.Anunturi;
import com.example.JavaProject.repository.AnunturiRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class AnunturiPutService {

    private AnunturiRepository anunturiRepository;

    public AnunturiPutService(AnunturiRepository anunturiRepository) {
        this.anunturiRepository = anunturiRepository;
    }

    @Transactional
    public void updatePretById(UpdatePretRequest updatePretRequest){

        Optional<Anunturi> anunturiOptional = anunturiRepository.findById(updatePretRequest.getIdAnunt());

        if(anunturiOptional.isPresent()){
            anunturiRepository.updatePretById(updatePretRequest.getPretAnunt(), updatePretRequest.getIdAnunt());
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
    }

}
