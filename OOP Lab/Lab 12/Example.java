import java.util.regex.Pattern;
public class Example {
public static void main(String[] args) {

 System.out.println(Pattern.matches("c(at)*","catat"));
 System.out.println(Pattern.matches("c(at){3}","catatat"));
 System.out.println(Pattern.matches("([ABO]|(AB))[\\-|\\+]","AB-"));
 
}
}