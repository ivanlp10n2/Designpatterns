package ar.empanada.learning.designpatterns.universe.planetas;

import ar.empanada.learning.designpatterns.universe.Planeta;

public class Saturno implements Planeta {
    String name;


    @Override
    public String getNombre() {
        return this.name;
    }

    @Override
    public void nombrarPlaneta(String name) {
        this.name = name;
    }

    @Override
    public void explorar() {
        System.out.println("El planeta " + this.name + " ha explotado");
    }
}
