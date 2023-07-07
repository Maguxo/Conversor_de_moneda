package controller;
/**
 * Desarrolado por Edgar M Gómez P
 * Back-end Developer Java
 *
 */
public class Conversiones implements controller{
   //valor de la monedas
    final static double pDolarPesos= 3500;
    final static double pEuroPesos= 4000;
    final static double pLibraPesos= 5000;
    final static double pYenPesos= 28.56;
    final static double pWonPesos= 3.17;
   //metodos de conversiones de monedas
    @Override
    public Double dolarPeso(double cDolar) {
        return this.pDolarPesos * cDolar;
    }
    @Override
    public Double EuroPeso(double cEuro) {
        return this.pEuroPesos * cEuro;
    }
    @Override
    public Double LibraPeso(double cLibra) {
        return this.pLibraPesos * cLibra;
    }
    @Override
    public Double YenPeso(double cYen) {
        return this.pYenPesos * cYen;
    }
    @Override
    public Double WoncoreanoPeso(double cWon) {
        return this.pWonPesos *cWon;
    }
    @Override
    public Double pesoDolar(double cPesos) {
        return cPesos/ this.pDolarPesos;
    }
    @Override
    public Double pesoEuro(double cPesos) {
        return cPesos/ this.pEuroPesos;
    }
    @Override
    public Double pesoLibra(double cPesos) {
        return cPesos/ this.pLibraPesos;
    }
    @Override
    public Double pesoYen(double cPesos) {
        return cPesos/ this.pYenPesos;
    }
    @Override
    public Double pesoWonCoreano(double cPesos) {
        return cPesos/pWonPesos;
    }
}
