import java.util.ArrayList;

public class Carte {
    private ArrayList<Boisson> boissons = new ArrayList<Boisson>();;

    public boolean ajouter(Boisson boisson){
        if (this.contient(boisson))return false;
        return boissons.add(boisson);
    }
    public boolean retirer(Boisson boisson){
        return boissons.remove(boisson);
    }
    public boolean contient (Boisson boisson){
        return boissons.contains(boisson);
    }
    public int  nombreDeBoissons(){
        return boissons.size();
    }

    @Override
    public String toString() {
        String texte = "Nombre de boissons : "+nombreDeBoissons();
        for (Boisson b : boissons) {
            texte +="\n"+ b.toString();

        }
        return texte;
    }
}