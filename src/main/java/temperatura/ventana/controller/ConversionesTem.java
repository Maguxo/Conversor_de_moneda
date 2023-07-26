package temperatura.ventana.controller;

public class ConversionesTem implements ControlTem{
    @Override
    public Double CelsiusKel(Double celsius) {
        return celsius + 273.15;
    }
    @Override
    public Double CelsiusFah(Double celsius) {
        return  (1.8 * celsius) + 32;
    }
    @Override
    public Double CelsiusR(Double celsius) {
        return 1.8 *(celsius + 273.15);
    }
    @Override
    public Double kelvinCel(Double kelvein) {
        return kelvein - 272.15;
    }
    @Override
    public Double kelvinFah(Double kelvin) {
        return (1.8 * (kelvin -273.15)) +32;
    }
    @Override
    public Double kelvinR(Double kelvin) {
        return  1.8 * kelvin ;
    }
    @Override
    public Double fahrenheitKel(Double fahrenheit) {
        return (5 *(fahrenheit - 32)/9) + 273.15;
    }
    @Override
    public Double fahrenheitCel(Double fahrenheit) {
        return (5 * (fahrenheit -32))/9;
    }
    @Override
    public Double fahrenheitR(Double fahrenheit) {
        return (fahrenheit -32) + 491.67;
    }
    @Override
    public Double rankineKel(Double rankine) {
        return (5* (rankine - 491.67)/9) + 273.15;
    }
    @Override
    public Double rankineFah(Double rankine) {
        return  (rankine - 491.67) + 32;
    }
    @Override
    public Double rankineCel(Double rankine) {
        return 5 * (rankine - 491.67)/9 ;
    }
}
