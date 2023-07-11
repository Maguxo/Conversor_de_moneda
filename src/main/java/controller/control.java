package controller;
/**
 * Desarrolado by Edgar M Gómez P
 * Back-end Developer Java
 *
 */
import front_end.Front;
import model.Model;
import java.util.ArrayList;
import java.util.List;

public class control {

    final static double pDolarPesos= 3500;
    final static double pEuroPesos= 4000;
    final static double pLibraPesos= 5000;
    final static double pYenPesos= 28.56;
    final static double pWonPesos= 3.17;
     public Conversiones conversiones;
     public ArrayList<Front> listaFront;
    public  control(){
       conversiones = new Conversiones();
    }

    public ArrayList<Model> valorMoneda(){

        ArrayList<Model> listaModelo= new ArrayList<Model>();

        try{
            Model modelo= new Model();
             modelo.setDolar(pDolarPesos);
             modelo.setEuro(pEuroPesos);
             modelo.setLibra(pLibraPesos);
             modelo.setYen(pYenPesos);
             modelo.setWon(pWonPesos);
             listaModelo.add(modelo);
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaModelo;
    }

}
