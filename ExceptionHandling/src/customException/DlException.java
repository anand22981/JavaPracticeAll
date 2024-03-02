package customException;

public class DlException extends Exception
{
public String getMessage() 
{
	return "you age is not valid it must me 18-60";
}
}
