import java.io.*;
class archit
{
public static void main(String []hb)
{
	File f1=new File("D:/adi/box.txt");
System.out.println("can we read file="+f1.canWrite());
System.out.println("file exist+"+f1.exists());
System.out.println("file name ="+f1.getName());
System.out.println("length of file is="+f1.length());
}
}