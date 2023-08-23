package ThirtyOne;

public class ExceptionsHand {
	public static void main(String[] args)
	{
		System.out.println("Exception Handle");
		try
		{
			String str=null;
			System.out.println(str.toUpperCase());
				}
		catch (NullPointerException ae) {
			System.out.println(ae);
			ae.printStackTrace();
		}
		try
		{
			int number=10/0;
		}
		catch (ArithmeticException npe) {
			System.out.println(npe);
			npe.printStackTrace();
		}
		try
		{
			String str1="TN45BL9158";
			int number=Integer.parseInt(str1);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
		try
		{
			int [] arr=new int[10];
			for(int i=0;i<=10;i++)
			{
				arr[i]=i;
				System.out.println(arr[i]);
			}
		}
		catch(IndexOutOfBoundsException ibe)
		{
			System.out.println(ibe);
			ibe.printStackTrace();
		}
		System.out.println("Thank you");
	}

}
