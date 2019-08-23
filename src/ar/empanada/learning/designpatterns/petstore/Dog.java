package ar.empanada.learning.designpatterns.petstore;

public class Dog extends Pet {

    int energy;

    public Dog(Dog d){
        super(d);
        this.energy = d.energy;
    }

    @Override
    public Pet clone() {
        return new Dog(this);
    }
}
