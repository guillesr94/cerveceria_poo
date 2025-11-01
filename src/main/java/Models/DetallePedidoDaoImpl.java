/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Dao.DaoException;
import Dao.DetallePedidoDao;
import Entities.DetallePedido;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author victo
 */
public class DetallePedidoDaoImpl implements DetallePedidoDao  {
    private EntityManagerFactory emf;
    private EntityManager em;
private static DetallePedidoDaoImpl instance;
    
private DetallePedidoDaoImpl(){
    emf=Persistence.createEntityManagerFactory("Restaurante_PU");
    em=emf.createEntityManager();
    
}
public static DetallePedidoDaoImpl getInstance(){
    if (instance==null){
        instance=new DetallePedidoDaoImpl();
    }
    return instance;
}



    @Override
    public void save(DetallePedido data) throws DaoException {
        try{
     em.getTransaction().begin();
     em.persist(data);
     em.getTransaction().commit();}
        
     catch(Exception e){
             throw new DaoException("Error al guardar los detalles del pedido"+e.getMessage()); 
             }
    }

    @Override
    public DetallePedido getById(int id) throws DaoException {
        try{
    return em.find(DetallePedido.class, id);
        }catch(Exception e){
        throw new DaoException("Error al obtener el detalle de pedidos por id"+e.getMessage());
        }
    } 
    @Override
    public List<DetallePedido> getAll() throws DaoException {
   try{
        String query="SELECT d FROM DetallePedido d";
      Query q =em.createQuery(query);
    return q.getResultList();
   }catch(Exception e){
       throw new DaoException("Error al obtener detalles de los pedidos"+e.getMessage());
   }
   
    }

    @Override
    public void update(DetallePedido data) throws DaoException {
        try{
   em.getTransaction().begin();
   em.merge(data);
   em.getTransaction().commit();
   
        }catch(Exception e){
            throw new DaoException("Error al actualizar detalle de pedido"+e.getMessage());
        }
   
    }
 

    @Override
    public void delete(DetallePedido data) throws DaoException {
    try{
       em.getTransaction().begin();
       DetallePedido detalle=em.find(DetallePedido.class,data.getIdDetalle());
       if(detalle!=null){
           em.remove(detalle);
       }
       em.getTransaction().commit();
    } catch(Exception e){
    throw new DaoException("Error al borrar los detalles del pedido"+e.getMessage());
        
    }
    
    }

    @Override
    public List<DetallePedido> getByPedido(int idPedido) throws DaoException {
 return em.createQuery(
 "SELECT d FROM DetalleXPedido d WHERE d.pedido.idPedido=:id ",DetallePedido.class)
         .setParameter("id", idPedido).getResultList();
        
        }

}
