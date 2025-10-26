/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;


import Dao.CategoriaProductoDao;
import Dao.DaoException;
import Entities.CategoriaProducto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author victo
 */
public class CategoriaProductoDaoImpl implements CategoriaProductoDao {

    private static CategoriaProductoDaoImpl instance;
    private EntityManagerFactory emf;
    private EntityManager em;

    private CategoriaProductoDaoImpl() {
        emf = Persistence.createEntityManagerFactory("poo_cerveceriaPU");
        em = emf.createEntityManager();
    }

    public static CategoriaProductoDaoImpl getInstance() {
        if (instance == null) {
            instance = new CategoriaProductoDaoImpl();
        }
        return instance;
    }

    @Override
    public void save(CategoriaProducto data) throws DaoException {
        try {
            em.getTransaction().begin();
            em.persist(data);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new DaoException("Error al guardar la categoría: " + e.getMessage());
        }
    }

    @Override
    public CategoriaProducto getById(int id) throws DaoException {
        try {
            return em.find(CategoriaProducto.class, id);
        } catch (Exception e) {
            throw new DaoException("Error al buscar categoría por ID: " + e.getMessage());
        }
    }

    @Override
    public List<CategoriaProducto> getAll() throws DaoException {
        try {
            Query q = em.createQuery("SELECT c FROM CategoriaProducto c");
            return q.getResultList();
        } catch (Exception e) {
            throw new DaoException("Error al obtener todas las categorías: " + e.getMessage());
        }
    }

    @Override
    public void update(CategoriaProducto data) throws DaoException {
        try {
            em.getTransaction().begin();
            em.merge(data);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new DaoException("Error al actualizar la categoría: " + e.getMessage());
        }
    }

    @Override
    public void delete(CategoriaProducto data) throws DaoException {
        try {
            em.getTransaction().begin();
            CategoriaProducto c = em.find(CategoriaProducto.class, data.getIdCategoria());
            if (c != null) {
                em.remove(c);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new DaoException("Error al borrar la categoría: " + e.getMessage());
        }
    }
}