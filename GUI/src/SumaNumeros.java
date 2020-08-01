import javax.swing.*;
import java.awt.*;

public class SumaNumeros extends JFrame{
    public SumaNumeros(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel numero1 = new JLabel("Numero 1");
        JLabel numero2 = new JLabel("Numero 2");
        JLabel suma = new JLabel("suma");
        //Area del texto
        JTextField n1 = new JTextField();
        JTextField n2 = new JTextField();
        JTextField n3 = new JTextField();
        //Botones
        JButton sumar = new JButton("Sumar");
        JButton limpiar = new JButton("Limpiar");
        JButton salir = new JButton("Salir");
        //panel.setBorder(BorderFactory.createEmptyBorder(30, 300, 100, 300));
        frame.setSize(300,300);
        panel.setLayout(new GridLayout(3,3));
        panel.add(numero1);
        panel.add(numero2);
        panel.add(suma);
        //Area del texto
        panel.add(n1);
        panel.add(n2);
        panel.add(n3);
        //Botones
        panel.add(sumar);
        panel.add(limpiar);
        panel.add(salir);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sumar Numeros");
        frame.pack();
        frame.setVisible(true);
        //OnClick
        Sumar(sumar, n1, n2, n3);
        LimpiarPantalla(limpiar, n1, n2, n3);
        Salir(salir);
    }

    public static void main(String[] args){
        new SumaNumeros();
    }

    public void LimpiarPantalla(JButton limpiar, JTextField n1, JTextField n2, JTextField n3){
        limpiar.addActionListener(e -> {
            n1.setText("");
            n2.setText("");
            n3.setText("");
        });
    }

    public void Sumar(JButton sumar, JTextField n1, JTextField n2, JTextField n3){
        sumar.addActionListener(e -> {
            int a;
            int c;
            int b;
            try {
                a = Integer.parseInt(n1.getText());
                b = Integer.parseInt(n2.getText());
                c = a + b;
                n3.setText(String.valueOf(c));
            } catch (NumberFormatException w) {
                JOptionPane.showMessageDialog(null, "Numero 1 y Numero 2 deben ser numeros enteros");

                n1.setText("");
                n2.setText("");
                n3.setText("");
            }
        });
    }

    public void Salir(JButton salir){
        salir.addActionListener(e -> System.exit(0));
    }
}
