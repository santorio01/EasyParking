/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.O3505.Easy_Parking.Dao;

import com.O3505.Easy_Parking.Modelos.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Santorio
 */
public interface RegistroDao extends JpaRepository<Registro, Integer> {
    
}
