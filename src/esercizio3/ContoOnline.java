package esercizio3;

import exception.BancaException;

public class ContoOnline extends ContoCorrente
{
    double maxPrelievo;

    ContoOnline(String titolare,Double saldo, double maxP)
    {
        super(titolare,saldo);
        this.maxPrelievo=maxP;
    }
    void Stampasaldo()
    {
        System.out.println("titolare"+ titolare+ "-Saldo"+saldo+"-Num. movimenti"+nMovimenti
        +"-Max movimenti"+maxMovimenti+"-Max prelievo possibile"+maxPrelievo);
    }
    void Preleva(double x) throws BancaException {
        if(x<=maxPrelievo)
        {
            super.preleva(x);
        }
    }
}
