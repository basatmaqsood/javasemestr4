class ClassA {
    public void f1(int x){
        System.out.println(x);
    }
}

// overloaded functions can both be in parent class or both in child class or one in parent and other in child class
class ClassB extends ClassA{
    public void f1(int x, int y){
        System.out.println("result is : "+(x+y));
    }
}
public class Overloading {
    public static void main(String[] args) {
        ClassB c1 = new ClassB();
        c1.f1(2,4);
        c1.f1(4);
    }
}