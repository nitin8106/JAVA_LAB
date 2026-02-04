class Box {

    double width,height,depth;
    Box(double w,double h,double d){
        this.width=w;
        this.height=h;
        this.depth=d;
    }
    Box(){
        width=height=depth=-1;
    }
    Box(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*depth*height;
    }
}
class OverloadCons{
    public static void main(String[] args) {
        Box mybox1=new Box(20,20,20);
        Box mybox2=new Box();
        Box mybox3=new Box(10);
        double vol;
        vol = mybox1.volume();
        System.out.println(vol);
        vol = mybox2.volume();
        System.out.println(vol);
        vol = mybox3.volume();
        System.out.println(vol);
    }
}
