package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        //ArrayList<String> names = new ArrayList<>(List.of("Ana", "Bruno", "Carlos", "Daniela"));
        ArrayList<String> names = new ArrayList<>();

        names.addAll(List.of("Ana", "Bruno", "Carlos", "Daniela"));
        System.out.printf("Lista de nomes: %s\n", names);

        names.remove("Bruno");
        System.out.println("\nLista após removido Bruno:");
        names.forEach(name -> System.out.printf("Nome: %s\n", name));

        names.removeFirst();

        System.out.println("\nLista após remover o primeiro nome:");
        for(String name : names){
            System.out.printf("Nome: %s\n", name);
        }
    }
}
