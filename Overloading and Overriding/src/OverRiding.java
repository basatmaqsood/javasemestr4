class ClassC{
    public void F1(int x){
        System.out.println(x);
    }
}
// Overriding is changing function definition in child class
class ClassD extends ClassC{
    public void F1(int x){
        System.out.println("Result is "+x);
    }
}
public class OverRiding {
    public static void main(String[] args){
        ClassD d1 = new ClassD();
        d1.F1(7);
    }
}
