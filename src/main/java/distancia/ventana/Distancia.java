package distancia.ventana;
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

public class Distancia extends JFrame {
    private JPanel panel;
    private JLabel pGif,nDistancia,sDistancia, tDistancia;
    private JTextField cambio1, cambio2;
    private JComboBox Distancia1,Distancia2;
    private JButton convertir,convertirP,salir,retroceder;
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
        Diseno();
        accionaBotonDistancia();
    }
    public void Diseno(){
        pGif= new JLabel(); //imagen de entrada.
        pGif.setBounds(10,20,250,250);
        pGif.setOpaque(true);
        pGif.setIcon(distancia("/imagenes/dinicio.gif"));
        panel.add(pGif);

        tDistancia= new JLabel("1 grado Metro es igual a:"); //Titulo.
        tDistancia.setBounds(260,20,250,50);
        tDistancia.setOpaque(true);
        tDistancia.setFont(new Font("Agency FB",Font.BOLD,30));
        tDistancia.setHorizontalAlignment(SwingConstants.RIGHT);
        tDistancia.setForeground(new Color(253,253,150));
        tDistancia.setBackground(new Color(10,10,10));
        panel.add(tDistancia);

        nDistancia= new JLabel("100"); //valor.
        nDistancia.setBounds(380,50,100,100);
        nDistancia.setOpaque(true);
        nDistancia.setFont(new Font("Agency FB",Font.BOLD,60));
        nDistancia.setHorizontalAlignment(SwingConstants.RIGHT);
        nDistancia.setForeground(new Color(253,253,150));
        nDistancia.setBackground(new Color(10,10,10));
        panel.add(nDistancia);

        sDistancia= new JLabel("cm"); //Unidad de medida
        sDistancia.setBounds(482,50,100,100);
        sDistancia.setOpaque(true);
        sDistancia.setFont(new Font("Agency FB",Font.BOLD,60));
        sDistancia.setForeground(new Color(253,253,150));
        sDistancia.setBackground(new Color(10,10,10));
        panel.add(sDistancia);

        cambio1 = new JTextField(" 1"); //Conteo.
        cambio1.setBounds(340, 150,100,50);
        cambio1.setFont(new Font("Agency FB",Font.BOLD,16));
        cambio1.setForeground(new Color(253,253,150));
        cambio1.setBackground(new Color(10,10,10));
        panel.add(cambio1);

        Distancia1= new JComboBox<String>(); //Opciones de convertir.
        Distancia1.setBounds(440,150,200,50);
        Distancia1.setFont(new Font("Agency FB",Font.BOLD,16));
        Distancia1.setForeground(new Color(253,253,150));
        Distancia1.setBackground(new Color(10,10,10));
        panel.add(Distancia1);

        cambio2 = new JTextField(" 1");//Conteo.
        cambio2.setBounds(340, 210,100,50);
        cambio2.setFont(new Font("Agency FB",Font.BOLD,16));
        cambio2.setForeground(new Color(253,253,150));
        cambio2.setBackground(new Color(10,10,10));
        panel.add(cambio2);

        Distancia2= new JComboBox<String>();//Opcion de convertir.
        Distancia2.setBounds(440,210,200,50);
        Distancia2.setFont(new Font("Agency FB",Font.BOLD,16));
        Distancia2.setForeground(new Color(253,253,150));
        Distancia2.setBackground(new Color(10,10,10));
        panel.add(Distancia2);

        convertir = new JButton(); //Botón de convertir.
        convertir.setBounds(10, 300, 50,70);
        convertir.setOpaque(true);
        convertir.setBorder(null);
        convertir.setContentAreaFilled(false);
        convertir.setBackground(new Color(10,10,10));
        convertir.setIcon(getIconoBotones("/imagenes/boton.png"));
        convertir.setRolloverIcon(getIconoBotonesP("/imagenes/boton.png"));
        panel.add(convertir);

        convertirP = new JButton();
        convertirP.setBounds(70, 300, 50,70);
        convertirP.setOpaque(true);
        convertirP.setBorder(null);
        convertirP.setContentAreaFilled(false);
        convertirP.setBackground(new Color(10,10,10));
        convertirP.setIcon(getIconoBotones2("/imagenes/boton2.png"));
        convertirP.setRolloverIcon(getIconoBotonesP2("/imagenes/boton2.png"));
        panel.add(convertirP);

        retroceder = new JButton(); //Botón retrocede al menú.
        retroceder.setBounds(130, 300, 50,70);
        retroceder.setOpaque(true);
        retroceder.setBorder(null);
        retroceder.setContentAreaFilled(false);
        retroceder.setBackground(new Color(10,10,10));
        retroceder.setIcon(getIconoBotones2("/imagenes/retrocede.png"));
        retroceder.setRolloverIcon(getIconoBotonesP2("/imagenes/retrocede.png"));
        panel.add(retroceder);

        salir = new JButton(); //Botón Sale del programa.
        salir.setBounds(200, 300, 50,70);
        salir.setOpaque(true);
        salir.setBorder(null);
        salir.setContentAreaFilled(false);
        salir.setBackground(new Color(10,10,10));
        salir.setIcon(getIconoBotones2("/imagenes/salir.png"));
        salir.setRolloverIcon(getIconoBotonesP2("/imagenes/salir.png"));
        panel.add(salir);
    }
    public void accionaBotonDistancia(){

        ActionListener accionaRetrocede= e-> {//Me dirige a la ventana menú.
           int valide3= JOptionPane.showConfirmDialog(null,"¿Quiere retroceder?");
            if(e.getSource()== retroceder && valide3 == 0){

                controlador.noMostrarDistancia();
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

    public ImageIcon distancia(String imaD){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaD))).getImage()
                .getScaledInstance(250,250,Image.SCALE_FAST));
    }
    //Logo ptincipal
    public Image getIconImage(){
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/moneda.png")).getScaledInstance(100,100,20);
    }
    public void setControlador(Controlador controlador){
        this.controlador=controlador;
    }
}
