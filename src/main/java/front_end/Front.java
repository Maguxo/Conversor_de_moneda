package front_end;
/**
 * Create by Edgar M Gómez P
 * Back-end Developer Java
 *
 */
import  controller.Conversiones;
import controller.control;
import ejecutor.Controlador;
import model.Model;
import pantallaInicio.Front1.PantallaInicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Hashtable;
import java.util.Objects;
public class Front extends JFrame {
    private JPanel panel;
    private Controlador controlador;
    private JcomBoxRender mrender;
    private JLabel precio_principal,pais,m_moneda, mapaIma;
    private JTextField cambio_1, cambio_2;
    private JComboBox bandera_1,bandera_2;
    private JButton convertir,convertirP,salir,retroceder;
    private Hashtable<Object,ImageIcon> Elementor_1,Elementor_2;
    final protected int ancho= 50, alto= 50;
    public Front(){
        Elementor_1= new Hashtable<>();
        Elementor_2= new Hashtable<>();
        this.setLayout(null);
        this.setIconImage(getIconImage());
        this.setUndecorated(true);
        this.setBounds(0,0,700,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        //panel principal donde se alojará los label, Image, Combobox, y si se puede una grafica lineal.
        panel= new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,700, 400);
        panel.setBackground(new Color(10,10,10));
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Diseno();
        accionar();

    }
    //Icono principal del Frame
    public Image getIconImage(){
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/moneda.png")).getScaledInstance(100,100,20);
    }
    control control = new control();
    Model modelo = new Model();
    Conversiones con= new Conversiones();
    public void Diseno(){
        //etiqueta de la moneda a combertir
        m_moneda = new JLabel("1 Dólar estadounidense Es igual a:");
        m_moneda.setBounds(10, 10, 250, 50);
        m_moneda.setOpaque(true);
        m_moneda.setFont(new Font("Agency FB",Font.BOLD,16));
        m_moneda.setForeground(new Color(253,253,150));
        m_moneda.setBackground(new Color(10,10,10));
        panel.add(m_moneda);
        //etiqueta precio moneda
        precio_principal = new JLabel("4,000.06 Pesos");
        precio_principal.setBounds(10, 50, 250, 50);
        precio_principal.setOpaque(true);
        precio_principal.setFont(new Font("Agency FB",Font.BOLD,36));
        precio_principal.setForeground(Color.yellow);
        precio_principal.setBackground(new Color(10,10,10));
        panel.add(precio_principal);
        //etiqueta país
        pais = new JLabel("Colombiano");
        pais.setBounds(10, 100, 250, 50);
        pais.setOpaque(true);
        pais.setFont(new Font("Agency FB",Font.BOLD,36));
        pais.setForeground(Color.yellow);
        pais.setBackground(new Color(10,10,10));
        panel.add(pais);
        //ingresa valor a cambiar
        cambio_1 = new JTextField(" 1");
        cambio_1.setBounds(10, 160,100,50);
        cambio_1.setFont(new Font("Agency FB",Font.BOLD,16));
        cambio_1.setForeground(new Color(253,253,150));
        cambio_1.setBackground(new Color(10,10,10));
        panel.add(cambio_1);
        //selección moneda con bandera
        bandera_1= new JComboBox<String>();
        bandera_1.setBounds(110,160,200,50);
        bandera_1.setFont(new Font("Agency FB",Font.BOLD,16));
        bandera_1.setForeground(new Color(253,253,150));
        bandera_1.setBackground(new Color(10,10,10));
        panel.add(bandera_1);
        //precio equivalente
        cambio_2 = new JTextField(" 4000.06");
        cambio_2.setBounds(10, 220,100,50);
        cambio_2.setFont(new Font("Agency FB",Font.BOLD,16));
        cambio_2.setForeground(new Color(253,253,150));
        cambio_2.setBackground(new Color(10,10,10));
        panel.add(cambio_2);
        //selección de cambio
        bandera_2= new JComboBox<String>();
        bandera_2.setBounds(110,220,200,50);
        bandera_2.setFont(new Font("Agency FB",Font.BOLD,16));
        bandera_2.setForeground(new Color(253,253,150));
        bandera_2.setBackground(new Color(10,10,10));
        panel.add(bandera_2);
        //grafico
        mapaIma= new JLabel();
        mapaIma.setBounds(320,30,366,242);
        mapaIma.setOpaque(true);
        mapaIma.setBackground(Color.pink);
        mapaIma.setIcon(getIcono("/imagenes/grafico.jpg"));
        panel.add(mapaIma);
        //Boton convertir moneda
        convertir = new JButton();
        convertir.setBounds(10, 270, 50,70);
        convertir.setOpaque(true);
        convertir.setBorder(null);
        convertir.setContentAreaFilled(false);
        convertir.setBackground(new Color(10,10,10));
        convertir.setIcon(getIconoBotones("/imagenes/boton.png"));
        convertir.setRolloverIcon(getIconoBotonesP("/imagenes/boton.png"));
        panel.add(convertir);
        //Boton convertir moneda a peso
        convertirP = new JButton();
        convertirP.setBounds(70, 270, 50,70);
        convertirP.setOpaque(true);
        convertirP.setBorder(null);
        convertirP.setContentAreaFilled(false);
        convertirP.setBackground(new Color(10,10,10));
        convertirP.setIcon(getIconoBotones2("/imagenes/boton2.png"));
        convertirP.setRolloverIcon(getIconoBotonesP2("/imagenes/boton2.png"));
        panel.add(convertirP);
        //Boton retroceder
        retroceder = new JButton();
        retroceder.setBounds(130, 270, 50,70);
        retroceder.setOpaque(true);
        retroceder.setBorder(null);
        retroceder.setContentAreaFilled(false);
        retroceder.setBackground(new Color(10,10,10));
        retroceder.setIcon(getIconoBotones2("/imagenes/retrocede.png"));
        retroceder.setRolloverIcon(getIconoBotonesP2("/imagenes/retrocede.png"));
        panel.add(retroceder);
        //Boton salir
        salir = new JButton();
        salir.setBounds(200, 270, 50,70);
        salir.setOpaque(true);
        salir.setBorder(null);
        salir.setContentAreaFilled(false);
        salir.setBackground(new Color(10,10,10));
        salir.setIcon(getIconoBotones2("/imagenes/salir.png"));
        salir.setRolloverIcon(getIconoBotonesP2("/imagenes/salir.png"));
        panel.add(salir);

        imaCombo(bandera_1);
        imaCombo2();
    }
     //insertar imagen y texto al combobox
    private void imaCombo(JComboBox bandera_1) {
       bandera_1.addItem("Dólar estadounidense");
        bandera_1.addItem("Peso colombiano");
        bandera_1.addItem("Euro");
        bandera_1.addItem("Libra esterlina");
        bandera_1.addItem("Yen");
        bandera_1.addItem("Won coreano");

        Elementor_1.put("Dólar estadounidense", getIcon("/imagenes/dolar.png"));
        Elementor_1.put("Peso colombiano", getIcon("/imagenes/peso2.png"));
        Elementor_1.put("Euro", getIcon("/imagenes/euro.png"));
        Elementor_1.put("Libra esterlina", getIcon("/imagenes/libra.png"));
        Elementor_1.put("Yen", getIcon("/imagenes/won.png"));
        Elementor_1.put("Won coreano", getIcon("/imagenes/yen.png"));

        mrender= new JcomBoxRender(Elementor_1);
        bandera_1.setRenderer(mrender);
      }
      //insertar imagen y texto al combobox
    private void imaCombo2() {

        bandera_2.addItem("Peso colombiano");
        bandera_2.addItem("Dólar estadounidense");
        bandera_2.addItem("Euro");
        bandera_2.addItem("Libra esterlina");
        bandera_2.addItem("Yen");
        bandera_2.addItem("Won coreano");

        Elementor_2.put("Peso colombiano", getIcon("/imagenes/peso2.png"));
        Elementor_2.put("Dólar estadounidense", getIcon("/imagenes/dolar.png"));
        Elementor_2.put("Euro", getIcon("/imagenes/euro.png"));
        Elementor_2.put("Libra esterlina", getIcon("/imagenes/libra.png"));
        Elementor_2.put("Yen", getIcon("/imagenes/won.png"));
        Elementor_2.put("Won coreano", getIcon("/imagenes/yen.png"));

        JcomBoxRender mrender2= new JcomBoxRender(Elementor_2);
        bandera_2.setRenderer(mrender2);
    }
    //imagen del conbobox
    public  ImageIcon getIcon(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(ancho,alto,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIcono(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(366,242,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIconoBotones(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(150,150,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIconoBotonesP(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(160,160,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIconoBotones2(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(100,100,Image.SCALE_SMOOTH));
    }
    public  ImageIcon getIconoBotonesP2(String imaB){
        return new ImageIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imaB))).getImage()
                .getScaledInstance(106,106,Image.SCALE_SMOOTH));
    }
    private void accionar() {

        ActionListener acciona= e -> { //Equivalencia peso a mooneda extranjera
            System.out.println("Boton 1");
            if (e.getSource()==convertir) {
                tasaCambio_1();
            }
        };
        convertir.addActionListener(acciona);

        ActionListener accoina2= e -> { //Equivalencia moneda extranjera a peso colombiano.
            if(e.getSource() == convertirP){
                tasaCmbio_2();
            }
        };
        convertirP.addActionListener(accoina2);

        ActionListener accionaRetrocede= e-> {//Me dirige a la ventana menú.
            if(e.getSource()== retroceder){
                JOptionPane.showConfirmDialog(null,"¿Quiere retroceder?");
                controlador.noMostrarFront();
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
    public void tasaCambio_1(){ //Conversiones equivalentes
        control.valorMoneda(modelo);
        //Equivalencia a peso colombino
        switch (String.valueOf(bandera_1.getSelectedItem())) {
            case "Dólar estadounidense" -> {
                cambio_2.setText(String.valueOf(con.dolarPeso(Double.valueOf(modelo.getDolar()),Double.valueOf(cambio_1.getText()))));
                m_moneda.setText("1 Dólar estadounidense Es igual a:");
                precio_principal.setText(String.valueOf(modelo.getDolar()) + " Pesos");
                pais.setText((String.valueOf(bandera_2.getSelectedItem())=="Peso colombiano") ? "Colombiano" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/grafico.jpg"));
            }
            case "Peso colombiano" -> {
                cambio_2.setText(String.valueOf(con.pesoDolar(Double.valueOf(modelo.getPeso()), Double.valueOf(cambio_1.getText()))));
                m_moneda.setText("1 Peso Colombiano Es igual a:");
                precio_principal.setText(String.valueOf(modelo.getPeso()) + " Pesos");
                pais.setText((String.valueOf(bandera_2.getSelectedItem()) == "Peso colombiano") ? "Colombiano" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/grafico.jpg"));
            }
            case "Euro" ->{
                cambio_2.setText(String.valueOf(con.EuroPeso(Double.valueOf(modelo.getEuro()),Double.valueOf(cambio_1.getText()))));
                m_moneda.setText("1 Euro Es igual a:");
                precio_principal.setText(String.valueOf(modelo.getEuro()) + " Pesos");
                pais.setText((String.valueOf(bandera_2.getSelectedItem()) == "Peso colombiano") ? "Colombiano" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/mapEuro.png"));
            }
            case "Libra esterlina" -> {
                cambio_2.setText(String.valueOf(con.LibraPeso(Double.valueOf(modelo.getLibra()),Double.valueOf(cambio_1.getText()))));
                m_moneda.setText("1 Libra esterlina Es igual a:");
                precio_principal.setText(String.valueOf(modelo.getLibra()) + " Pesos");
                pais.setText((String.valueOf(bandera_2.getSelectedItem()) == "Peso colombiano") ? "Colombiano" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/mapLibra.png"));
            }
            case "Yen" ->{
                cambio_2.setText(String.valueOf(con.YenPeso(Double.valueOf(modelo.getYen()),Double.valueOf(cambio_1.getText()))));
                m_moneda.setText("1 Yen Es igual a:");
                precio_principal.setText(String.valueOf(modelo.getYen()) + " Pesos");
                pais.setText((String.valueOf(bandera_2.getSelectedItem()) == "Peso colombiano") ? "Colombiano" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/mapYen.png"));
            }
            case "Won coreano" ->{
                cambio_2.setText(String.valueOf(con.WoncoreanoPeso(Double.valueOf(modelo.getWon()),Double.valueOf(cambio_1.getText()))));
                m_moneda.setText("1 Won coreano Es igual a:");
                precio_principal.setText(String.valueOf(modelo.getWon()) + " Pesos");
                pais.setText((String.valueOf(bandera_2.getSelectedItem()) == "Peso colombiano") ? "Colombiano" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/mapWon.png"));
            }
        }
    }
    //equivalencia a moneda extranjera
    private void tasaCmbio_2(){
        DecimalFormat df= new DecimalFormat("#0.000000");
        control.valorMoneda(modelo);
        switch (String.valueOf(bandera_2.getSelectedItem())) {

            case "Dólar estadounidense" -> {
                cambio_2.setText(String.valueOf(df.format(Double.valueOf(cambio_1.getText())/modelo.getDolar())));
                m_moneda.setText("1 Peso colombiano Es igual a:");
                precio_principal.setText(String.valueOf(df.format(Double.valueOf(cambio_1.getText())/modelo.getDolar())) + " Dólar");
                pais.setText((String.valueOf(bandera_2.getSelectedItem())=="Dólar estadounidense") ? "estadounidense" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/mapaPesoDolar.png"));
            }
            case "Peso colombiano" -> {
                cambio_2.setText("1.0");
                m_moneda.setText("1 Peso Colombiano Es igual a:");
                precio_principal.setText(String.valueOf(modelo.getPeso()) + " Pesos");
                pais.setText((String.valueOf(bandera_2.getSelectedItem()) == "Peso colombiano") ? "Colombiano" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/grafico.jpg"));
            }
            case "Euro" ->{
                cambio_2.setText(String.valueOf(df.format(Double.valueOf(cambio_1.getText())/modelo.getEuro())));
                m_moneda.setText("1 Peso colombiano Es igual a:");
                precio_principal.setText(String.valueOf(df.format(Double.valueOf(cambio_1.getText())/modelo.getEuro())));
                pais.setText((String.valueOf(bandera_2.getSelectedItem()) == "Euro") ? "Euro" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/mapPesoEuro.png"));
            }
            case "Libra esterlina" -> {
                cambio_2.setText(String.valueOf(df.format(Double.valueOf(cambio_1.getText())/modelo.getLibra())));
                m_moneda.setText("1 Peso colombiano Es igual a:");
                precio_principal.setText(String.valueOf(df.format(Double.valueOf(cambio_1.getText())/modelo.getDolar())) + " Libra");
                pais.setText((String.valueOf(bandera_2.getSelectedItem()) == "Libra esterlina") ? "esterlina" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/mapPesoLibra.png"));
            }
            case "Yen" ->{
                cambio_2.setText(String.valueOf(df.format(Double.valueOf(cambio_1.getText())/modelo.getYen())));
                m_moneda.setText("1 Peso colombiano Es igual a:");
                precio_principal.setText(String.valueOf(df.format(Double.valueOf(cambio_1.getText())/modelo.getYen())) + " Yen");
                pais.setText((String.valueOf(bandera_2.getSelectedItem()) == "Yen") ? "japonés" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/mapPesoYen.png"));
            }
            case "Won coreano" ->{
                cambio_2.setText(String.valueOf(df.format(Double.valueOf(cambio_1.getText())/modelo.getWon())));
                m_moneda.setText("1 Peso colombiano Es igual a:");
                precio_principal.setText(String.valueOf(df.format(Double.valueOf(cambio_1.getText())/modelo.getWon())) + " Won");
                pais.setText((String.valueOf(bandera_2.getSelectedItem()) == "Won coreano") ? "surcoreano" : "N/A");
                mapaIma.setIcon(getIcono("/imagenes/mapPesoWon.png"));
            }
        }
    }
    //Hace control
    public void setControlador(Controlador controlador){
        this.controlador=controlador;
    }
}
