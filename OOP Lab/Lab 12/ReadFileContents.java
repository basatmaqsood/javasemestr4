import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFileContents {
public static void main(String[] args) {
try {
File file =new File("E:\\OOP Lab\\Lab 12/new.txt");
Scanner myReader=new Scanner(file);
while (myReader.hasNextLine())
{
String data=myReader.nextLine();
System.out.println(data);
}
myReader.close();
//Using other methods of File.
System.out.println(" Read Permissions of File : " + file.canRead());
System.out.println(" Write Permissions of File : " + file.canWrite());
System.out.println(" Absolute Path of File : " + file.getAbsolutePath());
 System.out.println(" Length Permissions of File : " + file.length());
//Create New File
File file_n =new File("E:/OOP Lab/Lab 12/textfile.txt");
 if (file_n.createNewFile())
System.out.println("File named " +file_n.getName() + " is created successfully!");
else
System.out.println(" File " +file_n + " already exists");
file_n.delete();
if (file_n.exists())
{
System.out.println(file_n.getName());
}
else System.out.println("File Deleted!");
}
catch (FileNotFoundException e)
{
System.out.println("An error ocurred." +e);
//e.printStackTrace();
}
catch (IOException ioe)
{
System.out.println("File not created!" +ioe);
}
}
}
