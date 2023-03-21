package org.e12109518.serie01.exo03;

public class Main
{
    public static void main(String[] args)
    {
        Palindrome a =new Palindrome();
        String phrase1 ="Rions noir";
        String phrase2 ="Esope reste ici et se repose";
        String phrase3="Elu par cette crapule";
        String phrase4="Et la marine va venir a Malte";
        String phrase5="Severe, dissuasive, je vis aussi de reves";
        System.out.println("La phrase 1 est elle Palindrome? "+a.palindromeBis(phrase1));
        System.out.println("La phrase 2 est elle Palindrome? "+a.palindromeBis(phrase2));
        System.out.println("La phrase 3 est elle Palindrome? "+a.palindromeBis(phrase3));
        System.out.println("La phrase 4 est elle Palindrome? "+a.palindromeBis(phrase4));
        System.out.println("La phrase 5 est elle Palindrome? "+a.palindromeBis(phrase5));
        System.out.println("La phrase 5 est elle Palindrome? "+a.palindromeBis(phrase5));
    }
}
