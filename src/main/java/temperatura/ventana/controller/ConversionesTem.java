package temperatura.ventana.controller;

public class ConversionesTem implements ControlTem{
    @Override
    public Double CelsiusKel(Double celsius) {
        return celsius + 273.15;
    }
    @Override
    public Double CelsiusFah(Double celsius) {
        return  ((9/5) * celsius) + 32;
    }

    @Override
    public Double CelsiusR(Double celsius) {
        return 9/5 *(celsius + 273.15);
    }

    @Override
    public Double kelvinCel(Double kelvein) {
        return kelvein - 273;
    }

    @Override
    public Double kelvinFah(Double kelvin) {
        return ((9/5)*(kelvin -273.15)) +32;
    }
    @Override
    public Double kelvinR(Double kelvin) {
        return  (9/5) * kelvin ;
    }
    @Override
    public Double fahrenheitKel(Double fahrenheit) {
        return ((9/5) *(fahrenheit - 32)) + 273.15;
    }
    @Override
    public Double fahrenheitCel(Double fahrenheit) {
        return (5/9) * (fahrenheit -32);
    }
    @Override
    public Double fahrenheitR(Double fahrenheit) {
        return (fahrenheit -32) + 492.67;
    }
    @Override
    public Double rankineKel(Double rankine) {
        return ((5/9) * (rankine - 492.67)) + 273.15;
    }
    @Override
    public Double rankineFah(Double rankine) {
        return  (rankine - 492.67) + 32;
    }
    @Override
    public Double rankineCel(Double rankine) {
        return (rankine - 492.67) * (5/9);
    }
}
