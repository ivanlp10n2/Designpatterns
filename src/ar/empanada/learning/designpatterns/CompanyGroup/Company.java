package ar.empanada.learning.designpatterns.CompanyGroup;

import java.util.List;

public abstract class Company {

    public void createSoftware(){
        System.out.println("creating the software, please wait");
//        Designer s = new Designer();
//        s.designArchitecture();
//        Programmer p = new Programmer();
//        p.writeCode();
//        Tester t = new Tester();
//        t.testSoftware();

//        Employee[] employees = new Employee[2];
//        employees[0] = new Designer();
//        employees[1] = new Programmer();
//
//        List<Employee> employees2 = new ArrayList<>();
//        employees2.add(new Designer());
//        employees2.add(new Programmer());
//        employees2.forEach(Employee::doWork);

        List<Employee> employees = getEmployees();
        employees.forEach(Employee::doWork);

        System.out.println("your software has been delivered to your house, be patient");
    }

    public abstract List<Employee> getEmployees();
}
