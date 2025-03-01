package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

public class Salesman extends Employee{

    public Salesman(double salary) {
        super(salary);
        this.bonus = 0.1;
    }

    @Override
    public double calculateBonus() {
        return this.salary * this.bonus;
    }
}
