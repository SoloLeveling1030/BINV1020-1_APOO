import java.util.Arrays;

public class Vin extends BoissonAlcoolisee {
    private final static String []  COULEUR_AUTORISEES ={"rouge","blanc","rosé"};
    private String region;
    private String couleur;
    private String cepage;
    private String paysDorigine;

    public Vin(String nom, double prix, int contenance, double degreDalcool, String region, String couleur, String cepage, String paysDorigine) {
        super(nom, prix, contenance, degreDalcool);
        if(couleur == null) throw new IllegalArgumentException("La couleur doit Ítre choisie parmi les valeurs suivantes : "+ Arrays.toString(COULEUR_AUTORISEES));
        if (!Arrays.toString(COULEUR_AUTORISEES).contains(couleur))throw  new IllegalArgumentException("La couleur doit Ítre choisie parmi les valeurs suivantes : "+ Arrays.toString(COULEUR_AUTORISEES));
        this.region = region;
        this.couleur = couleur;
        this.cepage = cepage;
        this.paysDorigine = paysDorigine;
    }

    public String getRegion() {
        return region;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getCepage() {
        return cepage;
    }

    public String getPaysDorigine() {
        return paysDorigine;
    }


    @Override
    public String toString() {

        return "Vin "+couleur+super.toString()+"\nCépage : "+cepage+"\nOrigine : "+region+" - "+paysDorigine;
    }

}
