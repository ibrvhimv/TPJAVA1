package org.e12109518.serie03.exo07;

import java.util.ArrayList;
import java.util.Objects;

public class Joueur implements Comparable<Joueur>
{
    public Joueur(){}
    private String nom;
    private int age;
    private int hachage;
    @Override
    public String toString()
    {
        return "Joueur : nom= " + nom +", age= " + age +"\n";
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Joueur joueur = (Joueur) o;
        return age == joueur.age && nom.equals(joueur.nom);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nom, age);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public Joueur(String nom, int age)
    {
        this.nom=nom;
        this.age=age;
    }

    @Override
    public int compareTo(Joueur o) {
        return this.nom.compareTo(o.getNom());
    }
}
