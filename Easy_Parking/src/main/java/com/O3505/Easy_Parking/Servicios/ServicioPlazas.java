/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Servicios;

import com.O3505.Easy_Parking.Dao.PlazasDao;
import com.O3505.Easy_Parking.Modelos.Plazas;
import java.util.List;

import com.O3505.Easy_Parking.Modelos.Tipo_Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Santorio
 */
@Service

public class ServicioPlazas {

    @Autowired
    private PlazasDao plazasDao;



    public Plazas insertar (Plazas plazasNuevo){
        return plazasDao.save(plazasNuevo);

    }

    public Plazas actualizar (Plazas actualizarPlazas){
        return plazasDao.save(actualizarPlazas);

    }


    public List<Plazas> listarPlazas(){
        return plazasDao.findAll();

    }


    public void eleminarPlazas (Integer idPlazas){
        plazasDao.delete(plazasDao.findById(idPlazas).get());

    }

    public Plazas buscarId (int idPlazas){
        return plazasDao.findById(idPlazas).get();

    }



}
