package com.example.APICarro.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "carros")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "marca",length = 15, nullable = false)
    private String marca;
    @Column(name = "modelo", length = 10, nullable = false)
    private String modelo;
    @Column(name = "ano", nullable = false)
    private Integer ano;
    @Column(name = "placa", length = 7, nullable = false)
    private String placa;
    @Column(name = "quilometragem", nullable = false)
    private Double km;
    //

    public Carro() {
    }

    public Carro(String marca, String modelo, Integer ano, String placa, Double km, Long id) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.km = km;
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(id, carro.id) && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(ano, carro.ano) && Objects.equals(placa, carro.placa) && Objects.equals(km, carro.km);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marca, modelo, ano, placa, km);
    }
}
