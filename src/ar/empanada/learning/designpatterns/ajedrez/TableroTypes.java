package ar.empanada.learning.designpatterns.ajedrez;

public enum TableroTypes {
    AJEDREZ_NORMAL_LARGO(8), AJEDREZ_NORMAL_ALTO(8),
    AJEDREZ_GRANDE_LARGO(12), AJEDREZ_GRANDE_ALTO(12);

    private int n;

    TableroTypes(int n){
        this.n = n;
    }

    public int getValue(){
        return this.n;
    }


}
