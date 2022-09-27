/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.O3505.Easy_Parking.Dao;

import com.O3505.Easy_Parking.Modelos.Registro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Santorio
 */
public interface RegistroDao extends JpaRepository<Registro, Integer> {
    
     
    @Query(value="select * from registro WHERE Placa = :Placa",nativeQuery = true)
    List<Registro> searchByplaca(@Param("Placa") String nombreProducto);
    
}
