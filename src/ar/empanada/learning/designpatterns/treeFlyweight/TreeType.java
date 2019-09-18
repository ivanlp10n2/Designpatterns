package ar.empanada.learning.designpatterns.treeFlyweight;

public class TreeType {

    String name;
    String color;
    String texture;

    public TreeType(String name, String color, String texture){
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(){
        System.out.println("dibujando arbolitos");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
