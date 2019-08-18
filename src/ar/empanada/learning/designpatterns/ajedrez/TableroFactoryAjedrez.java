package ar.empanada.learning.designpatterns.ajedrez;

import ar.empanada.learning.designpatterns.ajedrez.tableros.TableroAjedrez;

public class TableroFactoryAjedrez extends TableroFactory {


    @Override
    Tablero createTablero() {
        return new TableroAjedrez();
    }

    @Override
    Tablero setupTablero(Tablero tablero) {
        tablero.setupTablero(TableroTypes.AJEDREZ_NORMAL_LARGO.getValue(), TableroTypes.AJEDREZ_NORMAL_ALTO.getValue());
        return tablero;
    }

    @Override
    Tablero poblarTablero(Tablero tablero) {
        tablero.poblarTablero();
        return tablero;
    }
}
