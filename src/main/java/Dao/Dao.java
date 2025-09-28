/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.List;

/**
 *
 * @author anto_guille
 */

public interface Dao<T> {
    public abstract void save(T data) throws DaoException;
    public abstract T getById(int id) throws DaoException;
    public abstract List<T> getAll() throws DaoException;
    public abstract void update(T data) throws DaoException;
    public abstract void delete(T data) throws DaoException;
}

