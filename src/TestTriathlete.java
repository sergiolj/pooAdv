import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Triathlete;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.myInterface.Runner;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.myInterface.Swimmer;

public class TestTriathlete {
    public static void main(String[] args) {
        Triathlete athlete = new Triathlete("Miguel Hidalgo");

        System.out.println("Para que fosse possível incluir o nome do atleta\n" +
                "foi inserido o método abstrato String getName() nas interfaces.\n" +
                "Esse por sua vez teria que ser implementado nas classes que implementam\n" +
                "as interfaces, em vez disso foi implementado na classe Athlete que\n" +
                        "por sua vez é superclasse de Triathlete, a qual herda o método.\n");
        athlete.run();
        athlete.swim();

        Runner runnerAthlete = athlete;
        Swimmer swimmerAthlete = athlete;

        System.out.println("\nAs duas outras variáveis criadas aqui apontam para" +
                "o mesmo objeto que o objeto athlete aponta.\n");

        runnerAthlete.run();
        swimmerAthlete.swim();

    }
}
