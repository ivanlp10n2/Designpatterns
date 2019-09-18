package ar.empanada.learning.designpatterns.treeFlyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ITree> arbolitos = new ArrayList<>();
        arbolitos.add(new TreeProxy(1, 1,"carlos", "rojo", "goodPerson"));


    }
}
