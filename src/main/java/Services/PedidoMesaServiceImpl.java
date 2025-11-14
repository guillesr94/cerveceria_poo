/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.DetallePedidoDao;
import Dao.PedidoMesaDao;
import Entities.DetallePedido;
import Entities.PedidoMesa;
import Entities.Producto;
import Models.PedidoMesaDaoImpl;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victo
 */
public  class PedidoMesaServiceImpl implements PedidoMesaService {
    private PedidoMesaDao dao;
    private ProductoServicesImpl productoService;
    

    public PedidoMesaServiceImpl() {
      this.dao=PedidoMesaDaoImpl.getInstance();
      this.productoService=new ProductoServicesImpl();
    }
    
    
    /**
     *
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

    @Override
    public void save(PedidoMesa pedido) throws Exception {
   dao.save(pedido);
    }
    
  
    
    
    
    
        @Override
    public void agregarProductoAlPedido(String productoSelected, String cantidad, int mesa) throws Exception {
      if(productoSelected==null||productoSelected.isEmpty()){
           throw new Exception("Debe seleccionar un producto.");
       } 
       if (cantidad==null||cantidad.isEmpty()){
           throw new Exception("Debe poner una cantidad");
       } 
       
    if(mesa<1||mesa>5){
          throw new Exception("Debe selecionar una mesa entre 1 y 5 para asignar pedidos ");
    }
 
    }

    public double calcularSubtotal(List<DetallePedido> detalles) {
 double subtotal=0.0;
 if (detalles==null||detalles.isEmpty()){
     
     return subtotal;
 }
     
 for(DetallePedido d: detalles ){
     if(d!=null && d.getProducto()!=null){
         double precio=d.getProducto().getPrecio();
         int cantidad =d.getCantidad();
         subtotal+=precio*cantidad;
         
     }
 }
 return subtotal;
    }
    

    public double aplicarDescuento(double subtotal, float descuento) {
     if (descuento<0|| descuento>100){
     throw new IllegalArgumentException("Descuento inválido");
        
    }
    
    return subtotal-(subtotal*(descuento/100.0));
        }


public void guardarPedido(List<DetallePedido>detalles, float descuento, String concepto,double total)throws Exception{
    PedidoMesa pedido=new PedidoMesa();
    pedido.setDescuento(descuento);
    pedido.setConceptoDescuento(concepto);
    pedido.setTotal(total);
    
for(DetallePedido d:detalles){
    if(d==null||d.getProducto()==null)continue;
    pedido.guardarDetalle(d);
        
    }    
     dao.save(pedido);   
 
} 







}













