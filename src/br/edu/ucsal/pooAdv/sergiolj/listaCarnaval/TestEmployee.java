package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval;

import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Employee;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Manager;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Salesman;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Manager(5000.0);
        Employee employee2 = new Salesman(3000.0);

        System.out.printf("Salário total do gerente: %.2f\n", employee1.calculateSalary());
        System.out.printf("Salário total do vendedor: %.2f\n", employee2.calculateSalary());
    }
}
