package org.e12109518.serie02.exo06;

import java.util.Objects;

public class User
{
    public User(){};
    private String nom;
    private String prenom;
    private int salaire;

    @Override
    public String toString() {
        return "User : " +  "prénom= " + prenom +", nom=" + prenom + ", salaire=" + salaire ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return salaire == user.salaire && nom.equals(user.nom) && prenom.equals(user.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, salaire);
    }

    public User(String nom , String prenom, int salaire)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
    }
    public User(String nom , int salaire)
    {
        this.nom=nom;
        this.prenom="";
        this.salaire=salaire;
    }
    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void raise(int raise)
    {
        this.salaire=this.salaire+raise;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getSalaire()
    {
        return salaire;
    }

    public void setSalaire(int salaire)
    {
        this.salaire = salaire;
    }

    public int compare(org.e12109518.serie02.exo05.User u1, org.e12109518.serie02.exo05.User u2)
    {

        int result = u1.getNom().compareTo(u2.getNom());
        if (result == 0)
        {
            result = u1.getPrenom().compareToIgnoreCase(u2.getPrenom());
        }
        return result;
    }
}
