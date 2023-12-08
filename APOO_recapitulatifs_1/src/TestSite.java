public class TestSite {
    public static void main(String[] args) {
        Site supercontent = new Site("www.supercontent.com");


        Film endgame = new Film("avengers: Endgame","action",181,279800000);
        try {
            endgame.getCategorie();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        Film avenggers = new Film("The Avengers","action",143,0);
        supercontent.ajouter(endgame);
        supercontent.ajouter(avenggers);
        System.out.println(supercontent);
        Serie bigbang =


    }
}
