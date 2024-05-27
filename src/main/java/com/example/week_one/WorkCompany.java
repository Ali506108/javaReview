package com.example.week_one;

import java.util.ArrayList;
import java.util.List;

public class WorkCompany {

    private List<Employee> employees;

    public WorkCompany() {
        employees = new ArrayList<>();
    }

    public int calculatePay(){
        int total = 0;

        for(Employee employee : employees){
            total+=employee.getSalary();
        }
        return total;
    }


    public void addWorkEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeWorkEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void searchPeople(String name) {
        employees.stream().filter(names -> names.equals(name)).findFirst().orElse(null);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
