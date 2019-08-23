package ar.empanada.learning.designpatterns.petstore;

public abstract class Pet implements Cloneable{

    private int legs;
    private int eyes;

    public Pet(){
        this.legs = 4;
        this.eyes = 2;
    }

    public Pet(Pet p){
        this();
        this.legs = p.legs;
        this.eyes = p.eyes;
    }

    public abstract Pet clone();

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}
