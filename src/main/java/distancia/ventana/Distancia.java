package distancia.ventana;
/**
 * Create by Edgar M Gómez P
 * Back-end Developer Java
 *
 */
import distancia.ventana.controller.ConversionesDist;
import ejecutor.Controlador;
import front_end.JcomBoxRender;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.Objects;

public class Distancia extends JFrame {
    private JPanel panel;
    private JLabel pGif,nDistancia,sDistancia, tDistancia;
    private JTextField cambio1, cambio2;
    private JComboBox Distancia1,Distancia2;
    private JButton convertir,salir,retroceder;
    private Controlador controlador;
    private JcomBoxRender mrender;
    private Hashtable<Object,ImageIcon> Elementor_1,Elementor_2;
    private final ConversionesDist dist= new ConversionesDist();
    public Distancia(){
        Elementor_1= new Hashtable<>();
        Elementor_2= new Hashtable<>();
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
    public Image getIconImage(){
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/moneda.png")).getScaledInstance(100,100,20);
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
        nDistancia.setBounds(280,70,300,80);
        nDistancia.setOpaque(true);
        nDistancia.setFont(new Font("Agency FB",Font.BOLD,60));
        nDistancia.setHorizontalAlignment(SwingConstants.RIGHT);
        nDistancia.setForeground(new Color(253,253,150));
        nDistancia.setBackground(new Color(10,10,10));
        panel.add(nDistancia);

        sDistancia= new JLabel("cm"); //Unidad de medida
        sDistancia.setBounds(580,70,100,80);
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

        retroceder = new JButton(); //Botón retrocede al menú.
        retroceder.setBounds(100, 300, 50,70);
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
        imaComboDis();
        imaComboDis2();
    }
    private void imaComboDis2() {

        Distancia2.addItem("Metro");
        Distancia2.addItem("Kilometro");
        Distancia2.addItem("Hectometro");
        Distancia2.addItem("Decámetro");
        Distancia2.addItem("Decimetro");
        Distancia2.addItem("Centimetro");
        Distancia2.addItem("Milimetro");

        Elementor_2.put("Metro", getIconImage("/imagenes/dM.png"));
        Elementor_2.put("Kilometro", getIconImage("/imagenes/dKm.png"));
        Elementor_2.put("Hectometro", getIconImage("/imagenes/dHm.png"));
        Elementor_2.put("Decámetro", getIconImage("/imagenes/dDm.png"));
        Elementor_2.put("Decimetro", getIconImage("/imagenes/dd.png"));
        Elementor_2.put("Centimetro", getIconImage("/imagenes/dcm.png"));
        Elementor_2.put("Milimetro", getIconImage("/imagenes/dmm.png"));

        mrender= new JcomBoxRender(Elementor_2);
        Distancia2.setRenderer(mrender);
    }
    private void imaComboDis() {

        Distancia1.addItem("Kilometro");
        Distancia1.addItem("Hectometro");
        Distancia1.addItem("Decámetro");
        Distancia1.addItem("Metro");
        Distancia1.addItem("Decimetro");
        Distancia1.addItem("Centimetro");
        Distancia1.addItem("Milimetro");

        Elementor_1.put("Kilometro", getIconImage("/imagenes/dKm.png"));
        Elementor_1.put("Hectometro", getIconImage("/imagenes/dHm.png"));
        Elementor_1.put("Decámetro", getIconImage("/imagenes/dDm.png"));
        Elementor_1.put("Metro", getIconImage("/imagenes/dM.png"));
        Elementor_1.put("Decimetro", getIconImage("/imagenes/dd.png"));
        Elementor_1.put("Centimetro", getIconImage("/imagenes/dcm.png"));
        Elementor_1.put("Milimetro", getIconImage("/imagenes/dmm.png"));

         mrender= new JcomBoxRender(Elementor_1);
        Distancia1.setRenderer(mrender);
    }
    public void accionaBotonDistancia(){

        ActionListener accionaConvertir= e-> {//Convertir.
            if(e.getSource()== convertir){
                conDistancia();}};
        convertir.addActionListener(accionaConvertir);

        ActionListener accionaRetrocede= e-> {//Me dirige a la ventana menú.
           int valide3= JOptionPane.showConfirmDialog(null,"¿Quiere retroceder?");
            if(e.getSource()== retroceder && valide3 == 0){
                controlador.noMostrarDistancia();
                controlador.mostrarPantallaInicio();}};
        retroceder.addActionListener(accionaRetrocede);

        ActionListener accionaSalir= e ->{//Sale del programa
            if(e.getSource()== salir) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres salir del programa?");
                if (opcion == 0) {
                    System.exit(0);}}};
        salir.addActionListener(accionaSalir);
    }
    public void conDistancia(){ //Conversiones equivalentes
        //Equivalencia a peso colombino
        switch (String.valueOf(Distancia1.getSelectedItem())) {
            case "Kilometro" -> {
                if (Distancia2.getSelectedItem().equals("Hectometro")) {
                    cambio2.setText(String.valueOf(dist.kilometroHecto(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Kilometro" ?
                            "1 Kilometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.kilometroHecto(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Hectometro" ?
                            "Hm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decámetro")) {
                    cambio2.setText(String.valueOf(dist.kilometroDeca(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Kilometro" ?
                            "1 Kilometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.kilometroDeca(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decámetro" ?
                            "Dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Metro")) {
                    cambio2.setText(String.valueOf(dist.kilometroMet(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Kilometro" ?
                            "1 Kilometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.kilometroMet(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Metro" ?
                            "M" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decimetro")) {
                    cambio2.setText(String.valueOf(dist.kilometroDeci(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Kilometro" ?
                            "1 Kilometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.kilometroDeci(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decimetro" ?
                            "dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Centimetro")) {
                    cambio2.setText(String.valueOf(dist.kilometroCent(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Kilometro" ?
                            "1 Kilometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.kilometroCent(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Centimetro" ?
                            "cm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Milimetro")) {
                    cambio2.setText(String.valueOf(dist.kilometroMili(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Kilometro" ?
                            "1 Kilometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.kilometroMili(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Milimetro" ?
                            "mm" : "N/A");
                }
            }
            case "Hectometro" -> {
                if (Distancia2.getSelectedItem().equals("Kilometro")) {
                    cambio2.setText(String.valueOf(dist.hectometroKilom(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Hectometro" ?
                            "1 Hectometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.hectometroKilom(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Kilometro" ?
                            "Km" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decámetro")) {
                    cambio2.setText(String.valueOf(dist.hectometroDeca(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Hectometro" ?
                            "1 Hectometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.hectometroDeca(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decámetro" ?
                            "Dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Metro")) {
                    cambio2.setText(String.valueOf(dist.hectometroMet(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Hectometro" ?
                            "1 hectometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.hectometroMet(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Metro" ?
                            "M" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decimetro")) {
                    cambio2.setText(String.valueOf(dist.hectometroDeci(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Hectometro" ?
                            "1 Hectometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.hectometroDeci(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decimetro" ?
                            "dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Centimetro")) {
                    cambio2.setText(String.valueOf(dist.hectometroCent(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Hectometro" ?
                            "1 Hectometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.hectometroCent(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Centimetro" ?
                            "cm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Milimetro")) {
                    cambio2.setText(String.valueOf(dist.decametroMili(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Hectometro" ?
                            "1 Hectometro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.hectometroMili(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Milimetro" ?
                            "mm" : "N/A");
                }
            }
            case "Decámetro" -> {
                if (Distancia2.getSelectedItem().equals("Hectometro")) {
                    cambio2.setText(String.valueOf(dist.decametroHecto(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decámetro" ?
                            "1 Decámetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decametroHecto(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Hectometro" ?
                            "Hm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Kilometro")) {
                    cambio2.setText(String.valueOf(dist.decametroKilom(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decámetro" ?
                            "1 Decámetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decametroKilom(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Kilometro" ?
                            "Km" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Metro")) {
                    cambio2.setText(String.valueOf(dist.decametroMet(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decámetro" ?
                            "1 Decámetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decametroMet(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Metro" ?
                            "M" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decimetro")) {
                    cambio2.setText(String.valueOf(dist.decametroDeci(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decámetro" ?
                            "1 Decámetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decametroDeci(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decimetro" ?
                            "dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Centimetro")) {
                    cambio2.setText(String.valueOf(dist.decametroCent(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decámetro" ?
                            "1 Decámetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decametroCent(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Centimetro" ?
                            "cm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Milimetro")) {
                    cambio2.setText(String.valueOf(dist.decametroMili(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decámetro" ?
                            "1 Decámetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decametroMili(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Milimetro" ?
                            "mm" : "N/A");
                }
            }
            case "Metro" -> {
                if (Distancia2.getSelectedItem().equals("Hectometro")) {
                    cambio2.setText(String.valueOf(dist.metroHecto(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Metro" ?
                            "1 Metro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.metroHecto(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Hectometro" ?
                            "Hm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decámetro")) {
                    cambio2.setText(String.valueOf(dist.metroDm(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Metro" ?
                            "1 Metro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.metroDm(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decámetro" ?
                            "Dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Kilometro")) {
                    cambio2.setText(String.valueOf(dist.metroKilom(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Metro" ?
                            "1 Metro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.metroKilom(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Kilometro" ?
                            "Km" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decimetro")) {
                    cambio2.setText(String.valueOf(dist.metroDeci(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Metro" ?
                            "1 Metro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.metroDeci(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decimetro" ?
                            "dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Centimetro")) {
                    cambio2.setText(String.valueOf(dist.metroCenti(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Metro" ?
                            "1 Metro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.metroCenti(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Centimetro" ?
                            "cm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Milimetro")) {
                    cambio2.setText(String.valueOf(dist.metroMili(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Metro" ?
                            "1 Metro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.metroMili(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Milimetro" ?
                            "mm" : "N/A");
                }}
            case "Decimetro" -> {
                if (Distancia2.getSelectedItem().equals("Hectometro")) {
                    cambio2.setText(String.valueOf(dist.decimetrotroHecto(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decimetro" ?
                            "1 Decimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decimetrotroHecto(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Hectometro" ?
                            "Hm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decámetro")) {
                    cambio2.setText(String.valueOf(dist.decimetrotroDeca(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decimetro" ?
                            "1 Decimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decimetrotroDeca(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decámetro" ?
                            "Dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Metro")) {
                    cambio2.setText(String.valueOf(dist.decimetrotroMet(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decimetro" ?
                            "1 Decimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decimetrotroMet(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Metro" ?
                            "M" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Kilometro")) {
                    cambio2.setText(String.valueOf(dist.decimetrotroKilom(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decimetro" ?
                            "1 Decimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decimetrotroKilom(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Kilometro" ?
                            "Km" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Centimetro")) {
                    cambio2.setText(String.valueOf(dist.decimetrotroCenti(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decimetro" ?
                            "1 Decimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decimetrotroCenti(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Centimetro" ?
                            "cm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Milimetro")) {
                    cambio2.setText(String.valueOf(dist.decimetrotroMili(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Decimetro" ?
                            "1 Decimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.decimetrotroMili(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Milimetro" ?
                            "mm" : "N/A");
                }}
            case "Centimetro" -> {
                if (Distancia2.getSelectedItem().equals("Hectometro")) {
                    cambio2.setText(String.valueOf(dist.centimetroHecto(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Centimetro" ?
                            "1 Centimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.centimetroHecto(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Hectometro" ?
                            "Hm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decámetro")) {
                    cambio2.setText(String.valueOf(dist.centimetroDeca(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Centimetro" ?
                            "1 Centimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.centimetroDeca(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decámetro" ?
                            "Dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Metro")) {
                    cambio2.setText(String.valueOf(dist.centimetroMet(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Centimetro" ?
                            "1 Centimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.centimetroMet(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Metro" ?
                            "M" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decimetro")) {
                    cambio2.setText(String.valueOf(dist.centimetroDec(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Centimetro" ?
                            "1 Centimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.centimetroDec(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decimetro" ?
                            "dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Kilometro")) {
                    cambio2.setText(String.valueOf(dist.centimetroKilom(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Centimetro" ?
                            "1 Centimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.centimetroKilom(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Kilometro" ?
                            "Km" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Milimetro")) {
                    cambio2.setText(String.valueOf(dist.centimetroMili(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Centimetro" ?
                            "1 Centimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.centimetroMili(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Milimetro" ?
                            "mm" : "N/A");
                }}
            case "Milimetro" -> {
                if (Distancia2.getSelectedItem().equals("Hectometro")) {
                    cambio2.setText(String.valueOf(dist.milimetroHecto(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Milimetro" ?
                            "1 Milimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.milimetroHecto(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Hectometro" ?
                            "Hm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decámetro")) {
                    cambio2.setText(String.valueOf(dist.milimetroDeca(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Milimetro" ?
                            "1 Milimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.milimetroDeca(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decámetro" ?
                            "Dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Metro")) {
                    cambio2.setText(String.valueOf(dist.milimetroMet(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Milimetro" ?
                            "1 Milimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.milimetroMet(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Metro" ?
                            "M" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Decimetro")) {
                    cambio2.setText(String.valueOf(dist.milimetroDeci(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Milimetro" ?
                            "1 Milimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.milimetroDeci(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Decimetro" ?
                            "dm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Centimetro")) {
                    cambio2.setText(String.valueOf(dist.milimetroCenti(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Milimetro" ?
                            "1 Milimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.milimetroCenti(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Centimetro" ?
                            "cm" : "N/A");
                } else if (Distancia2.getSelectedItem().equals("Kilometro")) {
                    cambio2.setText(String.valueOf(dist.milimetroKilom(Double.parseDouble(cambio1.getText()))));
                    tDistancia.setText(String.valueOf(Distancia1.getSelectedItem()) == "Milimetro" ?
                            "1 Milimetro es igual a: " : "N/A");
                    nDistancia.setText(String.valueOf(dist.milimetroKilom(Double.parseDouble(cambio1.getText()))));
                    sDistancia.setText(String.valueOf(Distancia2.getSelectedItem()) == "Kilometro" ?
                            "Km" : "N/A");
                }}}}
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
    public ImageIcon getIconImage(String dist){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(dist))).getImage()
                .getScaledInstance(60,60,Image.SCALE_SMOOTH));
    }
    public void setControlador(Controlador controlador){
        this.controlador=controlador;
    }
}
