package pe.com.lacabrera.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.ManyToOne;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "detalle_venta_producto")
@Table(name = "detalle_venta_producto")
public class DetalleVentaProducto implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "iddeven")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo; 
    @Column(name = "precio")
    private double precio;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="idventa",nullable=false)
    private Venta venta;
    @ManyToOne
    @JoinColumn(name="idproducto",nullable=false)
    private Producto producto;

}
