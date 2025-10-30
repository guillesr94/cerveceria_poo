/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author victo
 */
  @Entity 
   @Table(name="DetalleXPedido")
  
public class DetallePedido{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int idDetalle;



@ManyToOne
@JoinColumn(name = "idPedido")
private PedidoMesa pedido;

 @ManyToOne
@JoinColumn(name ="idProducto")
private Producto producto;

@Column(nullable=false)
private int cantidad;

 public DetallePedido() {}

    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

   public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public PedidoMesa getPedido() {
        return pedido;
    }

    public void setPedido(PedidoMesa pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


  }