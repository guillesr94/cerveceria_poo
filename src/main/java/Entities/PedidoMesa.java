/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Entities.DetallePedido;
import Models.MesaUI;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author victo
 */
@Entity
@Table(name = "Pedido")
public class PedidoMesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    private Double total;
    private Float descuento;

    /*
     * @ManyToOne
     * 
     * @JoinColumn(name="idMesa",nullable=true)
     * private Mesa mesa;
     * 
     * 
     * @Column(name="IdMesa")
     * private int idMesa;
     */
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetallePedido> detalles = new ArrayList<>();

    public int getIdPedido() {
        return idPedido;
    }

    @Column(length = 60)
    private String conceptoDescuento;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public String getConceptoDescuento() {
        return conceptoDescuento;
    }

    public void setConceptoDescuento(String conceptoDescuento) {
        this.conceptoDescuento = conceptoDescuento;
    }

    /*
     * public int getIdMesa() {
     * return idMesa;
     * }
     * 
     * public void setIdMesa(int idMesa) {
     * this.idMesa = idMesa;
     * }
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    /*
     * public Mesa getMesa() {
     * return mesa;
     * }
     * 
     * public void setMesa(Mesa mesa) {
     * this.mesa = mesa;
     * }
     */

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public void guardarDetalle(DetallePedido detalle) {
        if (detalles == null) {
            detalles = new ArrayList<>();
        }
        detalle.setPedido(this);
        detalles.add(detalle);

    }
}
