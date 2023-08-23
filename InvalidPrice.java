package ThirtyOne;
import java.util.Scanner;
public class InvalidPrice {
	public static void main(String[] args) throws InvalidPriceException,Exception
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Price:");
		int price=s.nextInt();
		try {
			if(price<=0)
			{
				//throw new InvalidPriceException();
				
				throw new InvalidPriceException("Price is not negative");
			}
			else
			{
				System.out.println("The Price "+price);
			}
		}
		finally {
			System.out.println("Price Must be not negative ");
		}
		
		
	}

}
