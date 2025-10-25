/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;


import java.util.List;

/**
 *
 * @author victo
 */
public interface ServicesInterface<T> {
    void save(T entity) throws Exception;
    T GetbyId(int id) throws Exception;
    List<T> List() throws Exception;
    void update(T entity) throws Exception;
    void delete(int id) throws Exception;
}


