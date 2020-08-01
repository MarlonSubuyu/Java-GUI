package Ejercicio3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio3 extends JFrame{
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Ejercicio3();
    }
    public Ejercicio3(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setTitle("Generador de numeros");
//        Texto
        JLabel Numero1 = new JLabel("Numero 1");
        JLabel Numero2 = new JLabel("Numero 2");
        JLabel Ngenerado = new JLabel("Numero generado");
//        Spinner
        JSpinner n1 = new JSpinner();
        JSpinner n2 = new JSpinner();
//        Textfield
        JTextField g = new JTextField();
//        Boton
        JButton generar = new JButton("Generar");
//        Otros
        panel.add(Numero1);
        panel.add(n1);
        panel.add(Numero2);
        panel.add(n2);
        panel.add(Ngenerado);
        panel.add(g);
        panel.add(generar);
        generar.addActionListener(e -> {
            try{
                int a,b;
                a = Integer.parseInt(String.valueOf(n1.getValue()));
                b = Integer.parseInt(String.valueOf(n2.getValue()));
                int Random = (int) (Math.random() * (a - b + 1) + b);
                g.setText(String.valueOf(Random));
                g.setEditable(false);
            }catch (Exception w){
                JOptionPane.showMessageDialog(null, "Los valores deben ser numeros, intentelo nuevamente!");
            }

        });
        panel.setBounds(10,50, 50,10);
        panel.setLayout(new GridLayout(4,2));
        frame.setSize(300,200);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
