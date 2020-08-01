package Ejercicio6;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ejercicio6 extends JFrame{
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Ejercicio6();
    }
    private JTextField Ruta;
    private JLabel Texto;
    private JPanel root;
    private JMenuBar Menu;
    private JMenu menu;

    public Ejercicio6(){
        JMenuBar Menu=new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem i1 = new JMenuItem("Abrir...");
        JMenuItem i2 = new JMenuItem("Salir");
        Ruta.setEnabled(false);
        menu.add(i1); menu.add(i2);
        Menu.add(menu);
        setJMenuBar(Menu);
        i1.addActionListener(e -> {
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

        i2.addActionListener(e -> System.exit(0));

        add(root);
        setBounds(10,50, 50,10);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
