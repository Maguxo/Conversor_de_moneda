package controller;
/**
 * Create by Edgar M Gómez P
 * Back-end Developer Java
 *
 */
import front_end.Front;
import model.Model;
import java.util.ArrayList;
import java.util.List;

public class control {
    final static double peso= 1;
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

    public boolean valorMoneda(Model model){

        //ArrayList<Model> listaModelo= new ArrayList<Model>();

        try{
            model.setDolar(this.pDolarPesos);
            model.setPeso(this.peso);
             model.setEuro(this.pEuroPesos);
             model.setLibra(this.pLibraPesos);
             model.setYen(this.pYenPesos);
             model.setWon(this.pWonPesos);
          //   listaModelo.add(model);
             return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }


}
