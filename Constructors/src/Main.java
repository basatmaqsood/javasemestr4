class Box{
    public int l,b,h;
    public Box(int x, int y, int z){
        l = x;
        h=y;
        b=z;
    }
}

public class Main {
    public static void main(String[] args) {
        Box Box1 = new Box(5,6,7);
        System.out.println(Box1.l);
        System.out.println(Box1.h);
        System.out.println(Box1.b);
    }
}