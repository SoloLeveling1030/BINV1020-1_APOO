public class TestBoisson {
    public static void main(String[] args) {
        Boisson jus1 = new Boisson("Jus d'oranges pressées",4, 20);
        System.out.println("Exemple d'affichaqe d'une boisson :");
        System.out.println(jus1);
        Boisson coktail = new BoissonAlcoolisee("Bloody Mary", 9, 12, 14.0);
        System.out.println("Exemple d'affichage d'une boisson alcoolisée : ");
        System.out.println(coktail);
        System.out.println("Exemple d'affichage des bières : ");
        Boisson orval = new Biere("Orval",4,33,6.2,false);
        System.out.println(orval);
        Boisson jupiler = new Biere("Jupiler",2.5,33,5.2,true);
        System.out.println(jupiler);
        System.out.println("Exemple d'affichage d'un vin :");
        Boisson chablis = new Vin("Chablis premier cru 2017",6.5,15,13.5,"Bourgogne","blanc","chardonnay","France");
        System.out.println(chablis);
        System.out.println("Test de l'exception en cas de couleur null : ");
        try {
            new Vin("Château-Chalon 2013",10,15,14,"savagnin",null,"Jura","France");
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        System.out.println("Test de l'exception en cas de couleur invalide non null : ");
        try {
            new Vin("Château-Chalon 2013",10,15,14,"savagnin","jaune","Jura","France");
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println("Test de l'égalité de deux boissons : ");
        Boisson jus2 = new Boisson("Jus d'oranges pressées",4, 20);
        System.out.println("jus1.equals(jus2) : " + jus1.equals(jus2));
        Boisson jus3 = new Boisson("Jus d'oranges pressées",3, 15);
        System.out.println("jus1.equals(jus3) : " + jus1.equals(jus3));
        Boisson jus4 = new Boisson("Jus d'oranges",3, 20);
        System.out.println("jus1.equals(jus3) : " + jus1.equals(jus4));
    }
}
