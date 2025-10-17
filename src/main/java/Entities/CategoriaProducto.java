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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Categoria")

/**
 *
 * @author victo
 */
public class CategoriaProducto {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
@OneToMany
@JoinColumn(name="idProducto")
private Producto producto;

@Column(name = "Categoria", nullable = false, unique = true, length = 100)
private String Categoria;

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    private String categoria;


    public CategoriaProducto() {}


    public CategoriaProducto(String categoria) {
        this.categoria = categoria;
    }

    
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

 

  @Override
    public String toString() {
        return categoria; 
    }
}
