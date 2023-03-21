package org.e12109518.serie03.exo07;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class EquipeLimitee
{
    SortedSet<Joueur> se ;
    public int nombreMax;
    public EquipeLimitee(int nombreMax)
    {
        this.se=new TreeSet<>();
        this.nombreMax=nombreMax;
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder() ;
        for(Joueur a :se)
        {
            sb.append(a);
        }
        return "Equipe =" + se.size()+"\n"+sb.toString();
    }


    public void addJoueur(Joueur a)
    {
        if(se.size()<nombreMax)
        {
            se.add(a);
        }
        else
        {
            System.out.println("Limite de joueurs atteinte");
        }
    }
    public boolean removeJoueur(Joueur a)
    {
        return se.remove(a);
    }
    public boolean isJoueurPresent(Joueur a)
    {
        return se.contains(a);
    }
    public void addAllEquipeLimi(EquipeLimitee a)
    {
        //  Collections.addAll(set,a.set.toArray(new Joueur[0]));
        for(Joueur ja : a.se)
        {
            if (se.size()<nombreMax)
            {
                if(!se.contains(ja))
                {
                    se.add(ja);
                }
            }
            else
            {
                System.out.println("Limite de joueurs atteinte");
            }
        }
    }
    public void clear()
    {
        for(Joueur ja : se)
        {
            se.remove(ja);
        }
    }
    public int getNombreJoueurs()
    {
        return se.size();
    }
    public double getMoyenneAge()
    {
        int s=0;
        double moy;
        for(Joueur j : se)
        {
            s=s+j.getAge();
        }
        moy=s/(double)se.size();
        return moy;
    }

}

