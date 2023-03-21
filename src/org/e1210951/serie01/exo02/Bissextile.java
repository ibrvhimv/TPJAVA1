package exo2;
public class Bissextile
{
    public Bissextile(){};
    public boolean bissextile(int a)
    {
        if(a/4==0)
        {
            if(a/100!=0)
            {
                return true;
            } else if (a/400==0)
            {
                return true;
            }
        }
        return false;
    }

}
