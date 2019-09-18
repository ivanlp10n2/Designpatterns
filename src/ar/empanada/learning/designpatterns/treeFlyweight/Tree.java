package ar.empanada.learning.designpatterns.treeFlyweight;

public class Tree implements ITree{

    int x;
    int y;
    TreeType type;

    public Tree(int x, int y, String name, String color, String texture){
        this.x = x;
        this.y = y;
        this.type = new TreeType(name, color, texture);
    }

    @Override
    public void draw(){
        type.draw();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public TreeType getType() {
        return type;
    }

    public void setType(TreeType type) {
        this.type = type;
    }
}
