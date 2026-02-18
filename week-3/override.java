class A{
    int i , j;
    A(int a , int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println("value of i " + i);
        System.out.println("value of j " + j);
    }
}

class B extends A{
    int k;
    B(int a , int b ,int c){
        super(a , b);
        k = c;
    }
    void show(){
        System.out.println("value of i " + i);
        System.out.println("value of j " + j);
        System.out.println("value of k " + k);
    }
}

public class override{

    public static void main(String[] args) {
        B subOb = new B(10 , 20, 30);
        subOb.show();
    }
}