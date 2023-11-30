public class TestePanier {
    public static void main(String[] args) {
        Panier p = new Panier();
        Livre livre1 = new Livre("Haary potter crée par J.K; Rowling",10,"Haary potter","J.k. Rowling",7);
        Dvd dvd1 = new Dvd("One piece crée par Echiro Oda",15,"EIICHIRO oda");
        System.out.println("Livre   Harry Potter ajouté :"+p.ajouter(livre1) );
        System.out.println("Dvd One piece ajouté :"+p.ajouter(dvd1));
        System.out.println("Le prixTotal des produit est :"+p.caculerPrixTottal());
        System.out.println("Nombre de produit :"+ livre1.getNombrePages());
        System.out.println("Livre   Harry Potter ajouté :"+p.ajouter(livre1) );
        System.out.println("Dvd One piece ajouté :"+p.ajouter(dvd1));
        System.out.println("Le prixTotal des produit est :"+p.caculerPrixTottal());
        System.out.println("Nombre de produit :"+ livre1.getNombrePages());
    }
    
}
