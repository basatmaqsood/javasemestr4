public class Ex6 {
    public static void main(String[] args) {
    System.out.println("StringBuffer insert and append example!");
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.insert(0, "richard")); //First position
    int len = sb.length();//last position
    System.out.println(sb.insert(len, "Deniyal")); //len was 7
    System.out.println(sb.insert(6, "suzen")); //Six position
    System.out.println(sb.append("Margrett"));//Always last
    }
    }
    