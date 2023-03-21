package org.e12109518.serie02.exo06;

import java.util.Arrays;

public class UserUtil extends User
{
    public UserUtil(){}
    public UserUtil(String nom , String prenom, int salaire)
    {
        super(nom,prenom,salaire);
    }

    public void raise (User[] users,int percentage)
    {
        for(User i : users)
        {
            i.raise(percentage);
        }
    }

    public int getMaxSalary (User[] users)
    {
        int salMax=users[0].getSalaire();
        for(User i : users)
        {
            if(i.getSalaire()>salMax)
            {
                salMax=i.getSalaire();
            }
        }
        return salMax;
    }

    public double getAverageSalary(User[] users)
    {
        int sum=0;
        for(User i : users)        {
            sum+=i.getSalaire();
        }
        return sum/ users.length;
    }

    public double getMedianSalary(User[] users)
    {
        double[] salaries = new double[users.length];
        for (int i = 0; i < users.length; i++)
        {
            salaries[i] = users[i].getSalaire();
        }
        Arrays.sort(salaries);
        if (users.length % 2 != 0)
        {
            return salaries[users.length/2];
        }
        else
        {
            return(salaries [(users.length/(2-1))]-salaries[(users.length/(2))])/2;
        }
    }
}

