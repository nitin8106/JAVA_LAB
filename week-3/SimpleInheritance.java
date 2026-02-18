class A{
    int i , j;
    void showij(){
        System.out.println("the value of i " + i);
        System.out.println("the value of j " + j);

    }
}

class B extends A{
    int k;
    void showk(){
        System.out.println("The value of k " + k); 
    }
    void sum(){
        System.out.println("The sum of i,j and k is " +  (i+j+k));
    }
}

public class SimpleInheritance {

    public static void main(String[] args) {
        A superOb = new A();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Using superOb: ");
        superOb.showij();

        B subOb = new B();
        subOb.i = 40;
        subOb.j = 50;
        subOb.k = 60;
        System.out.println("Using subOb : ");
        subOb.showij();
        subOb.showk();
        subOb.sum();
    }
}