/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.lacabrera.proyecto.Controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.lacabrera.proyecto.entity.DetalleVentaProducto;
import pe.com.lacabrera.proyecto.service.DetalleVentaProductoService;

/**
 *
 * @author one
 */
@RestController
@RequestMapping("/detalleventaproducto")
public class DetalleVentaProductoController {
     
    @Autowired
    private DetalleVentaProductoService service;
    
    @GetMapping
    public List<DetalleVentaProducto> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<DetalleVentaProducto> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<DetalleVentaProducto> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public DetalleVentaProducto add(@RequestBody DetalleVentaProducto p){
        return service.add(p);
    }
    @PutMapping("/{id}")
    public DetalleVentaProducto update(@PathVariable long id,@RequestBody DetalleVentaProducto p){
        p.setCodigo(id);
        return service.update(p);
    }
    @DeleteMapping("/{id}")
    public DetalleVentaProducto delete(@PathVariable long id){
        DetalleVentaProducto objDetalle = new DetalleVentaProducto();
        objDetalle.setEstado(false);
        return service.delete(DetalleVentaProducto.builder().codigo(id).build());
    }
}


