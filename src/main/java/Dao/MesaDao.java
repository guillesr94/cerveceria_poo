/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Entities.Mesa;
import java.util.List;

/**
 *
 * @author Diegolas
 */

public interface MesaDao {
    void save(Mesa mesa) throws DaoException;

    void update(Mesa mesa) throws DaoException;

    void delete(Mesa mesa) throws DaoException;

    Mesa getById(int id) throws DaoException;

    List<Mesa> getAll() throws DaoException;

    List<Mesa> getByEstado(boolean ocupada) throws DaoException;
}