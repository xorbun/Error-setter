package exception;

public class BancaException extends Exception
{

    public BancaException(String message)
    {
        super("non hai più soldi");
    }
}
