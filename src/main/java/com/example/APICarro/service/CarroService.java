package com.example.APICarro.service;

import com.example.APICarro.exceptions.ResorceNotFoundExcepetions;
import com.example.APICarro.model.Carro;
import com.example.APICarro.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    @Autowired
    private CarroRepository repository;

    public Carro findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ResorceNotFoundExcepetions("this id not found"));
    }
    public List<Carro> findAll(){
       return repository.findAll();
    }
    public Carro create(Carro carro){
       return repository.save(carro);
    }
    public Carro upadate(Carro carro){
        Carro car = repository.findById(carro.getId()).orElseThrow(() -> new ResorceNotFoundExcepetions("This id not exist or not found"));
        car.setMarca(carro.getMarca());
        car.setModelo(carro.getModelo());
        car.setAno(carro.getAno());
        car.setPlaca(carro.getPlaca());
        car.setKm(carro.getKm());
        return repository.save(carro);
    }
    public void delete(Long id){
        Carro entity = repository.findById(id).orElseThrow(() -> new ResorceNotFoundExcepetions("This id not exist!!"));
        repository.delete(entity);
    }
}
