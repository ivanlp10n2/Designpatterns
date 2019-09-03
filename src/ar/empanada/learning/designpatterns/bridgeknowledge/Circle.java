package ar.empanada.learning.designpatterns.bridgeknowledge;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm being drawn as a Circle");
    }
}
