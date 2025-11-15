/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Dao.DaoException;
import Dao.ProductoDao;
import Entities.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Esta clase se encarga de guardar los productos ya validados previamente en las otras capas.
 * @author anto_guille
 */
public class ProductoDaoImpl implements ProductoDao {

      
     private EntityManagerFactory emf;
    private EntityManager em;
    
    private static ProductoDaoImpl instance;
    
   private ProductoDaoImpl() {
        
        emf = Persistence.createEntityManagerFactory("poo_cerveceriaPU"); 
        em = emf.createEntityManager();
    }
    
    public static ProductoDao getInstance() {
        if ( instance == null ) {
            instance = new ProductoDaoImpl();
        }
        
        return instance;
    }
 
  
   
    @Override
    public void save(Producto data) throws DaoException {
        try {
        em.getTransaction().begin();
        em.persist(data);
        em.getTransaction().commit();
    } catch (Exception e) {
        em.getTransaction().rollback();
        throw new DaoException("Error al guardar producto",e);
    }
    }

    @Override
    public Producto getById(int id) throws DaoException {
        try{
        return em.find(Producto.class, (long) id);
        }catch(Exception e){
        throw new DaoException("Error al traer producto por id", e);
}

    
                }
    @Override
    public List<Producto> getAll() throws DaoException {
    try {
        return em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();
    } catch (Exception e) {
        throw new DaoException("Error al obtener todos los productos", e);
    }
}

    @Override
    public void update(Producto data) throws DaoException {
    try{
        em.getTransaction().begin();
        em.merge(data);
        em.getTransaction().commit();}
        catch(Exception e){
            throw new DaoException("Error al actualizar Producto"+e.getMessage());
        }  

    }
         
  
    

    @Override
public void delete(Producto data) throws DaoException {
    if (data == null) {
         throw new DaoException("No se puede borrar un producto nulo");
     }

     try {
         em.getTransaction().begin();
         
         // 1. Busca el producto usando el ID del objeto 'data'
         Producto producto = em.find(Producto.class, data.getId()); 
         
         // 2. Si existe, bórralo
         if (producto != null) {
             em.remove(producto); 
         }
         
         em.getTransaction().commit();
     
     } catch(Exception e) {
         if (em.getTransaction().isActive()) {
             em.getTransaction().rollback();
         }
         throw new DaoException("Error al borrar el producto", e);
     }
       }


    @Override
    public List<Producto> getByCategoria(int IdCategoria) throws DaoException {
       try{
        return  em.createQuery("SELECT p FROM Producto p WHERE p.categoria.idCategoria =:idCat",
          
       Producto.class
               ).setParameter("idCat",IdCategoria).getResultList();
       }catch(Exception e){
        throw new DaoException("No se pueden obtener los productos de la categoria",e);
      
          }          }

    @Override
    public Producto getByNombre(String nombre) throws DaoException {
   

        try{
   return em.createQuery("Select p FROM Producto p WHERE p.nombreProducto LIKE :nombre",Producto.class)
    .setParameter("nombre",nombre)
           .getSingleResult();
           }catch(Exception e){
               throw new DaoException("Error al obtener los productos por nombre",e);
           }
    }
}