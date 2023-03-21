package org.e12109518.serie01.exo04;

public class Main
{
    public static void main(String[] args)
    {
        Annagramme a = new Annagramme();
        Annagramme b = new Annagramme();
        String phrase1="Paul et Ngolo";
        String phrase2="Telecom et Galilee";
        String phrase3="Bonjour le monde et Hello world";
        String phrase4="Galilee et egaille";
        String phrase5="Serveur et reveurs";
        String phrase6="Boris Vian et Bison ravi";
        String phrase7="La foret amazonienne et La zone enorme fanait";
        System.out.println("\n******** TEST 1 *********");
        System.out.println("POUR LES PHRASES 1 , 2 ET 3");
        if(a.isAnagramme(phrase1,phrase2))
        {
            if(a.isAnagramme(phrase2,phrase3))
            {
                System.out.println("Les phrases sont des annagrammes");
            }
            else
            {
                System.out.println("Les phrases ne sont pas des annagrammes");
            }
        }
        else
        {
            System.out.println("Les phrases ne sont pas des annagrammes");
        }

        System.out.println("\n******** TEST 2 *********");
        System.out.println("POUR LES PHRASES 4, 5, 6 ET 7");
        if(b.isAnagramme(phrase4,phrase5))
        {
            if(b.isAnagramme(phrase5,phrase6))
            {
                if(b.isAnagramme(phrase6,phrase7))
                {
                    System.out.println("Les phrases sont des annagrammes");
                }
                else
                {
                    System.out.println("Les phrases ne sont pas des annagrammes");
                }
            }
            else
            {
                System.out.println("Les phrases ne sont pas des annagrammes");
            }
        }
        else
        {
            System.out.println("Les phrases ne sont pas des annagrammes");
        }
    }

}
