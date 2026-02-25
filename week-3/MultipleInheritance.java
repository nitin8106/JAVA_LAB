class student
{
	int rollNumber;
	void getNumber(int n){
		rollNumber = n;
	}
	void printNumber(){
		System.out.println(rollNumber);
	}
}
class test extends student
{
	float part1;
	float part2;
	void getMarks(float a , float b){
		part1 = a;
		part2 = b;
	}
	void putMarks(){
		System.out.println("Marks of part1: "+part1);
		System.out.println("marks of part2: " + part2);
	}
}
interface sports
{
	float sportwt = 6.0F;
	void putwt();
}
class results extends test implements sports
{
	float total;
	public void putwt(){
		System.out.println("sports marks : " + sportwt);
	}
	void display(){
		total = part1 + part2 + sportwt;
		System.out.println("The total marks of : " + rollNumber + "is" + total);
	}
}
class MultipleInheritance
{
	public static void main(String[] args){
		results a = new results();
		a.getNumber(10);
		a.printNumber();
		a.getMarks(10.0F , 20.0F);
		a.putMarks();
		a.putwt();
		a.display();
	}
}
