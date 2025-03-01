import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Dog;

public class TestAnimal{
    public static void main(String[] args) {
        var dog = new Dog("Sauron");
        dog.bark();

        System.out.println("O atributo name com o modificador protected \n" +
                "na classe Animal nao pode ser acessado diretamente porque a \n" +
                "classe TestAnimal esta em outro pacote e nao estende a classe Animal \n");

        //dog.name = "Rex"; //Não compila
        //String oldName = dog.name; //Não compila
        String oldName = dog.getName();
        dog.setName("Fifi");
        System.out.println(oldName + " agora chama-se "+ dog.getName());
    }

}