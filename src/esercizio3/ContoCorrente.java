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
    double Restituiscisaldo()
    {
        return saldo;
    }
}
