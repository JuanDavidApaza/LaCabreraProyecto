/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lacabrera.proyecto.entity.DetalleVentaProducto;
import pe.com.lacabrera.proyecto.repository.DetalleVentaProductoRepository;

/**
 *
 * @author one
 */
@Service
public class DetalleVentaProductoServiceImpl implements DetalleVentaProductoService{
    
    @Autowired
    private DetalleVentaProductoRepository repository;

    @Override
    public List<DetalleVentaProducto> findAll() {
        return repository.findAll();
    }

    @Override
    public List<DetalleVentaProducto> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public DetalleVentaProducto add(DetalleVentaProducto p) {
        return repository.save(p);
    }

    @Override
    public DetalleVentaProducto update(DetalleVentaProducto p) {
        DetalleVentaProducto objDetalleOrdenPedido = repository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objDetalleOrdenPedido);
        return repository.save(objDetalleOrdenPedido);
    }

    @Override
    public DetalleVentaProducto delete(DetalleVentaProducto p) {
        DetalleVentaProducto objDetalleOrdenPedido = repository.getById(p.getCodigo());
        objDetalleOrdenPedido.setEstado(false);
        return repository.save(objDetalleOrdenPedido);
    }

    @Override
    public Optional<DetalleVentaProducto> findById(Long id) {
        return repository.findById(id);    
    }
}
