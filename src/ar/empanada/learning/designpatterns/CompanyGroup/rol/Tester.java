package ar.empanada.learning.designpatterns.CompanyGroup.rol;

import ar.empanada.learning.designpatterns.CompanyGroup.Employee;

public class Tester implements Employee {

    @Override
    public void doWork() {
        this.testSoftware();
    }

    public void testSoftware(){
        System.out.println("I'm testing the beautiful software made by the programmer");
    }
}
