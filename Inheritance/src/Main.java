class Box{
    private int length,width,height;
    public Box(int x, int y, int z){
        length =x;
        width = z;
        height = y;
    }
    public int getVolume() {
        return (length * width * height);
    }
}
class SpecialBox extends Box{
    private String Content = "sweets";

    public SpecialBox(int x, int y, int z) {
        super(x, y, z);
    }

    public String getContent(){
        return Content;
    }
}
public class Main {
    public static void main(String[] args) {
        SpecialBox NewBox = new SpecialBox(4,6,7);
        System.out.println(NewBox.getVolume());
        System.out.println(NewBox.getContent());
    }
}