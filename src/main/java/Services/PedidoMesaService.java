/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Entities.PedidoMesa;

/**
 *
 * @author victo
 */
public interface PedidoMesaService extends ServicesInterface<PedidoMesa> {
      void agregarProductoAlPedido(String producto,
                  String cantidad, int mesa) throws Exception;
}
