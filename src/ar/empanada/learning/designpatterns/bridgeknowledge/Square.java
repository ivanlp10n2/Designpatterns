package ar.empanada.learning.designpatterns.bridgeknowledge;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("i'm being drawn as a Square");
    }
}
