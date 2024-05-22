public class Ex3 {
    public static void main(String args[])
    {
     StringBuffer sb1 = new StringBuffer("ABCDEFGHI");
    char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
     System.out.println("Array before copying: " + new String(ch));
    sb1.getChars(1, 4, ch, 4);
     System.out.println("Array after copying: " + new String(ch));
    } 
}
    