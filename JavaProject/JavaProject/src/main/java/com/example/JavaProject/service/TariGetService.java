package com.example.JavaProject.service;

import com.example.JavaProject.model.Tari;
import com.example.JavaProject.repository.TariRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TariGetService {

    private TariRepository tariRepository;

    public TariGetService(TariRepository tariRepository) {
        this.tariRepository = tariRepository;
    }

    public Tari getTara(Long id){
        Optional<Tari> taraOptional = tariRepository.findById(id);
        if(taraOptional.isPresent()){
            return taraOptional.get();
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public List<Tari> getTariAll() {

        if (tariRepository.findAll().isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);

        }
        else{
            return tariRepository.findAll();
        }
    }


}
