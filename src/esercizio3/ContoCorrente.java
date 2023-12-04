package esercizio3;
import exception.BancaException;

public class ContoCorrente
{
    String titolare;
    int nMovimenti;
    final int maxMovimenti=50;
    double saldo;

    public ContoCorrente(String titolare,double saldo)
    {
        this.titolare=titolare;
        this.saldo=saldo;
        nMovimenti=0;
    }
    public void preleva(double x) throws BancaException
    {
        try
        {
            if (x > 0)
            {
                if (nMovimenti < maxMovimenti)
                {
                    saldo = saldo - x;
                } else
                {
                    saldo = saldo - x - 0.50;
                    nMovimenti++;
                }
            }
            else
            {
                throw new BancaException("non hai più soldi");
            }
        }
        catch(BancaException e)
        {
            System.out.println(e.getMessage());
        }


    }
    double Restituiscisaldo()
    {
        return saldo;
    }
}
