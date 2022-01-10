package com.example.JavaProject.controller;

import com.example.JavaProject.dto.AddAnuntRequest;
import com.example.JavaProject.dto.AddAnuntRequestV1;
import com.example.JavaProject.dto.UpdatePretRequest;
import com.example.JavaProject.mapper.AddAnuntRequestMapper;
import com.example.JavaProject.model.Anunturi;
import com.example.JavaProject.service.AnunturiDeleteService;
import com.example.JavaProject.service.AnunturiGetService;
import com.example.JavaProject.service.AnunturiPostService;
import com.example.JavaProject.service.AnunturiPutService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/anunturi")
public class AnunturiController {

    private AnunturiGetService anunturiGetService;
    private AnunturiDeleteService anunturiDeleteService;
    private AnunturiPutService anunturiPutService;
    private AnunturiPostService anunturiPostService;

    public AnunturiController(AnunturiGetService anunturiGetService, AnunturiDeleteService anunturiDeleteService, AnunturiPutService anunturiPutService, AnunturiPostService anunturiPostService) {
        this.anunturiGetService = anunturiGetService;
        this.anunturiDeleteService = anunturiDeleteService;
        this.anunturiPutService = anunturiPutService;
        this.anunturiPostService = anunturiPostService;
    }

    @GetMapping
    public List<Anunturi> getAllAnunturi(){
        return anunturiGetService.getAnunturiAll();
    }

    @GetMapping(value = "/{id}")
    public Anunturi getAnunt(@PathVariable Long id){
        return anunturiGetService.getAnunt(id);
    }

    @GetMapping(value = "/sport/{sport}")
    public List<Anunturi> getAllAnunturibySport(@PathVariable String sport){
        return anunturiGetService.getAnunturiBySport(sport);
    }
    @GetMapping(value = "date/{dataIn}/{dataOut}")
    public List<Anunturi> getAllAnunturibyDate(
            @PathVariable Long dataIn,
            @PathVariable Long dataOut){

        return anunturiGetService.getAnunturibyDate(dataIn,dataOut);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteAnunt(@PathVariable Long id){
        anunturiDeleteService.deleteAnunt(id);
    }

    @PutMapping(value = "/pretById")
    public void updatePretAnuntById(
            @Valid
            @RequestBody
                    UpdatePretRequest updatePretRequest){
        anunturiPutService.updatePretById(updatePretRequest);
    }

    @PostMapping
    public ResponseEntity<Anunturi> createAnunt(
            @Valid
            @RequestBody AddAnuntRequest addAnuntRequest){
        Anunturi anunturi = AddAnuntRequestMapper.addAnuntRequestToAnunturi(addAnuntRequest);
        Anunturi createdAnunturi = AnunturiPostService.createAnunt(anunturi);
        return ResponseEntity
                .created(URI.create("/anunturi/" + createdAnunturi.getIdAnunt()))
                .body(createdAnunturi);
    }

    @PostMapping(value = "/v1")
    public void createAnunt(
            @Valid
            @RequestBody
            AddAnuntRequestV1 addAnuntRequestV1) {
        anunturiPostService.createNewAnunt(addAnuntRequestV1);
    }
}
