/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Controlador;

import com.O3505.Easy_Parking.Dao.TipoVehiculoDao;
import com.O3505.Easy_Parking.Modelos.Tipo_Vehiculo;
import com.O3505.Easy_Parking.Servicios.ServicioTipoVehiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author Santorio
 */
@RestController
@RequestMapping("/tipoVehiculo")
@CrossOrigin("*")
public class ControladorTipoVehiuclo {

    @Autowired
    private ServicioTipoVehiculo servicioTipoVehiculo;

    @GetMapping("/listaTipoVehiculo")
    public List<Tipo_Vehiculo> consultarTodo() {

        return servicioTipoVehiculo.ListarTipoVehiculo();
        
    }
    
    @PostMapping
    public Tipo_Vehiculo insertar(@RequestBody Tipo_Vehiculo Tipo_VehiculoNuevo){
        
        return servicioTipoVehiculo.insertar(Tipo_VehiculoNuevo);
        
    }
    
    
    @PutMapping
    public Tipo_Vehiculo actualizar (@RequestBody Tipo_Vehiculo Tipo_VehiculoModificar){
        
        return servicioTipoVehiculo.actualizar(Tipo_VehiculoModificar);
    }


    
    //@CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping(value = "/delete/{idtipoVehiculo}")
    public String eliminarIdtipoVehiculo(@PathVariable("idtipoVehiculo") Integer idtipoVehiculo ){
        servicioTipoVehiculo.eleminarTipoVehiculo(idtipoVehiculo);
        return "eliminacion exitosa";
    }


    @GetMapping
        public Tipo_Vehiculo buscarId (Integer idTipoVehiculo){
        return servicioTipoVehiculo.buscarId(idTipoVehiculo);

    }

}
