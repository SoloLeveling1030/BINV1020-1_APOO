import java.time.LocalDate;
import java.util.ArrayList;

public class TestVoyageOrganise {
    public static void main(String[] args) {
        ArrayList<String> activiteBateau = new ArrayList<>();
        activiteBateau.add("nager");
        activiteBateau.add("danser");

        Bateau bateau1 = new Bateau("Titanic",100000000,activiteBateau);
       Croisiere croisiere1 = new Croisiere(LocalDate.of(2005,3,12),135,"Titanic",20000,bateau1);
        Circuit circuit = new Circuit(LocalDate.of(1999,1,3),1000000000,"ONE PIECE",30000000,"il est long ce lait");
        System.out.println(circuit);
        System.out.println(circuit.trouverPrix());
        System.out.println(croisiere1);
        System.out.println(croisiere1.trouverPrix());
    }

}
