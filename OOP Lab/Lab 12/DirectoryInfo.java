import java.io.*;
public class DirectoryInfo {
 public static void main(String[] args) {
 // Create a directory
 System.out.println("Creating temp directory...");
 //String fileName = "temp";
 File fn = new File("E:\\OOP Lab\\Lab 12");
 fn.mkdir();

 // Create sub directories under the temp directory
 File subdir1 = new File(fn, "tempdir1");
 subdir1.mkdir();
 File subdir2 = new File(fn, "tempdir2");
 subdir2.mkdir();

 // Check if it is a file or directory using isFile() method
 System.out.println(fn.getName() + " is a " +
 (fn.isFile()? "file." :"directory."));

 if (fn.isDirectory()) {
 String content[] = fn.list();
 System.out.println("The content of this directory:");
 for (int i = 0; i < content.length; i++) {
 System.out.println(content[i]);
 }
 }

 // Delete a directory
 System.out.println(fn.getName() +
 (fn.exists()? " exists": " does not exist"));
 System.out.println("Deleting temp directory...");
 subdir1.delete();
 subdir2.delete();
 fn.delete();
 System.out.println("Successful...");
 }
}

