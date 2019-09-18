package ar.empanada.learning.designpatterns.treeFlyweight;

public class TreeProxy implements ITree {

    Tree tree;
    boolean isInstanciated = false;

    int x;
    int y;
    TreeType type;

    public TreeProxy(int x, int y, String name, String color, String texture) {
        this.x = x;
        this.y = y;
        this.type = new TreeType(name, color, texture);
    }

    @Override
    public void draw() {
//        if(!isInstanciated)
//            tree = new Tree(x, y, name, color, texture);
//        else
//            return tree;
    }
}
