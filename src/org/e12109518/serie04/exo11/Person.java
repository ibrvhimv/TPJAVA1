package org.e12109518.serie04.exo11;

public class Person
{
    private String firstName;
    private String LastName;
    private int age;
    public Person(){}

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return LastName;
    }

    public int getAge()
    {
        return age;
    }
    public Person(String firstName , String LastName , int age )
    {
        this.firstName =firstName;
        this.LastName=LastName;
        this.age=age;
    }
}
