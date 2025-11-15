/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Entities.CategoriaProducto;
import Entities.Producto;
import Services.CategoriaProductoServiceImpl;
import Services.ProductoServicesImpl;
import Services.ProductoServiceInterface;
import Views.MainFormMesas;
import Views.Pedidos;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * * Inter grafica para manejar los productos.
 * Se pueden ver , agregar, editar y eliminar.  
 *
 * @author anto_guille
 */
public class ProductosVista extends javax.swing.JFrame {

    private final CategoriaProductoServiceImpl categoriaProductoServiceImpl;
    private final ProductoServiceInterface productoService; 
    private Long idProductoSeleccionado = null;
   
    
    public ProductosVista() {
        initComponents();
        this.categoriaProductoServiceImpl = new CategoriaProductoServiceImpl();
        this.productoService = new ProductoServicesImpl();
        
        cargarTablaProductos();
        cargarCategorias();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonAgregar = new javax.swing.JButton();
        textFieldProducto = new javax.swing.JTextField();
        buttonEditar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textfieldPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonAgregar.setText("Agregar");
        buttonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarProducto(evt);
            }
        });

        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Producto");

        jLabel2.setText("Precio");

        jLabel4.setText("Categoria");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_producto", "Producto", "Precio", "Categoria"
            }
        ));
        tablaProductos.setName("tablaProductos"); // NOI18N
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaProductos);

        jButton2.setText("Pedidos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPedidos(evt);
            }
        });

        jButton1.setText("Mesas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMesas(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 36, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(132, 132, 132))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(textfieldPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textFieldProducto, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(jLabel1)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(buttonAgregar)
                        .addGap(23, 23, 23)
                        .addComponent(buttonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEliminar)
                    .addComponent(textfieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Cuando el boton Agregar escucha el click.Se ejecuta el proceso para agregarlo a la vista y a la logica.
 * metodo agregarPRoducto() se encarga de leer los inputs y crea un nuevo objeto producto y guarda ese producto.
 * Luego la clase productoService que extiende de la interfaz productoServviceInterface y serviceinterface se encarga de guardar
 * 
 *
 * @author anto_guille
 */
    private void buttonAgregarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarProducto
      
        Producto productoNuevo = agregarProducto();
        
        try {
            productoService.save(productoNuevo);
            cargarTablaProductos();
            JOptionPane.showMessageDialog(this, "Se agregó el producto.");
        } catch (Exception ex) {
            Logger.getLogger(ProductosVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAgregarProducto

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
       try {
            
            String nombreProducto = textFieldProducto.getText();
            float precio = Float.parseFloat(textfieldPrecio.getText());
            CategoriaProducto catSeleccionada = (CategoriaProducto) jComboBox1.getSelectedItem();

           
            Producto productoActualizado = new Producto(nombreProducto, precio);
            productoActualizado.setCategoria(catSeleccionada);
            
          
            productoActualizado.setId(this.idProductoSeleccionado); 

            productoService.update(productoActualizado);

            cargarTablaProductos();
            
            JOptionPane.showMessageDialog(this, "Producto actualizado.");
            
            textFieldProducto.setText("");
            textfieldPrecio.setText("");
            jComboBox1.setSelectedIndex(0);
            this.idProductoSeleccionado = null; 
            tablaProductos.clearSelection();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ProductosVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        try {
            productoService.delete(this.idProductoSeleccionado.intValue());
            cargarTablaProductos();
        } catch (Exception ex) {
            Logger.getLogger(ProductosVista.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
          int filaSeleccionada = tablaProductos.getSelectedRow();
   this.idProductoSeleccionado = (Long) tablaProductos.getValueAt(filaSeleccionada, 0);
   
   javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tablaProductos.getModel();
   this.idProductoSeleccionado = (Long) model.getValueAt(filaSeleccionada, 0);
        
      
        String nombre = model.getValueAt(filaSeleccionada, 1).toString();
        
       
        String precio = model.getValueAt(filaSeleccionada, 2).toString();
        
        CategoriaProducto categoria = (CategoriaProducto) model.getValueAt(filaSeleccionada, 3);

        
        textFieldProducto.setText(nombre);
        textfieldPrecio.setText(precio);
        
        jComboBox1.setSelectedItem(categoria);
   
   
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void buttonPedidos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPedidos
                                        
       Pedidos ventanaPedidos = new Pedidos();
       ventanaPedidos.pack();
       ventanaPedidos.setLocationRelativeTo(this); 
       ventanaPedidos.setVisible(true);
    this.setVisible(false); 
               
    }//GEN-LAST:event_buttonPedidos

    private void buttonMesas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMesas
    MainFormMesas ventanaMesas = new MainFormMesas();
    ventanaMesas.pack();
    ventanaMesas.setLocationRelativeTo(this); 
    ventanaMesas.setVisible(true);
    this.setVisible(false); 
    }//GEN-LAST:event_buttonMesas

    
    public static void main(String args[]) {
       
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductosVista().setVisible(true);
            }
        });
    }

    private Producto agregarProducto() throws NumberFormatException {
        
    String nombreProducto = textFieldProducto.getText();
    float precio = Float.parseFloat(textfieldPrecio.getText());
    
    CategoriaProducto catSeleccionada = (CategoriaProducto) jComboBox1.getSelectedItem();
    
    Producto productoNuevo = new Producto(nombreProducto, precio);
    
    productoNuevo.setCategoria(catSeleccionada);
    return productoNuevo;
   
    }
    
    private void cargarTablaProductos() {
    DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
    
    
    model.setRowCount(0); 
    
   
    List<Producto> productos = null; 
        try {
            productos = productoService.List();
        } catch (Exception ex) {
            Logger.getLogger(ProductosVista.class.getName()).log(Level.SEVERE, null, ex);
        }

    for (Producto p : productos) {
        
  
        Object[] fila = new Object[4];
        fila[0] = p.getId();
        fila[1] = p.getNombre();
        fila[2] = p.getPrecio();
        fila[3] = p.getCategoria();
        
      
        model.addRow(fila);
    }
    
}
    
 private void cargarCategorias() {
    try {
        jComboBox1.removeAllItems(); 

        List<CategoriaProducto> categorias = categoriaProductoServiceImpl.List(); 

        for (CategoriaProducto categoria : categorias) {
            jComboBox1.addItem(categoria);
        }

    } catch (Exception e) {
       JOptionPane.showMessageDialog(this, 
               "Error fatal: No se pudieron cargar las categorías.", 
               "Error", 
               JOptionPane.ERROR_MESSAGE);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<CategoriaProducto> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField textFieldProducto;
    private javax.swing.JTextField textfieldPrecio;
    // End of variables declaration//GEN-END:variables
}