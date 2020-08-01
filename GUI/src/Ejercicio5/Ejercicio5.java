package Ejercicio5;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ejercicio5 extends JFrame{

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Ejercicio5();
    }
    private JTextField Ruta;
    private JButton Directorio;
    private JLabel Texto;
    private JPanel root;

    public Ejercicio5(){
        Ruta.setEnabled(false);
        Directorio.addActionListener(e -> {
            JFileChooser j = new JFileChooser();
            j.setDialogTitle("Elige un archivo");
            j.setFileSelectionMode(JFileChooser.FILES_ONLY);
            FileNameExtensionFilter txt = new FileNameExtensionFilter("*.txt", "txt");
            j.setFileFilter(txt);
            int seleccion = j.showOpenDialog(j);
            if(seleccion == JFileChooser.APPROVE_OPTION){
                Ruta.setText(j.getSelectedFile().getPath());
            }else{
                JOptionPane.showMessageDialog(null, "Debe ser un archivo .txt");
                Ruta.setText("");
            }
        });
        add(root);
        setBounds(10,50, 50,10);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}