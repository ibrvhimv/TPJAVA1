package org.e12109518.serie01.exo03;

public class Palindrome
{
    public Palindrome(){}
    public boolean palindromeBis(String chaine)
    {
        String newchaine = chaine.replaceAll("[^a-zA-Z0-9]","");
        newchaine = newchaine.toLowerCase();
        StringBuilder sb = new StringBuilder();
        return newchaine.equals(sb.append(newchaine).reverse().toString());
    }
}
