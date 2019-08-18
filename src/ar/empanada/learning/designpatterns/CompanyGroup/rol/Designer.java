package ar.empanada.learning.designpatterns.CompanyGroup.rol;

import ar.empanada.learning.designpatterns.CompanyGroup.Employee;

public class Designer implements Employee {


    @Override
    public void doWork() {
        this.designArchitecture();
    }

    public void designArchitecture(){
        System.out.println("I'm designing the architecture");
    }

}
