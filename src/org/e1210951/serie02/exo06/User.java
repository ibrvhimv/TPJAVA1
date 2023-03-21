package org.e1210951.serie02.exo05;

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
    public User(String nom ,int salaire)
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


}
