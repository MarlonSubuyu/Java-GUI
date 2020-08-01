package Ejercicio7;

import javax.swing.*;

public class Ejercicio7 extends JFrame{
    private JPanel root;
    private JTextField NombreTf;
    private JTextField ApellidosTf;
    private JRadioButton Hombre;
    private JRadioButton Mujer;
    private JCheckBox AcuerdoCheckBox;
    private JButton Enviar;
    private JLabel Nombre;
    private JLabel Apellidos;
    private JLabel Password;
    private JPasswordField PasswordField;
    private JLabel Genero;
    private JLabel Acuerdo;

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Ejercicio7();
    }
    public Ejercicio7(){
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(Hombre);
        grupo.add(Mujer);
        Enviar.addActionListener(e -> {
            try{
                String ntf = NombreTf.getText();
                String atf = ApellidosTf.getText();
                char[] ptf = PasswordField.getPassword();
                StringBuilder PTF = new StringBuilder();
                Hombre.setActionCommand("Hombre");
                Mujer.setActionCommand("Mujer");
                String srb = grupo.getSelection().getActionCommand();
                for (char c : ptf) {
                    PTF.append(c);
                }
                if(AcuerdoCheckBox.isSelected() && (!ntf.equals("") && !atf.equals("")&&(srb.equals("Hombre") || srb.equals("Mujer")) && !PTF.toString().equals(""))){

                    JOptionPane.showMessageDialog(null, "Sus datos se han enviado correctamente\n Nombre: " + ntf +"\nApellido: " + atf + "\nPassword: " + PTF + "\nGenero: "  + srb);
                    System.exit(0);
                }else if(!AcuerdoCheckBox.isSelected()){
                    JOptionPane.showMessageDialog(null,"Debe estar de acuerdo para poder enviar el formulario.");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Todos los campos deben estar llenos, intentelo nuevamente");
                }
            }catch (NullPointerException w){
                    JOptionPane.showMessageDialog(null,"Todos los campos deben estar llenos, intentelo nuevamente");
            }
        });
        add(root);
        setBounds(10,50, 50,10);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}