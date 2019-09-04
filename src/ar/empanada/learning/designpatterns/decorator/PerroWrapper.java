package ar.empanada.learning.designpatterns.decorator;

public abstract class PerroWrapper implements Perro {

    private Perro perro;

    public PerroWrapper (Perro p){
        this.perro = p;
    }


    @Override
    public void ladrar() {
        perro.ladrar();
        System.out.println("mediante wrapper");
    }
}
