package ar.empanada.learning.designpatterns.decorator;

public class PerroWrapperIngles extends PerroWrapper {
    public PerroWrapperIngles(Perro p) {
        super(p);
    }

    @Override
    public void ladrar() {
        super.ladrar();
        System.out.println("en ingles");
    }
}
