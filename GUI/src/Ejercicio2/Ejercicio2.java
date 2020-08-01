package Ejercicio2;
import javax.swing.*;
import java.awt.*;

public class Ejercicio2 extends JFrame{
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Ejercicio2();
    }
    public Ejercicio2(){
//        Instacia de los objetos
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setTitle("Encuesta");
//        Instancia de los textos
        JLabel SO = new JLabel("Elija un sistema operativo");
        JLabel Especialidad = new JLabel("Elija su especialidad");
        JLabel Horas = new JLabel("Horas que pasas usando la computadora");
        int a=0;
        JLabel s = new JLabel(String.valueOf(a));
//        Instancia de los RadioButton
        JRadioButton Windows = new JRadioButton("Windows");
        JRadioButton Linux = new JRadioButton("Linux");
        JRadioButton MacOS = new JRadioButton("MacOS");
        ButtonGroup botones = new ButtonGroup();
        botones.add(Windows);
        botones.add(Linux);
        botones.add(MacOS);
//        Instancia de los Check box
        JCheckBox Programacion = new JCheckBox("Programacion");
        JCheckBox Diseno = new JCheckBox("Diseno grafico");
        JCheckBox Administracion = new JCheckBox("Administracion");
        JCheckBox[] Checkbox ={Programacion, Diseno, Administracion};
//        Instancia del Slider
        JSlider slider = new JSlider(0, 10, a);
//        Instancia de los botones
        JButton generar = new JButton("Generar");

//        Anadir objetos
        panel.add(SO);
        panel.add(Windows);
        panel.add(Linux);
        panel.add(MacOS);
        panel.add(Especialidad);
        panel.add(Programacion);
        panel.add(Diseno);
        panel.add(Administracion);
        panel.add(Horas);
        panel.add(slider);
        panel.add(s);
        panel.add(generar);
//        Otros
        panel.setBounds(10,50, 50,10);
        panel.setLayout(new GridLayout(12,1));
        frame.setSize(300,700);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        slider.addChangeListener(e -> {
            int n=0;
            slider.getValue();
            do{
                if(slider.getValue()!=n){
                    n++;
                }
            }while(slider.getValue()!=n);
            s.setText(n + " Horas");
        });

        generar.addActionListener(e -> {
            try{
                Windows.setActionCommand("Windows");
                Linux.setActionCommand("Linux");
                MacOS.setActionCommand("MacOS");
                //Checkbuttons
                StringBuilder pda = new StringBuilder();
                for (JCheckBox checkbox : Checkbox) {
                    if (checkbox.isSelected()) {
                        pda.append(checkbox.getText()).append("    ");
                    }
                }
                if(pda.toString().equals("")){
                    JOptionPane.showMessageDialog(null, "Escoja al menos una especialidad");
                }else{
                    JOptionPane.showMessageDialog(null, "Sistema operativo favorito: " + botones.getSelection().getActionCommand() + "\nEspecialidad: " + pda + "\nHoras que pasa frente a la computadora: " + slider.getValue() + " horas");
                }
            } catch (NullPointerException w){
                JOptionPane.showMessageDialog(null, "No debe dejar ningun campo vacio");
            }
        });
        frame.setVisible(true);
    }
}