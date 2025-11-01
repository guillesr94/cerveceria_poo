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
        
      
   
        
        java.awt.EventQueue.invokeLater(() -> {
            new MainFormMesas().setVisible(true);
        });
    }    
}