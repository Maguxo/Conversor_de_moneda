package org.example;
/**
 * Create by Edgar M Gómez P
 * Back-end Developer Java
 *
 */
import ejecutor.Controlador;
import front_end.Front;
import pantallaInicio.Front1.PantallaInicio;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Front inicio = new Front();
        //inicio.setVisible(true);

        PantallaInicio pantallaInicio= new PantallaInicio();
        //pantallaInicio.setVisible(true);

        Controlador controlador= new Controlador();
        controlador.setPantallaInicio(pantallaInicio);
        controlador.mostrarPantallaInicio();

        controlador.setFront(inicio);

    }
}
