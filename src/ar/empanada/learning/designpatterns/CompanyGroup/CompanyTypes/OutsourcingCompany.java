package ar.empanada.learning.designpatterns.CompanyGroup.CompanyTypes;

import ar.empanada.learning.designpatterns.CompanyGroup.Company;
import ar.empanada.learning.designpatterns.CompanyGroup.rol.Designer;
import ar.empanada.learning.designpatterns.CompanyGroup.rol.Programmer;
import ar.empanada.learning.designpatterns.CompanyGroup.Employee;

import java.util.ArrayList;
import java.util.List;

public class OutsourcingCompany extends Company {

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Designer());
        employees.add(new Programmer());
        return employees;
    }
}
