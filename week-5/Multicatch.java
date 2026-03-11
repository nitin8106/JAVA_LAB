public class Multicatch
{
	public static void main(String[] args)
	{
		try{
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42/a;
			System.out.println(b);
			int[] c = {1};
			c[42] = 18;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0 VJIT"  + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound : " + e);
		}
		catch(Exception e)
		{
			System.out.println("Divide by 0:" + e);
		}
		System.out.println("After try catch blocks");
	}
}