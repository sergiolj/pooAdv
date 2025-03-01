import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Airplane;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Bird;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.myInterface.Flyer;

public class TestFlyer {
    public static void main(String[] args) {
        Flyer f1 = new Airplane("Airbus A320");
        Flyer f2 = new Bird("águia");

        f1.fly();
        f2.fly();
    }
}
