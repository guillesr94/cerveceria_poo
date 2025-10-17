/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.CategoriaProductoDao;
import Entities.CategoriaProducto;
import Models.CategoriaProductoDaoImpl;
import java.util.List;
/**
 *
 * @author victo
 */
public abstract class CategoriaProductoServiceImpl implements ServicesInterface<CategoriaProducto> {
private  CategoriaProductoDao dao;
    
public CategoriaProductoServiceImpl(){
    this.dao=CategoriaProductoDaoImpl.getInstance();
}

    @Override
    public void save(CategoriaProducto categoria) throws Exception {
        if(categoria.getCategoria()==null){
            throw new Exception("Elnombre de la categoria no puede estar vacio");
        }
    dao.save(categoria);
    }

    @Override
    public CategoriaProducto GetbyId(int id) throws Exception {
       return dao.getById(id);
    }  
 

    @Override
    public java.util.List<CategoriaProducto> List() throws Exception {
    return dao.getAll();
    }

    @Override
    public void update(CategoriaProducto Categoria) throws Exception {
dao.update(Categoria);
    
    }

    @Override
    public void delete(int idCategoria) throws Exception {
   CategoriaProducto cp=dao.getById(idCategoria);
   if(cp!=null){
    dao.delete(cp);
   }else{
        throw new Exception("No existe la categoria:"+idCategoria);
    }
   
    }
    }


    
