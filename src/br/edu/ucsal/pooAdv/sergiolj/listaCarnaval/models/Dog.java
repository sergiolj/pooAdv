package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void bark(){
        System.out.println(this.name + " is barking!");
    }
}
