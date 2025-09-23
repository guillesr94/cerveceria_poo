package RestauranteApp;


import Views.MainFormMesas;

public class Main{
    
    public static void main(String[]args){
        java.awt.EventQueue.invokeLater(()->
        {
            new MainFormMesas().setVisible(true);
        }
        
        );
    }
    
    
}