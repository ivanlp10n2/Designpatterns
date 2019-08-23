package ar.empanada.learning.designpatterns;

import ar.empanada.learning.designpatterns.ajedrez.Tablero;
import ar.empanada.learning.designpatterns.ajedrez.TableroFactory;
import ar.empanada.learning.designpatterns.ajedrez.TableroFactoryAjedrez;
import ar.empanada.learning.designpatterns.petstore.Cat;
import ar.empanada.learning.designpatterns.petstore.Pet;

public class Main {

//    static PlanetaFactory planetaFactory;
//    static TableroFactory tableroFactory;

    public static void main(String[] args) {

        Pet pet = new Cat();
        pet.setEyes(6);
        Pet pet2 = pet.clone();

        System.out.println(pet2.getEyes());


    }

//    private static void initializeTableroFactory(){
//        tableroFactory = new TableroFactoryAjedrez();
//    }

//        initializeTableroFactory();
//        Tablero tablero = tableroFactory.initializeTablero();
//        tablero.draw();

//    private static void initialize() {
//        //read config
//        final PlanetaType idTipoPlaneta =    PlanetaType.HABITABLE;
//
//        if(idTipoPlaneta == PlanetaType.HABITABLE)
//            planetaFactory = new PlanetaFactoryHabitable();
//        else
//            planetaFactory = new PlanetaFactoryNoHabitable();
//    }

    //        System.out.println("configurando su fabrica de planetas...");
//        initialize();
//
//        Planeta planeta = planetaFactory.createPlaneta();
//        System.out.println(planeta.getNombre());
}
