package com.example.JavaProject.controller;

import com.example.JavaProject.model.Regiuni;
import com.example.JavaProject.service.RegiuniGetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/regiuni")
public class RegiuniController {

    public RegiuniGetService regiuniGetService;

    public RegiuniController(RegiuniGetService regiuniGetService) {
        this.regiuniGetService = regiuniGetService;
    }

    @GetMapping
    public List<Regiuni> getAllRegiuni(){
        return regiuniGetService.getRegiuniAll();
    }

    @GetMapping("/{id}")
    public Regiuni getRegiune(@PathVariable Long id){
        return regiuniGetService.getRegiune(id);
    }

}
