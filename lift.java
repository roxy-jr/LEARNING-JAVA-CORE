import java.io.*;
public class lift
{
public static void main(String []p) throws IOException{
{
FileReader fr=new FileReader("./sarika.txt");
BufferedReader br=new BufferedReader(fr);
char c[]=new char[100];
br.read(c,0,21);
while(br.read()!=-1)
System.out.println(c);
br.close();
}
}
}
