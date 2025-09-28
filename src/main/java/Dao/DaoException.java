/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author anto_guille
 */
public class DaoException extends Exception {
    public DaoException(String msg) {
        super(msg);
    }
    
     public DaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
