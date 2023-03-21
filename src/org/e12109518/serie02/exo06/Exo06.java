package org.e12109518.serie02.exo06;

public class Exo06
{
    public static void main(String[] args)
    {
        UserUtil a =new UserUtil();
        User [] telecom = new User[5];
        telecom[0]= new User("Mane","Sadio",4000);
        telecom[1]=new User("Ronaldo","Cristiano",10000);
        telecom[2]=new User("Mbappe","Kylian",9000);
        telecom[3]=new User("Rooney","Wayne",3000);
        telecom[4]=new User("Messi","Lionnel",5000);
        System.out.println("User before Raise :");
        for (User i : telecom)
            System.out.println(i);
        a.raise(telecom,3000);
        System.out.println("User after Raise");
        for (User i : telecom)
            System.out.println(i);
        System.out.println("The Salary Max is : "+a.getMaxSalary(telecom));
        System.out.println("The average Salary is "+a.getAverageSalary(telecom));
        System.out.println("the Median salary is "+a.getMedianSalary(telecom));
    }
}
