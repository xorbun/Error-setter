import esercizio1.Arrayofnumber;
import exception.Invalidindex;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
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
        input.close();
    }
}