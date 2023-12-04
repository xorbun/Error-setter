import esercizio1.Arrayofnumber;
import esercizio2.Consumiauto;
import esercizio3.ContoCorrente;
import exception.NumberLessThanZeroException;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //ESERCIZIO 1
        Scanner input=new Scanner(System.in);
        Arrayofnumber [] vett=new Arrayofnumber[5];
        for (int i = 0; i < vett.length; i++)
        {
             vett[i]=new Arrayofnumber();
             System.out.println(vett[i]);
        }
        System.out.println("in quale posizione vuoi inserire un valore?");
        int choose;
        do
        {
            choose=input.nextInt();
            try
            {

                vett[choose]=new Arrayofnumber();
                for (int i=0;i< vett.length;i++)
                {
                    System.out.println(vett[i]);
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            };
         }
        while (choose!=0);



        //ESERCIZIO 2
        Consumiauto panda=new Consumiauto(350,0);
        try
        {
            System.out.println(panda.rapportoconsumo());
        }
        catch(RuntimeException e)
        {
            throw new NumberLessThanZeroException(0);
        }
        //ESERCIZIO 3
        


        input.close();
    }
}