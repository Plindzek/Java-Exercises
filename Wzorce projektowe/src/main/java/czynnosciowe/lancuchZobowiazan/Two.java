package czynnosciowe.lancuchZobowiazan;

public class Two extends java.lang.Number
    
{
    @Override
    public void forwardRequest(TypeNumber typenumber)
    {
        if (typenumber == TypeNumber.Zadanie_2)
        {
           System.out.println(getClass().getName()+":Wykonuję żądanie "+ typenumber);
        }
        else if (number != null)
        {
            System.out.println(getClass().getName()+":To nie moje zadanie, przekazuję żądanie kolejnemu obiektowi");
            number.forwardRequest(typenumber);
        }
    }

}
