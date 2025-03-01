package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

public abstract class Employee {
    double salary;
    double bonus;

    public abstract double calculateBonus();

    public Employee(double salary) {
        this.salary = salary;
    }
    public double calculateSalary(){
        return salary + calculateBonus();
    }
}
