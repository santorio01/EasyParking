/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.O3505.Easy_Parking.Servicios;

import com.O3505.Easy_Parking.Dao.TipoVehiculoDao;
import com.O3505.Easy_Parking.Modelos.Tipo_Vehiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Santorio
 */

@Service
public class ServicioTipoVehiculo {
    
    @Autowired
    private TipoVehiculoDao tipoVehiculoDao;
    
    public Tipo_Vehiculo insertar (Tipo_Vehiculo tpv){
         return tipoVehiculoDao.save(tpv);
           
    }
    
    public Tipo_Vehiculo actualizar (Tipo_Vehiculo tpv){
        return tipoVehiculoDao.save(tpv);
             
    }
    
    
    public List<Tipo_Vehiculo> ListarTipoVehiculo(){
             return tipoVehiculoDao.findAll();
        
    }   
    
    
    public void eleminarTipoVehiculo (Integer idTipoVehiculo){
        tipoVehiculoDao.delete(tipoVehiculoDao.findById(idTipoVehiculo).get());
              
    }

    public Tipo_Vehiculo buscarId (int idTipoVehiculo){
        return tipoVehiculoDao.findById(idTipoVehiculo).get();

    }
    
    
    
    
    
}
