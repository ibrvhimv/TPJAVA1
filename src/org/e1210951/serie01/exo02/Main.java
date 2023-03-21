package exo2;

public class Main
{
    public static void main(String[] args)
    {
        Bissextile a = new Bissextile();
        System.out.println("L'année 1900 est "+ a.bissextile(1900));
        int []year= {1900, 1901, 1996, 2000};
        for(int i: year)
        {
            if(a.bissextile(year[i]))
            {
                System.out.println("L'année "+year[i]+" est bissextile" );
            }
            else
            {
                System.out.println("L'année "+year[i]+" n'est pas bissextile" );
            }
        }
    }
}
