package com.mycompany.fortunecookie;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FortuneCookie {
  public static void main(String[] args) {
    JFrame frame = new JFrame("GALLETAS DE LA FORTUNA");
    JButton button = new JButton("OBTENER FORTUNA");
    JLabel label = new JLabel("");

    // Array con las galletas de la fortuna
    String[] fortunes = {
      "La suerte sonríe a quienes la buscan.",
      "Un nuevo comienzo es una oportunidad para hacer las cosas de manera diferente.",
      "La perseverancia es la clave del éxito.",
      "El éxito está a tu alcance si estás dispuesto a trabajar duro por él.",
      "El fracaso es una oportunidad para aprender y crecer."
    };

    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        Random random = new Random();
        int index = random.nextInt(fortunes.length);
        label.setText(fortunes[index]);
      }
    });

    frame.add(button, BorderLayout.NORTH);
    frame.add(label, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 200);
    frame.setVisible(true);
  }
}
