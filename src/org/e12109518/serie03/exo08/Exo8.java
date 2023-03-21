package org.e12109518.serie03.exo08;

public class Exo8 {
    public static void main(String[] args)
    {
        Joueur j1 = new Joueur("Steve",1980);
        Joueur j2 = new Joueur("Hugo",1986);
        Joueur j3 = new Joueur("Djibril",1992);
        Joueur j4 = new Joueur("Blaise",1987);
        Joueur j5 = new Joueur("Paul",1993);
        Joueur j6 = new Joueur("Karim",1987);
        RegistreJoueurs p13=new RegistreJoueurs();
        p13.addJoueur(j1);
        p13.addJoueur(j2);
        p13.addJoueur(j3);
        p13.addJoueur(j4);
        p13.addJoueur(j5);
        p13.addJoueur(j6);
        System.out.println("Equipe p13 \n" + p13);
        System.out.println("Les joueurs nés en 1980 sont "+p13.get(1980));
        System.out.println("Les joueurs nés en 1990 sont au nombre de "+p13.count(1990));
        System.out.println("Le nombre total de joueur dans le régistre est de "+p13.count());
        System.out.println(p13);
    }
}
