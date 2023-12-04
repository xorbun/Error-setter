package esercizio2;

public class Consumiauto
{
    int km;
    int l;
    public Consumiauto(int km,int l)
    {
        this.km=km;
        this.l=l;
    }
    public int rapportoconsumo()
    {
        int cons=km/l;
        return cons;
    }
}
