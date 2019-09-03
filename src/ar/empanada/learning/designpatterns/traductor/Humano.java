package ar.empanada.learning.designpatterns.traductor;

public class Humano {

    static Converter converter;


    public static void main(String[] args) {
        Perro perro = new Perro();
        comprarTraductor(perro);
        hablarAlPerro(perro);
    }

    private static void comprarTraductor(Perro perro) {
        converter = new ConverterMensaje(perro);
    }

    public static String hablarAlPerro(Perro o){
        return "perroAdoptado";
    }


}
