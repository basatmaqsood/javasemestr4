class Box {

    private double width, height, depth;

    public void setDimension(double a, double b, double c) {
        height = a;
        width = b;
        depth = c;
    }

    public void showDimension() {
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
        System.out.println("Depth = " + depth);
    }
}

class Object {
    public static void main(String[] args) {

        
        // Box Box1 = new Box();
        // Box1.setDimension(12.123, 34.15243, 54.765);
        // Box1.showDimension();
        // Box1 = new Box();
        // Box1.showDimension();


        Integer I1 = Integer.valueOf("123");
        int I2= I1.intValue();
        int a = Integer.parseInt("546");
        int b = Integer.parseInt("4");
        System.out.println(a+b);
        System.out.println(I2);
    }
}