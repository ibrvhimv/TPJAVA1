package org.e12109518.serie04.exo11;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public interface Exo11
{
    public static void main(String[] args)
    {
        Comparator<String> taillech=(ch1,ch2)->ch1.length()-ch2.length();
        Comparator<String> tailleCh=(ch1,ch2)->Integer.valueOf(ch1.length()).compareTo(Integer.valueOf(ch2.length()));
        Comparator<Person> cmpLastname =(ch1,ch2)->ch1.getLastName().compareTo(ch2.getLastName());
        Comparator<Person> cmpLastNaneFirstName = cmpLastname
                .thenComparing(Comparator.comparing((Person p2)->p2.getFirstName()));
        Comparator<Person> comparePerson =(p1,p2)->(p1.getLastName().compareTo(p2.getLastName())!=0)? p1.getLastName().compareTo(p2.getLastName()):p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> compareInvPerson = Comparator.comparing((Person p3)->p3.getFirstName()).thenComparing(Comparator.comparing((Person p4)->p4.getLastName()));
//    Comparator<Person> cmpPerson =(p1,p2)->
        List<Person> persons = new ArrayList<>();
        Person t1 =new Person("Ibrahima","Ndiaye",3);
        Person t2 =new Person("Iba","Ndiaye",3);
        Person t3 =null;
        Person t4 =null;
        persons.add(t1);
        persons.add(t3);
        persons.add(t4);
        persons.add(t2);
        persons.sort(Comparator.nullsLast(comparePerson));
        System.out.println(persons);
    }
}
