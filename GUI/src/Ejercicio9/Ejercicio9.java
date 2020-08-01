package Ejercicio9;

import javax.swing.*;

public class Ejercicio9 extends JFrame{

    private JPanel root;
    private JRadioButton Rojo;
    private JRadioButton Verde;
    private JRadioButton Azul;
    private JButton Aceptar;
    private JTextField Texto;

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Ejercicio9();
    }

    public Ejercicio9(){
        ButtonGroup botones = new ButtonGroup();
        botones.add(Rojo);
        botones.add(Verde);
        botones.add(Azul);
        add(root);
        setBounds(10,50, 50,10);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Aceptar.addActionListener(e -> {
            try{
                Rojo.setActionCommand("Rojo");
                Verde.setActionCommand("Verde");
                Azul.setActionCommand("Azul");
                String seleccion = "Color elegido: " + botones.getSelection().getActionCommand();
                Texto.setText(seleccion);
            }catch (NullPointerException w){
                JOptionPane.showMessageDialog(null, "Debe seleccionar un color, intentelo nuevamente");
            }
        });
    }
}
