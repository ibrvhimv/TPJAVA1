package org.e12109518.serie01.exo02;

public class Main
{
    public static void main(String[] args)
    {
        Bissextile a = new Bissextile();
        int [] year= {1900, 1901, 1996, 2000};
        for(int i=0;i< year.length; i++)
        {
            if(a.bissextile(year[i]))
            {
                System.out.println("L'année "+year[i]+" est bissextile" );
            }
            else
            {
                System.out.println("L'année "+year[i]+" n'est pas bissextile" );
            }
        }
    }
}
