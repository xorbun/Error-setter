package exception;

public class NumberLessThanZeroException extends RuntimeException
{
    public NumberLessThanZeroException(int number)
    {
        super("il numero "+ number+" non è valido");
    }
}
