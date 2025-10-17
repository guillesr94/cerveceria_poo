/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Dao.DaoException;
import Dao.PedidoMesaDao;
import Entities.PedidoMesa;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author victo
 */


public class PedidoMesaDaoImpl implements PedidoMesaDao {
private EntityManagerFactory emf;
private EntityManager em;

private static PedidoMesaDaoImpl instance ;

private PedidoMesaDaoImpl() {
    emf=Persistence.createEntityManagerFactory("poo_cerveceriaPU");
    em=emf.createEntityManager();
}
 public static PedidoMesaDaoImpl getInstance() {
        if (instance == null) {
            instance = new PedidoMesaDaoImpl();
        }
        return instance;
    }


    @Override
    public void save(PedidoMesa data) throws DaoException {
    try{
      
em.getTransaction().begin();
 em.persist((data));
 em.getTransaction().commit();
    }catch(Exception e){
     throw new DaoException("Error al guardar pedido"+e.getMessage());   
    }
    
    }
    @Override
    public PedidoMesa getById(int id) throws DaoException {
 try{
        return em.find(PedidoMesa.class, id);
 }catch(Exception e){
    throw new DaoException("Error al obtener pedido por id"+e.getMessage());
    
 }
 }

    @Override
    public List<PedidoMesa> getAll() throws DaoException {
    try{
        String query="SELECT p FROM PedidoXMesa";
    Query q=em.createQuery(query);
    return q.getResultList();
    }catch(Exception e){
    throw new DaoException("Error al obtener los pedidos"+e.getMessage());

    }  
        
    }

    @Override
    public void update(PedidoMesa data) throws DaoException {
          try{
   em.getTransaction().begin();
   em.merge(data);
   em.getTransaction().commit();
   
        }catch(Exception e){
            throw new DaoException("Error al actualizar  pedido"+e.getMessage());
        }
   
    
    }

    @Override
    public void delete(PedidoMesa data) throws DaoException {
     try {
            em.getTransaction().begin();
            PedidoMesa pedido = em.find(PedidoMesa.class,data.getIdPedido());
            if (pedido != null) {
                em.remove(pedido);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        
        }
    }
}