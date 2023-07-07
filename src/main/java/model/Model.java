package model;
/**
 * Desarrolado por Edgar M Gómez P
 * Back-end Developer Java
 *
 */
public class Model {
    private Double dolar;
    private Double peso;
    private Double euro;
    private Double libra;
    private Double yen;
    private Double won;
    public Model(Double dolar, Double peso, Double euro, Double libra, Double yen, Double won) {
        this.dolar = dolar;
        this.peso = peso;
        this.euro = euro;
        this.libra = libra;
        this.yen = yen;
        this.won = won;
    }
    public Double getDolar() {
        return dolar;
    }
    public void setDolar(Double dolar) {
        this.dolar = dolar;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getEuro() {
        return euro;
    }
    public void setEuro(Double euro) {
        this.euro = euro;
    }
    public Double getLibra() {
        return libra;
    }
    public void setLibra(Double libra) {
        this.libra = libra;
    }
    public Double getYen() {
        return yen;
    }
    public void setYen(Double yen) {
        this.yen = yen;
    }
    public Double getWon() {
        return won;
    }
    public void setWon(Double won) {
        this.won = won;
    }
}
