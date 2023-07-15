package controller;
/**
 * Desarrolado por Edgar M Gómez P
 * Back-end Developer Java
 *
 */
public interface controller {

    public double dolarPeso(double pDolarPesos, double cPeso);
    public Double EuroPeso(double pEuroPesos,double cPeso);
    public Double LibraPeso(double pLibraPesos,double cPeso);
    public Double YenPeso(double pYenPesos,double cPeso);
    public Double WoncoreanoPeso(double pWonPesos,double cPeso);

    public Double pesoDolar(double dolar, double pDolarPeso);
    public Double pesoEuro(double dolar, double pEuroPesos);
    public Double pesoLibra(double dolar, double pLibraPesos);
    public Double pesoYen(double dolar, double pYenPesos);
    public Double pesoWonCoreano(double dolar, double pWonPesos);


}
