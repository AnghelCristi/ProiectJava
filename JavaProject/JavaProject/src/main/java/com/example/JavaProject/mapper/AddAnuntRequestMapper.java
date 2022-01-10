package com.example.JavaProject.mapper;

import com.example.JavaProject.dto.AddAnuntRequest;
import com.example.JavaProject.model.Anunturi;
import org.springframework.stereotype.Component;

@Component
public class AddAnuntRequestMapper {

    public static Anunturi addAnuntRequestToAnunturi(AddAnuntRequest addAnuntRequest){
        return new Anunturi(
                addAnuntRequest.getMonthInAnunt(), addAnuntRequest.getMonthOutAnunt(),
                addAnuntRequest.getPretAnunt(),addAnuntRequest.getSportAnunt(),
                addAnuntRequest.getTaraAnunt(),addAnuntRequest.getRegiuneAnunt(),addAnuntRequest.getLocalitateAnunt()
        );
    }
}
