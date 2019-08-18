package ar.empanada.learning.designpatterns.CatFun;

public class Cat {

    private float energy;

    public void eat(Food s){
        energy = energy - s.getNutritionalValue();
    }
}
