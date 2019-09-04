package ar.empanada.learning.designpatterns.decorator;

public class OvejeroAleman implements Perro {
    @Override
    public void ladrar() {
        System.out.println("guau ovejero aleman");
    }
}
