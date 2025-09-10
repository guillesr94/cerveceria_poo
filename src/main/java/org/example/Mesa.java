package org.example;

import javax.swing.*;

public class Mesa {
  JButton mesa;


  public Mesa() {
    mesa = new JButton("1");
    mesa.setBounds(100, 100, 80, 80);

    // Acción al hacer click
    mesa.addActionListener(e -> {
      JOptionPane.showMessageDialog(null,
          "Mesa Pizza  2 Cerveza");
    });
  }


  public Mesa(String numero, int x, int y) {
    mesa = new JButton(numero);
    mesa.setBounds(x, y, 80, 80);


    mesa.addActionListener(e -> {
      JOptionPane.showMessageDialog(null,
          "Mesa " + numero + ": 1 d/ Empanadas");
    });
  }


  public JButton getBoton() {
    return mesa;
  }
}