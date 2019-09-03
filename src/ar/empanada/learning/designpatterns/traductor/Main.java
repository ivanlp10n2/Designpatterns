package ar.empanada.learning.designpatterns.traductor;

public class Main {

    public static void main(String[] args) {
        Humano finnElHumano = new Humano();
        Perro jakeElPerro = new Perro();

        finnElHumano.hablarAlPerro(jakeElPerro);
    }
}
