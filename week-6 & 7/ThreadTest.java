class A extends Thread
{
	public void run()
	{
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println("\tFrom Thread A : i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j=1 ; j<=5 ; j++)
		{
			System.out.println("\tFrom Thread B : j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C extends Thread
{
	public void run()
	{
		for(int k=1 ; k<=5 ; k++)
		{
			System.out.println("\tFrom Thread C : k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest
{
	public static void main(String args[])
	{
		new A().start();    // A t1 = new A();  t1.start();
		new B().start();    // B t1 = new B();  t1.start();
		new C().start();    // C t1 = new C();  t1.start();
	}
}