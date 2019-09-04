package ar.empanada.learning.designpatterns.decorator;

public class Main {

    private static Perro p;

    public static void main(String[] args) {

        p = new OvejeroAleman();
        p.ladrar();
        p = new PerroWrapperIngles(p);
        p.ladrar();
    }
}
