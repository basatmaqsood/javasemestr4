public class conversion {

    public static void main(String args[]) {
        byte b;
        int i = 257;
        float f = 4.4f;
        double d = 323.142;
        System.out.println("\n Conversion of int to byte");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\n Conversion of float to int");
        i = (int) f;
        System.out.println("f and i " + f + " " + i);
        System.out.println("\n Conversion of double to int");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\n Conversion of double to float");
        f = (float) d;
        System.out.println("d and f " + d + " " + f);
        System.out.println("\n Conversion of int to double");
        d = i;
        System.out.println("i and d " + i + " " + d);
        System.out.println("\n Conversion of double to byte");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}


