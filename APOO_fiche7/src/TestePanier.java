public class TestePanier {
    public static void main(String[] args) {
        Panier p = new Panier();
        Livre livre1 = new Livre("Livre1",10,"Haary potter",7);
        Dvd dvd1 = new Dvd("DVD1",15,"One piece crée par Echiro Oda","ODA");
        System.out.println("Livre   Harry Potter ajouté :"+p.ajouter(livre1) );
        System.out.println("Dvd One piece ajouté :"+p.ajouter(dvd1));
        System.out.println("Le prixTotal des produit est :"+p.caculerPrixTottal());
        System.out.println("Nombre de produit :"+ livre1.getNombrePage());

    }

}
