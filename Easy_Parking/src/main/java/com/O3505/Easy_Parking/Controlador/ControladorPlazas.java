/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Controlador;

import com.O3505.Easy_Parking.Modelos.Plazas;
import com.O3505.Easy_Parking.Servicios.ServicioPlazas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Santorio
 */
@RestController
@RequestMapping("/plazas")
@CrossOrigin("*")
public class ControladorPlazas {

    @Autowired
    private ServicioPlazas servicioPlazas;

    @GetMapping("/listarplazas")
    public List<Plazas> consultarTodo() {

        return servicioPlazas.listarPlazas();

    }

    @PostMapping
    public Plazas insertar(@RequestBody Plazas plazasNuevo){

        return servicioPlazas.insertar(plazasNuevo);

    }


    @PutMapping
    public Plazas actualizar (@RequestBody Plazas plazasModificar){

        return servicioPlazas.actualizar(plazasModificar);
    }



    //@CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping(value = "/delete/{idplazas}")
    public String eliminarIdPlazas(@PathVariable("idplazas") Integer idplazas ){
        servicioPlazas.eleminarPlazas(idplazas);
        return "eliminacion exitosa";
    }


    @GetMapping
    public Plazas buscarId (Integer idPlazas){
        return servicioPlazas.buscarId(idPlazas);

    }
    
}
