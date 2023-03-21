package TP1;

import java.math.BigInteger;

public class Factorielle
{
    public Factorielle(){}

    public int x;
    public int intFactorielle(int x)
    {
        int intfact=1;
        if(x<0)
        {
            throw new ArithmeticException("Le nombre doit etre positif");
        }
        else
        {
            for(int i =1;i<=x;i++)
            {
                intfact=intfact*i;
            }
            return intfact;
        }

    }
    public double doubleFactorielle(int x)
    {
        if(x<0)
        {
            throw new ArithmeticException("Le nombre doit etre positif");
        }
        double doublefact=1;
        for(int i =1;i<=x;i++)
        {
            doublefact=doublefact*i;
        }
        return doublefact;
    }
    public BigInteger bigIntFactorielle(int x)
    {
        BigInteger bigfact = BigInteger.valueOf(x);
        if(x==0)
        {
            return BigInteger.ONE;
        }
        else
        {
            bigfact = BigInteger.valueOf(x).multiply(bigIntFactorielle(x-1));
        }
        return bigfact;
    }


}
