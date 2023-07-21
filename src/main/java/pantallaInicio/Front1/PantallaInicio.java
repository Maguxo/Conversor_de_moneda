package pantallaInicio.Front1;
/**
 * Create by Edgar M Gómez P
 * Back-end Developer Java
 *
 */
import ejecutor.Controlador;
import front_end.Front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class PantallaInicio extends JFrame {
    private JPanel panel;
    private Controlador controlador;
    private JButton bConversor, bConversorTemperatura,bDistancia;
    private JLabel menu;
    public PantallaInicio() {
        this.setLayout(null);
        this.setIconImage(getIconImage());
        this.setUndecorated(true);
        this.setBounds(0,0,700,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        //panel principal.
        panel= new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,700, 400);
        panel.setBackground(new Color(10,10,10));
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Diseño();
        AccionarB();
    }
     //Opciones del menu principal.
    private void AccionarB() {

        ActionListener accionaConver= e->{
          if(e.getSource()== bConversor){
             controlador.mostrarFront();
          }
        };
        bConversor.addActionListener(accionaConver);
    }
    //Diseño del menú
    public void Diseño(){

        menu= new JLabel("Menú Principal");
        menu.setBounds(260, 20, 250, 50);
        menu.setOpaque(true);
        menu.setFont(new Font("Agency FB",Font.BOLD,36));
        menu.setForeground(Color.yellow);
        menu.setBackground(new Color(10,10,10));
        panel.add(menu);

        bConversor = new JButton();
        bConversor.setBounds(50, 120, 160,160);
        bConversor.setOpaque(true);
        bConversor.setBorder(null);
        bConversor.setContentAreaFilled(false);
        bConversor.setBackground(new Color(10,10,10));
        bConversor.setIcon(getIconoBotones2("/imagenes/opConversor.png"));
        bConversor.setRolloverIcon(getIconoBotonesP2("/imagenes/opConversor.png"));
        panel.add(bConversor);

        bConversorTemperatura = new JButton();
        bConversorTemperatura.setBounds(280, 120, 160,160);
        bConversorTemperatura.setOpaque(true);
        bConversorTemperatura.setBorder(null);
        bConversorTemperatura.setContentAreaFilled(false);
        bConversorTemperatura.setBackground(new Color(10,10,10));
        bConversorTemperatura.setIcon(getIconoBotones("/imagenes/opTemperatura.png"));
        bConversorTemperatura.setRolloverIcon(getIconoBotonesP("/imagenes/opTemperatura.png"));
        panel.add(bConversorTemperatura);

        bDistancia= new JButton();
        bDistancia.setBounds(490, 120, 160,160);
        bDistancia.setOpaque(true);
        bDistancia.setBorder(null);
        bDistancia.setContentAreaFilled(false);
        bDistancia.setBackground(new Color(10,10,10));
        bDistancia.setIcon(getIconoBotones2("/imagenes/opDistancia.png"));
        bDistancia.setRolloverIcon(getIconoBotonesP2("/imagenes/opDistancia.png"));
        panel.add(bDistancia);
    }
    //Ajuste de la imagen de boton
    public  ImageIcon getIconoBotones(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(300,300,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIconoBotonesP(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(310,310,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIconoBotones2(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(160,160,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIconoBotonesP2(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(164,164,Image.SCALE_SMOOTH));
    }
    //Logo principal
    public Image getIconImage(){
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/moneda.png")).getScaledInstance(100,100,20);
    }

    public void setControlador(Controlador controlador){
        this.controlador=controlador;
    }
}
