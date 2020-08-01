package Ejercicio4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio4 extends JFrame{
    private JRadioButton opcion1RadioButton;
    private JRadioButton opcion2RadioButton;
    private JRadioButton opcion3RadioButton;
    private JCheckBox opcion5CheckBox;
    private JCheckBox opcion4CheckBox;
    private JCheckBox opcion6CheckBox;
    private JTextField texto;
    private JComboBox<String> cb;
    private JSpinner spinner;
    private JPanel root;
    private JRadioButton opcion2RadioButtonD;
    private JRadioButton opcion1RadioButtonD;
    private JRadioButton opcion3RadioButtonD;
    private JCheckBox opcion4CheckBoxD;
    private JCheckBox opcion5CheckBoxD;
    private JCheckBox opcion6CheckBoxD;
    private JTextField textoD;
    private JComboBox<String> cbD;
    private JSpinner spinnerD;

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Ejercicio4();
    }
    public Ejercicio4(){
        add(root);
        setBounds(10,50, 50,10);
        setSize(400,300);
//        Desabilitar los botones espejo
        opcion1RadioButtonD.setEnabled(false);
        opcion2RadioButtonD.setEnabled(false);
        opcion3RadioButtonD.setEnabled(false);
        opcion4CheckBoxD.setEnabled(false);
        opcion5CheckBoxD.setEnabled(false);
        opcion6CheckBoxD.setEnabled(false);
        textoD.setEnabled(false);
        cbD.setEnabled(false);
        spinnerD.setEnabled(false);
        cb.addItem("Item 1");
        cb.addItem("Item 2");
        cb.addItem("Item 3");
        cb.addItem("Item 4");
        cb.addItem("Item 5");
        cb.setSelectedItem(null);
        add(root, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        opcion1RadioButton.addItemListener(e -> opcion1RadioButtonD.setSelected(opcion1RadioButton.isSelected()));
        opcion2RadioButton.addItemListener(e -> opcion2RadioButtonD.setSelected(opcion2RadioButton.isSelected()));
        opcion3RadioButton.addItemListener(e -> opcion3RadioButtonD.setSelected(opcion3RadioButton.isSelected()));
        opcion4CheckBox.addActionListener(e -> opcion4CheckBoxD.setSelected(opcion4CheckBox.isSelected()));
        opcion5CheckBox.addActionListener(e -> opcion5CheckBoxD.setSelected(opcion5CheckBox.isSelected()));
        opcion6CheckBox.addActionListener(e -> opcion6CheckBoxD.setSelected(opcion6CheckBox.isSelected()));

        cb.addActionListener(e -> {
            String valor = String.valueOf(cb.getSelectedItem());
            cbD.addItem(valor);
            cbD.setSelectedItem(valor);
        });

        spinner.addChangeListener(e -> spinnerD.setValue(spinner.getValue()));
        texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                textoD.setText(texto.getText());
            }
        });
    }
}