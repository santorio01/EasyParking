/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Modelos;

import java.io.Serializable;
import java.text.DateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Santorio
 */

@Table
@Entity(name="registro")
public class Registro implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name= "idregistro")
    private Integer idregistro;
    
    
    @Column(name="placa")
    private String placa;
    
    @Column(name="hora_ingreso")
    private DateFormat hora_ingreso;
    
    @Column(name="hora_salida")
    private DateFormat hora_salida;
    
    
    @ManyToOne
    @JoinColumn(name= "tipo_de_vehiculo_idtipo_de_vehiculo")
    private Tipo_Vehiculo tipo_Vehiculo;
    
    @Column (name="fechafactura")
    private DateFormat fechafactura;
    
    @Column (name= "valorfactura")
    private Double valorfactura; 

    public Integer getIdregistro() {
        return idregistro;
    }

    public void setIdregistro(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public DateFormat getHora_ingreso() {
        return hora_ingreso;
    }

    public void setHora_ingreso(DateFormat hora_ingreso) {
        this.hora_ingreso = hora_ingreso;
    }

    public DateFormat getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(DateFormat hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Tipo_Vehiculo getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(Tipo_Vehiculo tipo_Vehiculo) {
        this.tipo_Vehiculo = tipo_Vehiculo;
    }

    public DateFormat getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(DateFormat fechafactura) {
        this.fechafactura = fechafactura;
    }

    public Double getValorfactura() {
        return valorfactura;
    }

    public void setValorfactura(Double valorfactura) {
        this.valorfactura = valorfactura;
    }
    

   
    
}
