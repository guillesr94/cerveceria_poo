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
 *
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
    public List<Producto> getByNombre(String nombre) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void save(Producto data) throws DaoException {
        try {
        em.getTransaction().begin();
        em.persist(data);
        em.getTransaction().commit();
    } catch (Exception e) {
        em.getTransaction().rollback();
        throw new DaoException("Error al guardar producto", e);
    }
    }

    @Override
    public Producto getById(int id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Producto data) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}


/*
public class PersonaDaoImpl implements PersonaDao {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    private static PersonaDaoImpl instance;
    
    private PersonaDaoImpl() {
        emf = Persistence.createEntityManagerFactory("PU");
        em = emf.createEntityManager();
    }
    
    public static PersonaDao getInstance() {
        if ( instance == null ) {
            instance = new PersonaDaoImpl();
        }
        
        return instance;
    }

    @Override
    public List<Persona> getByApellido(String apellido) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void save(Persona data) throws DaoException {
        em.getTransaction().begin();
        em.persist(data);
        em.getTransaction().commit();
    }

    @Override
    public Persona getById(int id) throws DaoException {
        return em.find(Persona.class, id);
    }

    @Override
    public List<Persona> getAll() throws DaoException {
        String query = "SELECT p FROM Persona p";
        Query q = em.createQuery(query);
        return q.getResultList();
    }

    @Override
    public void update(Persona data) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Persona data) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
*/
