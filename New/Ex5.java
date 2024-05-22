public class Ex5 {
    public static void main(String[] args) {
     StringBuffer sb = new StringBuffer("We are doing Lab 08");
     sb.delete(17, 19);
    System.out.println("After delete: " + sb);
    sb.deleteCharAt(0);
    System.out.println("After deleteCharAt: " + sb);
    sb.insert(16, "09");
     sb.insert(0, "W");
    System.out.println("After insertion: " + sb);
    }
    }
    