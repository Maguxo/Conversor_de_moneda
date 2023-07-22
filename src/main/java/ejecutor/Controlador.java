package ejecutor;

import distancia.ventana.Distancia;
import front_end.Front;
import pantallaInicio.Front1.PantallaInicio;
import temperatura.ventana.Temperatura;

public class Controlador {

    private PantallaInicio pantallaInicio;
    private Front front;
    private Temperatura temperatura;
    private Distancia distancia;
    public Controlador(){}

    public void setPantallaInicio(PantallaInicio pantallaInicio){
        this.pantallaInicio=pantallaInicio;
    }
    public void setFront(Front front){
        this.front=front;
    }
    public void setTemperatura(Temperatura temperatura){
        this.temperatura=temperatura;
    }
    public void setDistancia(Distancia distancia){
        this.distancia=distancia;
    }

    public void mostrarPantallaInicio(){
        pantallaInicio.setVisible(true);
    }
    public void mostrarFront(){
        front.setVisible(true);
    }
    public void mostrarTemperatura(){
        temperatura.setVisible(true);
    }
    public void  mostrarDistancia(){
        distancia.setVisible(true);
    }

    public void noMostrarPantallaInicio(){
        pantallaInicio.setVisible(false);
    }

    public void noMostrarFront(){
        front.setVisible(false);
    }
    public void noMostrarTemperatura(){
        temperatura.setVisible(false);
    }
    public void noMostrarDistancia(){
        distancia.setVisible(false);
    }
}
