package ar.empanada.learning.designpatterns.ajedrez.geography;

import ar.empanada.learning.designpatterns.ajedrez.Pieza;
import ar.empanada.learning.designpatterns.ajedrez.UtilsGeography;

public class Position {
    private int x;
    private int y;
    private Pieza pieza;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
        pieza = null;
    }


    public String getPosition(){
        return UtilsGeography.convertToString(this);
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

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }
}
