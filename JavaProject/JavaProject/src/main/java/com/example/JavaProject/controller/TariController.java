package com.example.JavaProject.controller;


import com.example.JavaProject.model.Tari;
import com.example.JavaProject.service.TariGetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tari")
public class TariController {

    private TariGetService tariGetService;

    public TariController(TariGetService tariGetService) {
        this.tariGetService = tariGetService;
    }

    @GetMapping
    public List<Tari> getAllTari(){
        return tariGetService.getTariAll();
    }

    @GetMapping(value = "/{id}")
    public Tari getTara(@PathVariable Long id){
        return tariGetService.getTara(id);
    }

}
