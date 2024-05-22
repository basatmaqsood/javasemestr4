public class Ex4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(" in ");
        sb.append("Allah");
        sb.append('!');
        sb.insert(0,"Believe");
        sb.append('\n');
        sb.append("Allah is Great");
        char c=sb.charAt(20);
        System.out.println("character at index 20 is: "+c);
        sb.setCharAt(20,'I');
        System.out.println(sb);
       }
}
