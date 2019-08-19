package ar.empanada.learning.designpatterns.ajedrez.geography;

import ar.empanada.learning.designpatterns.ajedrez.geography.Position;

public class UtilsGeography {

    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String convertToString(Position pos){
        final char xPos;
        final int yPos;
        xPos = alphabet.charAt(pos.getX());
        yPos = pos.getY() + 1; // bc of index 0
        return xPos + Integer.toString( yPos);
    }

}
