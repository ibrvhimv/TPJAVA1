package org.e12109518.serie04.exo10;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface Exo10
{
    public static void main(String[] args)
    {
        Function<String,String> chaineMajuscule =x->x.toUpperCase();
        System.out.println("string en majuscule :"+chaineMajuscule.apply("string"));

        Function<String,String> chaineNotNull=x-> (x==null) ?  "":x;
        System.out.println("Pour une chaine null chaineNotNull renvoie :"+chaineNotNull.apply(null));
        System.out.println("Pour une chaine 'choc'qui n'est pas nulle chaineNotNull renvoie :"+chaineNotNull.apply("choc"));

        Function<String,Integer>chaineLength =x-> (x==null) ?  0:x.length();
        System.out.println("Donnons la taille d'une chaine de caractere 'choc': ");
        Function<String,String> chaineParantheseBis=x-> (x==null) ?  "()":"("+x+")";
        BiFunction<String,String,Integer> emplacementChaine2 = (String ch1,String ch2)->ch1.indexOf(ch2);
        Function<String,Integer> eplacementChaine1=x->"abcdefghi".indexOf(x);
    }

}
