/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import Entities.DetallePedido;
import java.util.List;

/**
 *
 * @author victo
 */
public interface DetallePedidoDao extends Dao<DetallePedido> {

    
  List<DetallePedido>getByPedido(int idPedido)throws DaoException;  
    
}
