/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Entities.Producto;
import java.util.List;

/**
 *
 * @author victo
 */

/**
 * La interfaz se encarga de la logica de producto.
 * @author anto_guille
 */
public interface ProductoServiceInterface extends ServicesInterface<Producto> {
    List GetbyCategoria(int idCategoria) throws Exception;
     Producto getByNombre(String nombre)throws Exception;
        }
    

