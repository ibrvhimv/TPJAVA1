package org.e12109518.serie03.exo07;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class Equipe
{
    private SortedSet<Joueur> set;

    public SortedSet<Joueur> getSet() {
        return set;
    }

    public Equipe()
    {
        this.set=new TreeSet<>();
    }
    public Equipe(int nombreMax)
    {
        SortedSet<Joueur> b=new TreeSet<>();
    }
    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer() ;
        for(Joueur a :set)
        {
            sb.append(a);
        }
        return "Equipe =" + set.size()+"\n"+sb.toString();
    }


    public void addJoueur(Joueur a)
    {
        set.add(a);
    }
    public boolean removeJoueur(Joueur a)
    {
        return set.remove(a);
    }
    public boolean isJoueurPresent(Joueur a)
    {
        return set.contains(a);
    }
    public void addAllEquipe(Equipe a)
    {
        set.addAll(a.getSet());
    }
    public void clear()
    {
        set.removeAll(set);
    }
    public int getNombreJoueurs()
    {
        return set.size();
    }
    public double getMoyenneAge()
    {
        int s=0;
        for(Joueur j : set)
        {
            s=s+j.getAge();
        }
        return s/ set.size();
    }
}
