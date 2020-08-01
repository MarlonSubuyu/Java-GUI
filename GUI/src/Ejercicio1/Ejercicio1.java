package Ejercicio1;

import javax.swing.*;
import java.awt.*;

public class Ejercicio1 extends JFrame{
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         new Ejercicio1();
    }

    public Ejercicio1(){
//        Instancia de los objetos
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
//        Instancia de los textos
        frame.setTitle("Peliculas");
        JLabel pelicula = new JLabel("Escribe el título de una película ");
        JLabel nPeliculas = new JLabel(" Películas");
//        Instancia del panel de texto
        JTextField texto = new JTextField();
//        Instancia del JcomboBox
        JComboBox<String> cantidad = new JComboBox<>();
//        Anadir los botones
        JButton anadir = new JButton("Anadir");
//        Anadir los objetos
        panel.add(pelicula);
        panel.add(nPeliculas);
        panel.add(texto);
        panel.add(cantidad);
        panel.add(anadir);
        //Otros
        panel.setBounds(10,10, 50,50);
        panel.setLayout(new GridLayout(3,2));
        frame.setSize(400,100);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anadir(anadir, texto, cantidad);
        frame.setVisible(true);
    }

    public static void anadir(JButton anadir, JTextField texto, JComboBox<String> cantidad){
        anadir.addActionListener(e -> {
            String c = texto.getText();
            if(c.equals("")){
                JOptionPane.showMessageDialog(null, "El espacio no puede estar vacio, ingrese una pelicula");
            }
            else {
                cantidad.addItem(c);
                texto.setText("");
            }
        });
    }
}