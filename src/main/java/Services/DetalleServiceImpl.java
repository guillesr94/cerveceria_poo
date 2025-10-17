/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.DetallePedidoDao;
import Entities.DetallePedido;

import Models.DetallePedidoDaoImpl;

/**
 *
 * @author victo
 */
public abstract class DetalleServiceImpl implements ServicesInterface<DetallePedido> {
private DetallePedidoDao dao;

public DetalleServiceImpl(){
    this.dao=DetallePedidoDaoImpl.getInstance();
}
    @Override
    public void save(DetallePedido detalle) throws Exception {
   if(detalle.getCantidad()<=0){
       throw new Exception("La cantidad debe ser mayor a cero");
   }
   dao.save(detalle);
    }

    @Override
    public DetallePedido GetbyId(int id) throws Exception {
   return  dao.getById(id);
    }

    @Override
    public java.util.List<DetallePedido> List() throws Exception {
  return dao.getAll();
        
    }

    @Override
    public void update(DetallePedido detalle) throws Exception {
    dao.update(detalle);
    }

    @Override
    public void delete(int idDetalle) throws Exception {
   
        DetallePedido dp=dao.getById(idDetalle);
   if(dp!=null){
    dao.delete(dp);
   }else{
        throw new Exception("No existe el detalle del id:"+idDetalle);
    }
   
    }
    
}
