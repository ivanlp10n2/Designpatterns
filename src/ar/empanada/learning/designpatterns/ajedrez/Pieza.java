package ar.empanada.learning.designpatterns.ajedrez;

import ar.empanada.learning.designpatterns.ajedrez.geography.Position;

public interface Pieza {
    Position position = null;


    void mover (Position posTo);
    void morir ();

}
