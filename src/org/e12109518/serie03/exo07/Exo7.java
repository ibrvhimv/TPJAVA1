package org.e12109518.serie03.exo07;
public class Exo7
{
    public static void main(String[] args)
    {
        Joueur j1= new Joueur("Fabien",26);
        Joueur j2= new Joueur("Lilien",26);
        Joueur j3= new Joueur("Bixente",28);
        Joueur j4= new Joueur("Youri",18);
        Joueur j5 = new Joueur("Ibrahima",19);
        Joueur j9 = new Joueur("Ibrahima Nd",19);
        Equipe manU=new Equipe(){};
        manU.addJoueur(j1);
        manU.addJoueur(j2);
        manU.addJoueur(j3);
        manU.addJoueur(j4);
        manU.addJoueur(j5);
        manU.addJoueur(j9);
        System.out.println("Equipe ManU"+manU);
        System.out.println("Le joueur "+j1.getNom()+"est il present dans l'équipe? : "+manU.isJoueurPresent(j1));
        System.out.println(j9.getNom()+" a t- il été bien supprimé ? : "+manU.removeJoueur(j9));
        System.out.println("Equipe ManU"+manU);
        manU.clear();
        System.out.println("L'équipe ManU aprés utilisation de clear() :"+manU);
        EquipeLimitee psg=new EquipeLimitee(7);
        EquipeLimitee manU2=new EquipeLimitee(5){};
        manU2.addJoueur(j1);
        manU2.addJoueur(j2);
        manU2.addJoueur(j3);
        manU2.addJoueur(j4);
        manU2.addJoueur(j5);
        manU2.addJoueur(j9);
        System.out.println("Eauipe ManU2"+manU2);
        psg.addAllEquipeLimi(manU2);
        System.out.println("Equipe PSG" + psg);
        System.out.println("Nous allons ajouteer 3 nouveaux joueurs dans l'Equipe PSG alors qu'il est limité à 7 et il contient 5 joueurs");
        Joueur j6= new Joueur("Messi",39);
        Joueur j7 = new Joueur("Ronaldo",40);
        Joueur j8 = new Joueur("Ibrahima",24);
        psg.addJoueur(j6);
        psg.addJoueur(j7);
        psg.addJoueur(j8);
        System.out.println(psg);

    }

}
