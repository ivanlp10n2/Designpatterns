package ar.empanada.learning.designpatterns.CompanyGroup.CompanyTypes;

import ar.empanada.learning.designpatterns.CompanyGroup.Employee;

abstract class EmployeeHRFactory {

    public Employee hireNewEmployee(){
        Employee e = this.getEmployee();
        System.out.println(e.getClass().getName());
        if(e.getClass().getName().equals("Designer"))
            System.out.println("Hi, I'm the designer");
        else if (e.getClass().getName().equals("Programmer"))
            System.out.println("Hi, I'm the programmer");
        else if (e.getClass().getName().equals("Tester"))
            System.out.println("Hi, I'm the tester");

        e.doWork();
        return e;
    }

    abstract Employee getEmployee ();


}
