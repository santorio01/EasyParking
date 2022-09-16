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
import javax.persistence.Table;


/**
 *
 * @author Santorio
 */

@Table
@Entity (name="tipo_de_vehiculo")

public class Tipo_Vehiculo implements Serializable {
    

    @Id  
   @GeneratedValue(strategy = GenerationType.IDENTITY)  
   @Column(name="idtipo_de_vehiculo")  
   private Integer idtipo_de_vehiculo;   
   
   @Column(name="descripcion")  
   private String descripcion; 
   
   @Column(name="tarifa")  
   private Integer tarifa; 

    public Integer getIdtipo_de_vehiculo() {
        return idtipo_de_vehiculo;
    }

    public void setIdtipo_de_vehiculo(Integer idtipo_de_vehiculo) {
        this.idtipo_de_vehiculo = idtipo_de_vehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }
   
   
    
    
    
    
    
    
    
}
