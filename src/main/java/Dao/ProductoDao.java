/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Entities.Producto;
import Models.ProductoDaoImpl;
import java.util.List;

/**
 *
 * @author anto_guille
 */
public interface ProductoDao extends Dao<Producto>{
    List<Producto> getByNombre(String nombre) throws DaoException;

  
}
/*
public interface PersonaDao extends Dao<Persona>{
    public abstract List<Persona> getByApellido(String apellido) throws DaoException;
}*/
