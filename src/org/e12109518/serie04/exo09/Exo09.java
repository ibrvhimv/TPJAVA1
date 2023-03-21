package org.e12109518.serie04.exo09;

import java.util.function.Predicate;

public interface Exo09
{
    public static void main(String[] args)
    {
        Predicate<String> chainesup4= x -> x.length()>4;
        System.out.println("Choc est elle une chaine supérieure à 4 : "+chainesup4.test("Choc"));
        Predicate<String> chainevide=x-> !(x.isEmpty());
        System.out.println("Choc est elle une chaine non vide? : "+chainevide.test("Choc"));
        Predicate<String> startwithJ = x->x.startsWith("J");
        System.out.println("Choc est elle une chaine qui commence par J : "+startwithJ.test("Choc"));
        System.out.println("Joueur est elle une chaine qui commence par J : "+startwithJ.test("Joueur"));
        Predicate<String> chainede5 =x->x.length()==5;
        System.out.println("Choc est elle une chaine qui a une taille égale à 5 : "+chainede5.test("Choc"));
        System.out.println("PERDU est elle une chaine qui a une taille égale à 5 : "+chainede5.test("PERDU"));
        Predicate<String> startwithJand5 = startwithJ.and(chainede5);
        System.out.println("Joueur est elle une chaine qui commence par J et une taille de 5 : "+startwithJand5.test("Joueur"));
        System.out.println("Joger est elle une chaine qui commence par J et une taille de 5 : "+startwithJand5.test("Joger"));
    }
}