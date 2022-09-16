/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Controlador;

import com.O3505.Easy_Parking.Modelos.Plazas;
import com.O3505.Easy_Parking.Servicios.ServicioPlazas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Santorio
 */
@RestController
@RequestMapping("/Plazas")
@CrossOrigin("*")
public class ControladorPlazas {

    @Autowired
    private ServicioPlazas servicioPlazas;

    @GetMapping("/listaPlazas")
    public List<Plazas> consultarTodo() {

        return servicioPlazas.ListarTodo();

    }
    
    @PostMapping  //("/GuardarPlazas")
    public Plazas insertar (@RequestBody Plazas plazaNuevo ){
    return servicioPlazas.guardarPlaza(plazaNuevo);
    }
            

    @PutMapping
    public Plazas actualizar (@RequestBody Plazas actualizarPlaza){
    
    return servicioPlazas.actualizarPlaza(actualizarPlaza);
    }
    
}
