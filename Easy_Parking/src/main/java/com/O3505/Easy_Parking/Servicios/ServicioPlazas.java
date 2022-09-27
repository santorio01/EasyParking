/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Servicios;

import com.O3505.Easy_Parking.Dao.PlazasDao;
import com.O3505.Easy_Parking.Modelos.Plazas;
import java.util.List;
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

    public List<Plazas> listarPlazas(){
        return plazasDao.findAll();

    }

    public Plazas insertar (Plazas plazasNuevo){
        return plazasDao.save(plazasNuevo);

    }

    public Plazas actualizar (Plazas actualizarPlazas){
        return plazasDao.save(actualizarPlazas);

    }



    public void eleminarPlazas (Integer idplazas){
        plazasDao.delete(plazasDao.findById(idplazas).get());

    }

    public Plazas buscarId (Integer idplazas){
        return plazasDao.findById(idplazas).get();

    }

  

}
