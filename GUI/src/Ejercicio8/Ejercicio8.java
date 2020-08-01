package Ejercicio8;

import javax.swing.*;

public class Ejercicio8 extends JFrame{
    private JPanel root;
    private JTextField Texto;
    private JCheckBox Perro;
    private JButton Aceptar;
    private JCheckBox Gato;
    private JCheckBox Raton;

    public static void main(String[] args){
        new Ejercicio8();
    }
    public Ejercicio8(){
        JCheckBox[] Checkbox = {Perro, Gato, Raton};
        add(root);
        setBounds(10,50, 50,10);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Aceptar.addActionListener(e -> {
            try{
                Perro.setActionCommand("Perro");
                Gato.setActionCommand("Gato");
                Raton.setActionCommand("Raton");
                //Checkbuttons
                StringBuilder pda = new StringBuilder();
                for (JCheckBox checkbox : Checkbox) {
                    if (checkbox.isSelected()) {
                        pda.append(checkbox.getText()).append("    ");
                    }
                }
                if(pda.toString().equals("")){
                    JOptionPane.showMessageDialog(null, "Escoja al menos un animal");
                }else{
                    Texto.setText(String.valueOf(pda));
                }
            } catch (NullPointerException w){
                JOptionPane.showMessageDialog(null, "Escoja al menos un animal");
            }

        });
    }
}
