package org.example;



import javax.swing.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Restaurante");
    ventana.setSize(600, 600);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLayout(null); // Posicionamiento manual


    Mesa m1 = new Mesa("1", 50, 50);
        ventana.add(m1.getBoton());

    Mesa m2 = new Mesa("2", 200, 50);
    ventana.add(m2.getBoton());

    ventana.setVisible(true);
  }
}