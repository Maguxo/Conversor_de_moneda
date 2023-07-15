package controller;
/**
 * Create by Edgar M Gómez P
 * Back-end Developer Java
 *
 */
public class Conversiones implements controller{
   //valor de la monedas

   //metodos de conversiones de monedas
    @Override
    public double dolarPeso(double pDolarPesos, double cDolar) {
        return pDolarPesos * cDolar;
    }
    @Override
    public Double EuroPeso(double pEuroPesos, double cEuro) {
        return pEuroPesos * cEuro;
    }
    @Override
    public Double LibraPeso(double pLibraPesos, double cLibra) {
        return pLibraPesos * cLibra;
    }
    @Override
    public Double YenPeso(double pYenPesos,double cYen) {
        return pYenPesos * cYen;
    }
    @Override
    public Double WoncoreanoPeso(double pWonPesos,double cWon) {
        return pWonPesos *cWon;
    }
    @Override
    public Double pesoDolar(double cPesos, double pDolarPesos) {
        return cPesos/ pDolarPesos;
    }
    @Override
    public Double pesoEuro(double cPesos, double pEuroPesos) {
        return cPesos/ pEuroPesos;
    }
    @Override
    public Double pesoLibra(double cPesos,double pLibraPesos) {
        return cPesos/ pLibraPesos;
    }
    @Override
    public Double pesoYen(double cPesos, double pYenPesos) {
        return cPesos/ pYenPesos;
    }
    @Override
    public Double pesoWonCoreano(double cPesos, double pWonPesos) {
        return cPesos/pWonPesos;
    }

}
