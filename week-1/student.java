class student {
    int rollNo;
    String name;
    String branch;
    int marks;
    void getData(int rollNo ,String name , String branch ,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.branch=branch;
        this.marks=marks;
    }
    void display(){
        System.out.println("Roll no : " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Branch : " + branch);
        System.out.println("Marks : " + marks);
    }
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.getData(518, "Nitin", "cse", 92);
        s2.getData(517, "hrushikesh", "cse", 97);
        s1.display();
        s2.display();
    }
}
