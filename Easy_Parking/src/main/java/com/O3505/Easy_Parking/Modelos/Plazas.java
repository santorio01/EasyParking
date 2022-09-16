/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Modelos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Santorio
 */
@Table
@Entity(name = "plazas")

public class Plazas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplazas")
    private String idplazas;

    @Column(name = "plazas_disponibles")
    private String Plazas_Disponibles;

    @Column(name = "plazas_ocupadas")
    private String plazas_ocupadas;

    @Column(name = "total_de_plazas")
    private String total_de_plazas;

    @OneToOne
    @JoinColumn(name = "tipo_de_vehiculo_idtipo_de_vehiculo")
    private Tipo_Vehiculo tipo_vehiculo;

    public String getIdplazas() {
        return idplazas;
    }

    public void setIdplazas(String idplazas) {
        this.idplazas = idplazas;
    }

    public String getPlazas_Disponibles() {
        return Plazas_Disponibles;
    }

    public void setPlazas_Disponibles(String Plazas_Disponibles) {
        this.Plazas_Disponibles = Plazas_Disponibles;
    }

    public String getPlazas_ocupadas() {
        return plazas_ocupadas;
    }

    public void setPlazas_ocupadas(String plazas_ocupadas) {
        this.plazas_ocupadas = plazas_ocupadas;
    }

    public String getTotal_de_plazas() {
        return total_de_plazas;
    }

    public void setTotal_de_plazas(String total_de_plazas) {
        this.total_de_plazas = total_de_plazas;
    }

    public Tipo_Vehiculo getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(Tipo_Vehiculo tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    
}
