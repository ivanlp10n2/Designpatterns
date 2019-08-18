package ar.empanada.learning.designpatterns.universe;

import ar.empanada.learning.designpatterns.universe.planetas.Saturno;

public class PlanetaFactoryNoHabitable extends PlanetaFactory{
    @Override
    public Planeta createPlaneta() {
        final Planeta saturno = new Saturno();
        saturno.nombrarPlaneta("saturno");
        return saturno;
    }
}
