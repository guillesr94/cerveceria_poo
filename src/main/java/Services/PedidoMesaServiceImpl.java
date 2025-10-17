/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.PedidoMesaDao;
import Entities.PedidoMesa;
import Models.PedidoMesaDaoImpl;

/**
 *
 * @author victo
 */
public abstract class PedidoMesaServiceImpl implements ServicesInterface<PedidoMesa> {
    private PedidoMesaDao dao;
    
    /**
     *
     */
    public PedidoMesaServiceImpl(){
     this.dao=PedidoMesaDaoImpl.getInstance(); 
        
        
    }

   /* @Override
    public void save(PedidoMesa Pedido) throws Exception {
  if(Pedido.getMesa()!=null){
      dao.save(Pedido);
  } else {
      throw new Exception("Debe seleccionarse una mesa antes de guardar el pedido");
  }
    }
*/
    @Override
    public PedidoMesa GetbyId(int id) throws Exception {
return dao.getById(id);
    }

    @Override
    public java.util.List<PedidoMesa> List() throws Exception {
     return dao.getAll();
    }

    @Override
    public void update(PedidoMesa Pedido) throws Exception {
    dao.update(Pedido);
        
    }

    @Override
    public void delete(int id) throws Exception {
   PedidoMesa PM=dao.getById(id);
    if(PM!=null){
       dao.delete(PM);
    }else{
        throw new Exception("No existe pedido con ese id:"+id);
    }
    }
    
    
    
}
