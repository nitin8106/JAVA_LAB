class MethodOverloadingDemo
{
	public void sum(float a , float b){
		System.out.println(a+b);
	}
	public void sum(float a , float b,float c){
		System.out.println(a+b+c);
	}
	public static void main(String[] args){
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.sum(10,20);
		obj.sum(10,20,30);
	}
}