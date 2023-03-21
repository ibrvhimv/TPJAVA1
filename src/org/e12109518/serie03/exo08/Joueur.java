package org.e12109518.serie03.exo08;

import java.util.Objects;

public class Joueur
{
    public Joueur(){};
    private String nom;
    private int annee;
    public Joueur(String nom, int annee)
    {
        this.nom=nom;
        this.annee=annee;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Joueur joueur = (Joueur) o;
        return annee == joueur.annee && Objects.equals(nom, joueur.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annee);
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getAnnee()
    {
        return annee;
    }

    public void setAnnee(int annee)
    {
        this.annee = annee;
    }



}
