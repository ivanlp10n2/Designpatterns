package ar.empanada.learning.designpatterns.ajedrez;

public abstract class TableroFactory {

    abstract Tablero createTablero();

    abstract Tablero setupTablero(Tablero tablero);

    abstract Tablero poblarTablero(Tablero tablero);

    public Tablero initializeTablero(){
        Tablero tablero = createTablero();
        this.setupTablero(tablero);
        this.poblarTablero(tablero);
        return tablero;
    }


}
