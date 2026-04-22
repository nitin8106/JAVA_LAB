import java.util.*;
public class StrTokenizer
{
	public static void main(String args[])
	{
		System.out.println("Using constructor 1 - ");
		StringTokenizer st1 = new StringTokenizer("Hello vjit how are you");
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		System.out.println("using constructor - 2");
		StringTokenizer st2 = new StringTokenizer("welcome:to:vjit" , ":");
		while(st2.hasMoreTokens())
			System.out.println(st2.nextToken());
		System.out.println("using constructor - 3");
		StringTokenizer st3 = new StringTokenizer("welcome:to vjit" , ":", true);
		while(st3.hasMoreTokens())
			System.out.println(st3.nextToken());
	}
}