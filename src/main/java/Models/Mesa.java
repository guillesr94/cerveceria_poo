package Models;


import javax.swing.*;
import java.util.ArrayList;
  import java.util.List;

public class Mesa {
  private JButton mesa;
private String numero;
private List<String>platos;

  public Mesa(String numero, JButton mesa) {
    this.numero=numero;
    this.mesa=mesa;
    this.mesa.setText("Mesa"+numero);
    this.platos= new ArrayList<>();
    
    
    this.mesa.addActionListener(e->mostrarPedido());
      
      
      
  }

  public void agregarProducto(String producto){
  platos.add(producto);
  
  }
  
  private void mostrarPedido(){
 if(platos.isEmpty()){
   JOptionPane.showMessageDialog(null,
    "Mesa"+numero+"no tiene ´productos.")       ; 
     
 }else{
     String MesaText="Mesa"+numero+":\n";
     for(String p :platos){
       MesaText=MesaText+"-"+p+"\n";  
         
     }
     
 }
 
  
  
  }
  
  
  
}