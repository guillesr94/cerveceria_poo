
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
    private String nombreProducto;
   
   @Column(name="precio")
    private float precio;


    public Producto() {
    }

    public Producto( String nombre, float precio) {
       
        this.nombreProducto = nombre;
        this.precio = precio;
    }

    public Producto(Long id, CategoriaProducto categoria, String nombre, float precio, int stock) {
        this.id = id;
        this.categoria = categoria;
        this.nombreProducto = nombre;
        this.precio = precio;

    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    
    public void setCategoria(CategoriaProducto Categoria) {
        this.categoria = Categoria;
    }


   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombreProducto;
    }

    public void setNombre(String nombre) {
        this.nombreProducto = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}


