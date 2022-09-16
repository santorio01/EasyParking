/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Servicios;

import com.O3505.Easy_Parking.Dao.RegistroDao;
import com.O3505.Easy_Parking.Modelos.Registro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Santorio
 * 
 * 
 */

@Service

public class ServicioRegistro {
    
    @Autowired
    private RegistroDao registroDao;
    
    public List<Registro> listarTodo(){
        return registroDao.findAll();
        
    }
            
    
    
    
    
}
