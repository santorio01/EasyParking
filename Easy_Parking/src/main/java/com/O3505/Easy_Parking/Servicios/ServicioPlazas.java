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
    
    
    
    public Plazas guardarPlaza (Plazas nuevoPlazas){
      
        return plazasDao.save(nuevoPlazas);
 
    }

    public List<Plazas> ListarTodo() {

        return plazasDao.findAll();


    }
    
    public Plazas actualizarPlaza (Plazas actualizarPlaza){
    
    return  plazasDao.save(actualizarPlaza);
    }

}
