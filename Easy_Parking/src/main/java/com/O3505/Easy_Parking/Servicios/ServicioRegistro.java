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
import org.springframework.web.bind.annotation.RequestParam;

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

    public Registro insertar (Registro nuevoRegistro){
        return registroDao.save(nuevoRegistro);

    }

    public Registro actualizar (Registro actualizarRegistro){
        return registroDao.save(actualizarRegistro);

    }



    public void eleminarTipoVehiculo (Integer idRegistro){
        registroDao.delete(registroDao.findById(idRegistro).get());

    }

    public Registro buscarId (int idRegistro){
        return registroDao.findById(idRegistro).get();


    }

    
    public List<Registro>  buscarPlaca (String placa){  
    return  registroDao.searchByplaca(placa);
    }




}
