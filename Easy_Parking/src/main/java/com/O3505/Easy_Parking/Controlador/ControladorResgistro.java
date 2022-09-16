/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Controlador;

import com.O3505.Easy_Parking.Modelos.Registro;
import com.O3505.Easy_Parking.Servicios.ServicioRegistro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Santorio
 */

@RestController
@CrossOrigin("*")
@RequestMapping("/registro")
public class ControladorResgistro {
    
    @Autowired
    private ServicioRegistro servicioRegistro;
    
    @GetMapping
    public List<Registro> consultarRegistro(){
        return servicioRegistro.listarTodo();
        
    }
            
            
             
}
