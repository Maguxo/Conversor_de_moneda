package temperatura.ventana;
/**
 * Create by Edgar M Gómez P
 * Back-end Developer Java
 *
 */
import ejecutor.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Temperatura extends JFrame {
    private JPanel panel;
    private JLabel imageGif,nTemperatura,sTemperatura, tTemperatura;
    private JTextField cambio_1, cambio_2;
    private JComboBox temperatura_1,temperatura_2;
    private JButton convertir,convertirP,salir,retroceder;

    public Controlador controlador;
    public Temperatura(){
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
        accionaBoton();
    }
    public void Diseño(){
        imageGif= new JLabel();
        imageGif.setBounds(10,20,250,250);
        imageGif.setOpaque(true);
        imageGif.setBackground(Color.pink);
        imageGif.setIcon(frio("/imagenes/inicio.gif"));
        panel.add(imageGif);

        tTemperatura= new JLabel("1 grado Kelvin es igual a:");
        tTemperatura.setBounds(260,20,250,50);
        tTemperatura.setOpaque(true);
        tTemperatura.setFont(new Font("Agency FB",Font.BOLD,30));
        tTemperatura.setHorizontalAlignment(SwingConstants.RIGHT);
        tTemperatura.setForeground(new Color(253,253,150));
        tTemperatura.setBackground(new Color(10,10,10));
        panel.add(tTemperatura);

        nTemperatura= new JLabel("21");
        nTemperatura.setBounds(380,50,100,100);
        nTemperatura.setOpaque(true);
        nTemperatura.setFont(new Font("Agency FB",Font.BOLD,60));
        nTemperatura.setHorizontalAlignment(SwingConstants.RIGHT);
        nTemperatura.setForeground(new Color(253,253,150));
        nTemperatura.setBackground(new Color(10,10,10));
        panel.add(nTemperatura);

        nTemperatura= new JLabel("°C");
        nTemperatura.setBounds(482,50,100,100);
        nTemperatura.setOpaque(true);
        nTemperatura.setFont(new Font("Agency FB",Font.BOLD,60));
        nTemperatura.setForeground(new Color(253,253,150));
        nTemperatura.setBackground(new Color(10,10,10));
        panel.add(nTemperatura);

        cambio_1 = new JTextField(" 1");
        cambio_1.setBounds(340, 150,100,50);
        cambio_1.setFont(new Font("Agency FB",Font.BOLD,16));
        cambio_1.setForeground(new Color(253,253,150));
        cambio_1.setBackground(new Color(10,10,10));
        panel.add(cambio_1);

        temperatura_1= new JComboBox<String>();
        temperatura_1.setBounds(440,150,200,50);
        temperatura_1.setFont(new Font("Agency FB",Font.BOLD,16));
        temperatura_1.setForeground(new Color(253,253,150));
        temperatura_1.setBackground(new Color(10,10,10));
        panel.add(temperatura_1);

        cambio_2 = new JTextField(" 1");
        cambio_2.setBounds(340, 210,100,50);
        cambio_2.setFont(new Font("Agency FB",Font.BOLD,16));
        cambio_2.setForeground(new Color(253,253,150));
        cambio_2.setBackground(new Color(10,10,10));
        panel.add(cambio_2);

        temperatura_2= new JComboBox<String>();
        temperatura_2.setBounds(440,210,200,50);
        temperatura_2.setFont(new Font("Agency FB",Font.BOLD,16));
        temperatura_2.setForeground(new Color(253,253,150));
        temperatura_2.setBackground(new Color(10,10,10));
        panel.add(temperatura_2);

        convertir = new JButton();
        convertir.setBounds(10, 280, 50,70);
        convertir.setOpaque(true);
        convertir.setBorder(null);
        convertir.setContentAreaFilled(false);
        convertir.setBackground(new Color(10,10,10));
        convertir.setIcon(getIconoBotones("/imagenes/boton.png"));
        convertir.setRolloverIcon(getIconoBotonesP("/imagenes/boton.png"));
        panel.add(convertir);

        convertirP = new JButton();
        convertirP.setBounds(70, 280, 50,70);
        convertirP.setOpaque(true);
        convertirP.setBorder(null);
        convertirP.setContentAreaFilled(false);
        convertirP.setBackground(new Color(10,10,10));
        convertirP.setIcon(getIconoBotones2("/imagenes/boton2.png"));
        convertirP.setRolloverIcon(getIconoBotonesP2("/imagenes/boton2.png"));
        panel.add(convertirP);

        retroceder = new JButton();
        retroceder.setBounds(130, 280, 50,70);
        retroceder.setOpaque(true);
        retroceder.setBorder(null);
        retroceder.setContentAreaFilled(false);
        retroceder.setBackground(new Color(10,10,10));
        retroceder.setIcon(getIconoBotones2("/imagenes/retrocede.png"));
        retroceder.setRolloverIcon(getIconoBotonesP2("/imagenes/retrocede.png"));
        panel.add(retroceder);

        salir = new JButton();
        salir.setBounds(200, 280, 50,70);
        salir.setOpaque(true);
        salir.setBorder(null);
        salir.setContentAreaFilled(false);
        salir.setBackground(new Color(10,10,10));
        salir.setIcon(getIconoBotones2("/imagenes/salir.png"));
        salir.setRolloverIcon(getIconoBotonesP2("/imagenes/salir.png"));
        panel.add(salir);

    }
    public void accionaBoton(){

        ActionListener accionaRetrocede= e-> {//Me dirige a la ventana menú.
            if(e.getSource()== retroceder){
                JOptionPane.showConfirmDialog(null,"¿Quiere retroceder?");
                controlador.noMostrarTemperatura();
                controlador.mostrarPantallaInicio();
            }
        };
        retroceder.addActionListener(accionaRetrocede);

        ActionListener accionaSalir= e ->{//Sale del programa
            if(e.getSource()== salir) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres salir del programa?");
                if (opcion == 0) {
                    System.exit(0);
                }}};
        salir.addActionListener(accionaSalir);
    }

    public  ImageIcon getIconoBotones2(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(100,100,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIconoBotonesP2(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(106,106,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIconoBotones(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(150,150,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIconoBotonesP(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(160,160,Image.SCALE_SMOOTH));
    }

    public ImageIcon frio(String imagen){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imagen))).getImage()
                .getScaledInstance(250,250,Image.SCALE_FAST));
    }
    //Logo principal.
    public Image getIconImage(){
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/moneda.png")).getScaledInstance(100,100,20);
    }
    public void setControlador(Controlador controlador){
        this.controlador=controlador;
    }
}
