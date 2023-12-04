package esercizio1;

import java.util.Random;

public class Arrayofnumber
{
    int num;


    public Arrayofnumber()
    {
        Random rndm=new Random();
        this.num=rndm.nextInt(1,10);
    }

    @Override
    public String toString() {
        return "Arrayofnumber{" +
                "num=" + num +
                '}';
    }
}

