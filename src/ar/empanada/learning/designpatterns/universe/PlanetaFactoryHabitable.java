package ar.empanada.learning.designpatterns.universe;

import ar.empanada.learning.designpatterns.universe.planetas.Tierra;

public class PlanetaFactoryHabitable extends PlanetaFactory {
    @Override
    public Planeta createPlaneta() {
        final Planeta tierra = new Tierra();
        tierra.nombrarPlaneta("tierra");
        return tierra;
    }


}
