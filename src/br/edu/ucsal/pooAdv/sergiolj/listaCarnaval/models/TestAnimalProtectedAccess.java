package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

public class TestAnimalProtectedAccess{
    public static void main(String[] args) {
        var dog = new Dog("Sauron");
        dog.bark();

        System.out.println("O atributo name com o modificador protected \n" +
                "pode ser acessado diretamente porque a \n" +
                "classe TestAnimalProtectedAccess esta no mesmo\n" +
                " pacote da classe Animal, caso contrário isso não seria possível\n" +
                "a não ser que a classe TestAnimalProtectedAccess estendesse Animal");

        String oldName = dog.name;
        dog.name = "Fifi";
        System.out.println(oldName + " agora chama-se "+ dog.name);
    }
}