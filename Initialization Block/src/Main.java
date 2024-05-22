class Box {
    //static
    //Static block is executred once when first object is created while default initialization block executes at every instance
    {
        System.out.println("INITIALIZATION BLOCK");
    }
    public Box(){
        System.out.println("CONSTRUCTOR BLOCK");
    }
    public int x= 10;
}

public class Main {
    public static void main(String[] args) {
        Box NewBoox = new Box();
        Box NewBoox1 = new Box();
        System.out.println(NewBoox1.x);
    }
}