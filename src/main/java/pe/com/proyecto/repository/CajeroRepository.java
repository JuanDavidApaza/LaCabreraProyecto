/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.proyecto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.proyecto.entity.Cajero;


public interface CajeroRepository extends JpaRepository<Cajero, Long >{
    @Query("select p from cajero p where p.estado = '0'")
    List<Cajero> findAllCustom();
}
