/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import pe.com.lacabrera.proyecto.entity.DetalleVentaProducto;

/**
 *
 * @author one
 */
public interface DetalleVentaProductoService {
    public List<DetalleVentaProducto> findAll();

    public List<DetalleVentaProducto> findAllCustom();

    public Optional<DetalleVentaProducto> findById(Long id);

    public DetalleVentaProducto add(DetalleVentaProducto p);

    public DetalleVentaProducto update(DetalleVentaProducto p);

    public DetalleVentaProducto delete(DetalleVentaProducto build);
}
