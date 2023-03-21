package org.e1210951.serie05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class exo12
{
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>(List.of("one", "two","three","for","five","six","seven","eight","nine","ten"));
        strings.add("eleven");
        strings.add("twelve");
        System.out.println("Liste de chaine de caractéres");
        for(String ch :strings)
        {
            System.out.println(ch);
        }

        strings.removeIf(s->s.length()%2==0);
        for(String ch :strings)
        {
            System.out.println(ch);
        }
        for(String ch :strings)
        {
            strings.set(strings.indexOf(ch), ch.toUpperCase());
        }
        for(String ch :strings)
        {
            System.out.println(ch);
        }
        Predicate<String> commenceVoyelle=x->x.startsWith("a")||x.startsWith("o")||x.startsWith("u")||x.startsWith("i")||x.startsWith("y")||x.startsWith("e");
        for (String ch : strings)
        {
            if(commenceVoyelle.test(ch))strings.set(strings.indexOf(ch), ch.toUpperCase());
        }
        for(String ch :strings)
        {
            System.out.println(ch);
        }
        Comparator<String> cmpLongueur =Comparator.comparing((String s)->s.length());
        strings.sort(cmpLongueur);
        System.out.println("Liste triée avec taille des chaines de caractéres");
        for(String ch :strings)
        {
            System.out.println(ch);
        }
        strings.sort(cmpLongueur.thenComparing(Comparator.naturalOrder()));
        System.out.println("Liste triée avec taille des chaines de caractéres et Ordre Alphabétique");
        for(String ch :strings)
        {
            System.out.println(ch);
        }
        




    }
}
