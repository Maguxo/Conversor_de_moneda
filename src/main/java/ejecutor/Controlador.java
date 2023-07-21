package ejecutor;

import front_end.Front;
import pantallaInicio.Front1.PantallaInicio;

public class Controlador {

    private PantallaInicio pantallaInicio;
    private Front front;
    public Controlador(){}

    public void setPantallaInicio(PantallaInicio pantallaInicio){
        this.pantallaInicio=pantallaInicio;
    }
    public void mostrarPantallaInicio(){
        pantallaInicio.setVisible(true);
    }
    public void setFront(Front front){
        this.front=front;
    }
    public void mostrarFront(){
        front.setVisible(true);
    }
}
