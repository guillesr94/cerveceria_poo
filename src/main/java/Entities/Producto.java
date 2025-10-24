
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
 * @author anto_guille
 */

@Entity
@Table(name="Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProducto")
    private Long id;
    
   @ManyToOne
@JoinColumn(name="idCategoria")
private CategoriaProducto categoria; 
    
   @Column(name="nombreProducto")
    private String nombre;
   @Column(name="precio")
    private float precio;
  /* @Column(name="stock")
    private int stock;
   
    */

    public Producto() {
    }

    public Producto(Long id, CategoriaProducto categoria, String nombre, float precio, int stock) {
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    //    this.stock = stock;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    
    public void setCategoria(CategoriaProducto Categoria) {
        this.categoria = Categoria;
    }

  /*  public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }*/

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}


