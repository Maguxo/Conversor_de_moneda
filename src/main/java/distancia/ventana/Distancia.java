package distancia.ventana;

import ejecutor.Controlador;

import javax.swing.*;
import java.awt.*;

public class Distancia extends JFrame {
    private JPanel panel;
    private Controlador controlador;
    public Distancia(){
        this.setLayout(null);
        this.setIconImage(getIconImage());
        this.setUndecorated(true);
        this.setBounds(0,0,700,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //Panel principal.
        panel= new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,700, 400);
        panel.setBackground(new Color(10,10,10));
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Diseño();
    }
    public void Diseño(){}
    //Logo ptincipal
    public Image getIconImage(){
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/moneda.png")).getScaledInstance(100,100,20);
    }
    public void setControlador(Controlador controlador){
        this.controlador=controlador;
    }
}
