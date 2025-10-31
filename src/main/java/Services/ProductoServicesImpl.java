/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.DaoException;
import Dao.ProductoDao;
import Entities.Producto;
import Models.ProductoDaoImpl;

/**
 *
 * @author victo
 */
public class ProductoServicesImpl implements ProductoServiceInterface{

    private final ProductoDao productoDao;
    
    public ProductoServicesImpl(){
        this.productoDao=ProductoDaoImpl.getInstance();
    }
    
    @Override
    public void save(Producto Producto) throws Exception {
try{
     if(Producto.getNombre()==null||Producto.getNombre().isEmpty()){
       throw new Exception("El nombre del producto no puede estar vacio") ;
     }
productoDao.save(Producto);

     } catch(DaoException e){
         throw new Exception("Error al guardar el producto en la base de datos", e);
        }
    }
    
    @Override
    public Producto GetbyId(int id) throws Exception {
      return productoDao.getById(id);
        
    }
    
    @Override
    public java.util.List<Producto> List() throws Exception {
 return productoDao.getAll();
    }

    @Override
    public void update(Producto Producto) throws Exception {
    
    if (Producto.getId() == null || Producto.getId() <= 0) {
        throw new Exception("ID de producto no válido para la actualización.");
    }
    
    // Validación del Nombre
    if (Producto.getNombre() == null || Producto.getNombre().trim().isEmpty()) {
        throw new Exception("El nombre del producto no puede estar vacío.");
    }

    // Validación de la Categoría
    if (Producto.getCategoria() == null) {
        throw new Exception("Debe seleccionar una categoría para el producto.");
    }

    // Validación del Precio
    if (Producto.getPrecio() <= 0) {
        throw new Exception("El precio debe ser un número positivo.");
    }

    try {
        productoDao.update(Producto);
        
    } catch (DaoException e) {
        // Manejo de errores de la base de datos (Tu bloque original)
        throw new Exception("Error al actualizar el producto en la base de datos.", e);
    }
    }

    @Override
    public void delete(int idProducto)throws Exception {
    Producto p = GetbyId(idProducto);
    productoDao.delete(p);
    }

    @Override
    public java.util.List GetbyCategoria(int idCategoria) throws Exception {
   return  productoDao.getByCategoria(idCategoria);
    }


    
}