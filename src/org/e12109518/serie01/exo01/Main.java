package org.e12109518.serie01.exo01;

import java.math.BigInteger;
public class Main
{
    public static void main(String[] args)
    {
        Factorielle c1 = new Factorielle();
        System.out.println("Factorielle de 10 en entier=  "+c1.intFactorielle(10));
        System.out.println("Factorielle de 10 en double ="+c1.doubleFactorielle(10));
        System.out.println("Factorielle de 10 en BigInteger ="+c1.bigIntFactorielle(10) );
        System.out.println("Factorielle de 13 en entier=  "+c1.intFactorielle(13));
        System.out.println("Factorielle de 13 en double ="+c1.doubleFactorielle(13));
        System.out.println("Factorielle de 13 en BigInteger ="+c1.bigIntFactorielle(13) );
        System.out.println("Factorielle de 25 en entier=  "+c1.intFactorielle(25));
        System.out.println("Factorielle de 25 en double ="+c1.doubleFactorielle(25));
        System.out.println("Factorielle de 25 en BigInteger ="+c1.bigIntFactorielle(25) );
    }
}
