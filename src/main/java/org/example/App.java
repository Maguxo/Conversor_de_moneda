package org.example;
/**
 * Create by Edgar M Gómez P
 * Back-end Developer Java
 * Thanks
 */
import distancia.ventana.Distancia;
import ejecutor.Controlador;
import front_end.Front;
import pantallaInicio.Front1.PantallaInicio;
import temperatura.ventana.Temperatura;
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        //Ventana del menú.
        PantallaInicio pantallaInicio= new PantallaInicio();
        //Ventana del conversor.
        Front front = new Front();
        //Ventana de temperatura.
        Temperatura temperatura=  new Temperatura();
        //Ventana Distancia
        Distancia distancia= new Distancia();
        //Controla las clases.
        Controlador controlador= new Controlador();

        //Envio controlador.
        pantallaInicio.setControlador(controlador);
        front.setControlador(controlador);
        temperatura.setControlador(controlador);
        distancia.setControlador(controlador);

        //le envio al controlador las clses.
        controlador.setPantallaInicio(pantallaInicio);
        controlador.setFront(front);
        controlador.setTemperatura(temperatura);
        controlador.setDistancia(distancia);

        //Hace visible las ventanas.
        controlador.mostrarPantallaInicio();
    }
}
