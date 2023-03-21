package org.e12109518.serie02.exo05;
public class Exo5
{
    public static void main(String[] args)
    {
        User u1 =new User("Wade","Abdoulaye",4000);
        User u2 =new User("Wade","Abdoulaye",4000);
        User u3 =new User("Sall","Macky",3000);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println("u1 et u2 sont ils égaux? "+u1.equals(u2));
        System.out.println("u1 et u3 sont ils égaux? "+u1.equals(u3));
        System.out.println("Le code de Hachade de u1 est "+u1.hashCode());
        System.out.println("Le code de Hachade de u2 est "+u2.hashCode());
        System.out.println("Le code de Hachade de u3 est "+u3.hashCode());
    }
}
