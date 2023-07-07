package front_end;
/**
 * Desarrolado por Edgar M Gómez P
 * Back-end Developer Java
 *
 */
import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;
import java.util.Objects;
public class Front extends JFrame {
    private JPanel panel;
    private JLabel precio_principal,pais,m_moneda, mapaIma;
    private JTextField cambio_1, cambio_2;
    private JComboBox bandera_1;
    private JComboBox bandera_2;
    Hashtable<Object,ImageIcon> Elementor_1,Elementor_2;
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
        imaCombo();
        imaCombo2();
    }
    //Icono principal del Frame
    public Image getIconImage(){
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/moneda.png")).getScaledInstance(100,100,20);
    }

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
        bandera_1= new JComboBox<>();
        bandera_1.setBounds(110,160,200,50);
        bandera_1.setFont(new Font("Agency FB",Font.BOLD,16));
        bandera_1.setForeground(new Color(253,253,150));
        bandera_1.setBackground(new Color(10,10,10));
        panel.add(bandera_1);
        //precio equivalente
        cambio_2 = new JTextField(" 4,000.06");
        cambio_2.setBounds(10, 220,100,50);
        cambio_2.setFont(new Font("Agency FB",Font.BOLD,16));
        cambio_2.setForeground(new Color(253,253,150));
        cambio_2.setBackground(new Color(10,10,10));
        panel.add(cambio_2);
        //selección de cambio
        bandera_2= new JComboBox<>();
        bandera_2.setBounds(110,220,200,50);
        bandera_2.setFont(new Font("Agency FB",Font.BOLD,16));
        bandera_2.setForeground(new Color(253,253,150));
        bandera_2.setBackground(new Color(10,10,10));
        panel.add(bandera_2);

        mapaIma= new JLabel();
        mapaIma.setBounds(320,30,366,242);
        mapaIma.setOpaque(true);
        mapaIma.setBackground(Color.pink);
        mapaIma.setIcon(getIcono("/imagenes/grafico.jpg"));
        panel.add(mapaIma);
    }
     //insertar imagen y texto al combobox
    private void imaCombo() {
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

        JcomBoxRender mrender= new JcomBoxRender(Elementor_1);
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
    public JLabel getPrecio_principal() {
        return precio_principal;
    }
    public void setPrecio_principal(JLabel precio_principal) {
        this.precio_principal = precio_principal;
    }
    public JLabel getPais() {
        return pais;
    }
    public void setPais(JLabel pais) {
        this.pais = pais;
    }
    public JLabel getM_moneda() {
        return m_moneda;
    }
    public void setM_moneda(JLabel m_moneda) {
        this.m_moneda = m_moneda;
    }
    public JLabel getMapaIma() {
        return mapaIma;
    }
    public void setMapaIma(JLabel mapaIma) {
        this.mapaIma = mapaIma;
    }
    public JTextField getCambio_1() {
        return cambio_1;
    }
    public void setCambio_1(JTextField cambio_1) {
        this.cambio_1 = cambio_1;
    }
    public JTextField getCambio_2() {
        return cambio_2;
    }
    public void setCambio_2(JTextField cambio_2) {
        this.cambio_2 = cambio_2;
    }
    public JComboBox getBandera_1() {
        return bandera_1;
    }
    public void setBandera_1(JComboBox bandera_1) {
        this.bandera_1 = bandera_1;
    }
    public JComboBox getBandera_2() {
        return bandera_2;
    }
    public void setBandera_2(JComboBox bandera_2) {
        this.bandera_2 = bandera_2;
    }
}
