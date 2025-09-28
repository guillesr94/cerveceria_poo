package RestauranteApp;


import Dao.DaoException;
import Dao.ProductoDao;
import Entities.Producto;
import Models.ProductoDaoImpl;
import Views.MainFormMesas;
import java.time.LocalDate;
import java.util.List;

public class Main{
    
    public static void main(String[]args){
        
        
           ProductoDao dao = ProductoDaoImpl.getInstance();

        // Crear un producto
        Producto pe = new Producto();
        pe.setNombre("Cerveza IPA");
        pe.setPrecio(450.0f);

        System.out.println("Antes de guardar: " + pe);

        // Guardar producto
        try {
            dao.save(pe);
            System.out.println("Después de guardar: " + pe);
        } catch (DaoException e) {
            System.err.println("Error guardando producto: " + e.getMessage());
            e.printStackTrace();
        }

        // Listar todos los productos
        System.out.println("\nListado de productos:");
        try {
            List<Producto> productos = dao.getAll();
            for (Producto p : productos) {
                System.out.println(p.getId() + " - " + p.getNombre() + " : $" + p.getPrecio());
            }
        } catch (DaoException e) {
            System.err.println("Error listando productos: " + e.getMessage());
            e.printStackTrace();
        }
    
        
        java.awt.EventQueue.invokeLater(() -> {
            new MainFormMesas().setVisible(true);
        });
    }    
}