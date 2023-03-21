package org.e1210951.serie01.exo01;

import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int x ;
        System.out.println("Veuillez saisir le nombre pour calculer sa factorielle");
        Scanner lire = new Scanner(System.in);
        x=lire.nextInt();
        Factorielle c1 = new Factorielle();
        int intfact= c1.intFactorielle(x);
        System.out.println("Valeur Factorielle en int de "+x+" vaut "+intfact);
        double doubleFact = c1.doubleFactorielle(x);
        System.out.println("Valeur Factorielle en Double de "+x+" vaut "+doubleFact);
        BigInteger bigIntFact =c1.bigIntFactorielle(x);
        System.out.println("Valeur Factorielle en Double de "+x+" vaut "+bigIntFact );
    }
}
