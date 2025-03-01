package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

public class Manager extends Employee {

    public Manager(double salary) {
        super(salary);
        this.bonus = 0.2;
    }

    @Override
    public double calculateBonus() {
        return this.salary * this.bonus;
    }
}
