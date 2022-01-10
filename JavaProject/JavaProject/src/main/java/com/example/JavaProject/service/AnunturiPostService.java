package com.example.JavaProject.service;

import com.example.JavaProject.dto.AddAnuntRequestV1;
import com.example.JavaProject.model.Anunturi;
import com.example.JavaProject.repository.AnunturiRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AnunturiPostService {

    private static AnunturiRepository anunturiRepository;

    public AnunturiPostService(AnunturiRepository anunturiRepository) {
        this.anunturiRepository = anunturiRepository;
    }

    public static Anunturi createAnunt(Anunturi anunturi){
        return anunturiRepository.save(anunturi);
    }

    @Transactional
    public void createNewAnunt(AddAnuntRequestV1 addAnuntRequestV1){
        anunturiRepository.adaugareAnunt(
                addAnuntRequestV1.getMonthInAnunt(),addAnuntRequestV1.getMonthOutAnunt(),
                addAnuntRequestV1.getPretAnunt(),addAnuntRequestV1.getSportAnunt(),
                addAnuntRequestV1.getIdLocalitateAnunt(),addAnuntRequestV1.getIdRegiuneAnunt(),addAnuntRequestV1.getIdTaraAnunt()
        );
    }
}
