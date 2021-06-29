public class MyException extends NumberFormatException 
{
	private static final long serialVersionUID = 9135912387349545065L;

	MyException(String message)
	{
		System.out.println("You got exception !!"+ message);
	}

}
