package controller;
import front_end.Front;
import model.Model;
/**
 * Desarrolado por Edgar M Gómez P
 * Back-end Developer Java
 *
 */
import java.util.ArrayList;
public class control {
     public ArrayList<Model> listaModelo;
     public Conversiones conversiones;
     public ArrayList<Front> listaFront;
    public  control(){
       listaModelo= new ArrayList<Model>();
       conversiones = new Conversiones();
       listaFront= new ArrayList<Front>();
    }



}
