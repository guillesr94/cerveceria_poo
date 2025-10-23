/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Models;

import Dao.DaoException;
import Dao.MesaDao;
import Entities.Mesa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Diegolas
 */

public class MesaDaoImpl implements MesaDao {

    private EntityManagerFactory emf;
    private EntityManager em;
    private static MesaDaoImpl instance;

    private MesaDaoImpl() {
        emf = Persistence.createEntityManagerFactory("poo_cerveceriaPU");
        em = emf.createEntityManager();
    }

    public static MesaDao getInstance() {
        if (instance == null) {
            instance = new MesaDaoImpl();
        }
        return instance;
    }

    @Override
    public void save(Mesa mesa) throws DaoException {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(mesa);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new DaoException("Error al guardar mesa", e);
        }
    }

    @Override
    public void update(Mesa mesa) throws DaoException {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(mesa);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new DaoException("Error al actualizar mesa", e);
        }
    }

    @Override
    public void delete(Mesa mesa) throws DaoException {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            Mesa mesaToDelete = em.find(Mesa.class, mesa.getId());
            if (mesaToDelete != null) {
                em.remove(mesaToDelete);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new DaoException("Error al eliminar mesa", e);
        }
    }

    @Override
    public Mesa getById(int id) throws DaoException {
        try {
            return em.find(Mesa.class, id);
        } catch (Exception e) {
            throw new DaoException("Error al obtener mesa por ID", e);
        }
    }

    @Override
    public List<Mesa> getAll() throws DaoException {
        try {
            return em.createQuery("SELECT m FROM Mesa m", Mesa.class)
                    .getResultList();
        } catch (Exception e) {
            throw new DaoException("Error al obtener todas las mesas", e);
        }
    }

    /*
     * @Override
     * public List<Mesa> getByEstado(String estado) throws DaoException {
     * try {
     * return em.createQuery("SELECT m FROM Mesa m WHERE m.estado = :estado",
     * Mesa.class)
     * .setParameter("estado", estado)
     * .getResultList();
     * } catch (Exception e) {
     * throw new DaoException("Error al obtener mesas por estado", e);
     * }
     * }
     */

    @Override
    public List<Mesa> getByEstado(boolean ocupada) throws DaoException {
        try {
            return em.createQuery("SELECT m FROM Mesa m WHERE m.ocupada = :ocupada", Mesa.class)
                    .setParameter("ocupada", ocupada)
                    .getResultList();
        } catch (Exception e) {
            throw new DaoException("Error al obtener mesas por estado", e);
        }
    }
}