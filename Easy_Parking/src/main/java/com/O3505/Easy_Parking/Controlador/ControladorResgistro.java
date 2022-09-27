/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Controlador;

import com.O3505.Easy_Parking.Modelos.Registro;
import com.O3505.Easy_Parking.Servicios.ServicioRegistro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    
    @GetMapping("/listaregistros")
    public List<Registro> consultarRegistro(){
        return servicioRegistro.listarTodo();
        
    }

    @PostMapping
    public Registro insertar(@RequestBody Registro RegistroNuevo){

        return servicioRegistro.insertar(RegistroNuevo);

    }


    @PutMapping
    public Registro actualizar (@RequestBody Registro RegistroModificar){

        return servicioRegistro.actualizar(RegistroModificar);
    }



    //@CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping(value = "/delete/{idregistro}")
    public String eliminarRegistro(@PathVariable("idregistro") Integer idregistro ){
        servicioRegistro.eleminarTipoVehiculo(idregistro);
        return "eliminacion exitosa";
    }


    @GetMapping
    public Registro buscarId (Integer Registro){
        return servicioRegistro.buscarId(Registro);

    }
    
    @GetMapping("/buscarvehiculo") 
    public List<Registro> buscarPlaca (@RequestParam String placa){
    return servicioRegistro.buscarPlaca(placa);
        
    }
            
            
             
}
