package boleto25;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;

    public void crearVentana() {
        marco = new JFrame("opcion1");
        panel = new JPanel();
        boton = new JButton("Premer");
        boton.setBackground(Color.CYAN);
        etiqueta = new JLabel();
        marco.setSize(500, 500);
        
        boton.addActionListener(this);
        panel.add(boton);
        panel.add(etiqueta);
        marco.add(panel);

        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("CLICK");
    }
}
