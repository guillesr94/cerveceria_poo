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
    productoDao.update(Producto);
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