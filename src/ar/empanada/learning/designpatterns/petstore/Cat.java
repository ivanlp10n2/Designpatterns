package ar.empanada.learning.designpatterns.petstore;

public class Cat extends Pet {

    int whiskers;

    public Cat(Cat c){
        super(c);
        this.whiskers = c.whiskers;
    }

    public Cat() {
        this.whiskers = 0;
    }

    @Override
    public Pet clone() {
        return new Cat(this);
    }

    public int getWhiskers() {
        return whiskers;
    }

    public void setWhiskers(int whiskers) {
        this.whiskers = whiskers;
    }

}
