package com.example.APICarro.controllers;

import com.example.APICarro.model.Carro;
import com.example.APICarro.repository.CarroRepository;
import com.example.APICarro.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarroControllers {
    @Autowired
    private CarroService service;
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Carro findById(@PathVariable(value = "id") Long id){
        return service.findById(id);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Carro> findAll(){
        return service.findAll();
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Carro create(@RequestBody Carro carro){
        return service.create(carro);
    }
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Carro update(@RequestBody Carro carro){
        return service.upadate(carro);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        service.delete(id);
    }
}
