package org.e12109518.serie03.exo08;

import java.util.*;

public class RegistreJoueurs
{
    private Map<Integer,List<String>> map;
    public RegistreJoueurs()
    {
        this.map=new HashMap<>();
    }

    @Override
    public String toString() {
        return "Registre des Joueurs \n" +
                "map= \n" + map +
                '}';
    }

    public void addJoueur(Joueur a)
    {
        int annee=(a.getAnnee()/10)*10;
        List<String> LisJo= map.get(annee);
        if(LisJo!=null)
        {
            LisJo.add(a.getNom());
        }
        else
        {
            LisJo =new ArrayList<String>();
            LisJo.add(0,a.getNom());
            map.put(annee,LisJo);
        }
    }
    public List<String> get(int key)
    {
        return map.get(key);
    }
    public int count(int key)
    {
        return map.get(key).size();
    }
    public int count()
    {
        int size=0;
        for (List<String> LisJo: this.map.values())
        {
            size=size+LisJo.size();
        }
        return size;
    }




}
