package org.e12109518.serie05.exo12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exo12
{
    public static void main(String[] args)
    {
        List<String> words = new ArrayList<>(List.of("one", "two","three","four","five","six","seven","eight","nine","ten"));
        words.add("eleven");
        words.add("twelve");
        System.out.println("Liste de chaine de caractéres");
        words.forEach(System.out::println);
        words.removeIf(s->s.length()%2==0);
        words.forEach(System.out::println);
        Function<String,String> functionUpper= String::toUpperCase;
        words.forEach(System.out::println);
        for(String ch : words)
        {
            words.set(words.indexOf(ch), ch.toUpperCase());
        }
        words.forEach(System.out::println);
        Predicate<String> commenceVoyelle=x->x.startsWith("a")||x.startsWith("o")||x.startsWith("u")||x.startsWith("i")||x.startsWith("y")||x.startsWith("e");
        for (String ch : words)
        {
            if(commenceVoyelle.test(ch)) words.set(words.indexOf(ch), ch.toUpperCase());
        }
        words.forEach(System.out::println);

        Comparator<String> cmpLongueur =Comparator.comparing(s->s.length());
        words.sort(cmpLongueur);
        System.out.println("Liste triée avec taille des chaines de caractéres");
        words.forEach(System.out::println);
        words.sort(cmpLongueur.thenComparing(Comparator.naturalOrder()));
        System.out.println("Liste triée avec taille des chaines de caractéres et Ordre Alphabétique");
        words.forEach(System.out::println);
    }
}
