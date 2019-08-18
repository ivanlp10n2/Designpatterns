package ar.empanada.learning.designpatterns.CompanyGroup.rol;

import ar.empanada.learning.designpatterns.CompanyGroup.Employee;

public class Programmer implements Employee {

    @Override
    public void doWork() {
        this.writeCode();
    }

    public void writeCode(){
        System.out.println("I'm writing code");
    }
}
