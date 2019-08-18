package ar.empanada.learning.designpatterns.ajedrez.tableros;

import ar.empanada.learning.designpatterns.ajedrez.Tablero;
import ar.empanada.learning.designpatterns.ajedrez.geography.Position;
import ar.empanada.learning.designpatterns.ajedrez.piezas.Alfil;
import ar.empanada.learning.designpatterns.ajedrez.piezas.Caballo;
import ar.empanada.learning.designpatterns.ajedrez.piezas.Torre;

public class TableroAjedrez implements Tablero {
    Position[][] positions;

    @Override
    public void setupTablero(int largo, int alto) {
        positions = new Position[alto][largo];
        for (int i = 0; i < positions.length; i++){
            for(int j = 0; j < positions[0].length; j++) {
                positions[i][j] = new Position(i, j);
            }
        }
    }

    @Override
    public void poblarTablero() {
        for (int i = 0; i < positions.length; i++){
            for(int j = 0; j < positions[0].length; j++){
                setupPositioningPieces(positions[i][j]);
            }
        }
    }

    private Position setupPositioningPieces(Position pos) {
        String strPos = pos.getPosition();
        switch(strPos) {
            case "A1":
            case "A8":
            case "H1":
            case "H8":
                pos.setPieza(new Torre());
                break;
            case "A2":
            case "A7":
            case "H2":
            case "H7":
                pos.setPieza(new Caballo());
                break;
            case "A3":
            case "A6":
            case "H3":
            case "H6":
                pos.setPieza(new Alfil());
                break;
            default:
                break;
        }

        return pos;

    }

    @Override
    public void draw() {
        System.out.println("soy un ajedrez recien creado");
    }

}
