import java.io.*;
class roxy
{
public static void main(String []ar) throws IOException
{
File f1=new File("d:/adi/box.txt");
for(int r=1;r<=3;r++)
{
f1.createNewFile();
}
System.out.println("is exist="+f1.exists());
System.out.println("size is="+f1.length());
}
}