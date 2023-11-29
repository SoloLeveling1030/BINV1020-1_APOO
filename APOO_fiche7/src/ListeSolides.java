import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceLoader;

public class ListeSolides implements Iterable<Solide> {
    private ArrayList<Solide> solides = new ArrayList<Solide>();
   public  int nombreDeSolides(){
       return solides.size();
   }
   public boolean estVide(){
       return solides.isEmpty();
   }
   public Iterator<Solide> iterator(){
       return solides.iterator();
   }
   public boolean supprimer(Solide solide){
       if(!contient(solide) )throw new IllegalArgumentException();
       return solides.remove(solide);
   }

   public boolean contient(Solide solide){
       return solides.contains(solide);
   }
   public boolean ajouter(Solide solide){
         if (contient(solide)) throw new IllegalArgumentException();
         return solides.add(solide);
   }


    public ArrayList<Solide> trouverPlusGrand() {
        double plusGrandSolide = 0;
        ArrayList<Solide> plusGrandSolides = new ArrayList<Solide>();

        for (Solide solide: solides) {
            double volume = solide.donnerVolume();
            if ( volume > plusGrandSolide ) {
                plusGrandSolides.clear();
                plusGrandSolides.add(solide);
                plusGrandSolide = volume;
            } else if (volume  == plusGrandSolide ) {
                    plusGrandSolides.add(solide);
                }
            }
        return plusGrandSolides;
    }



    @Override
    public String toString() {
       String texte = "la liste des solides : ";
        for (Solide solide: solides) {
            texte +="\n" + solide.toString();

        }
        return texte;
    }
}
