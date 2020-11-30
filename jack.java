import java.util.*;
public class jack
{
public static void main(String []ar)
{
System.out.println("enter the number of row");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int r=n;r>=1;r--)
{
for(int c=1;c<=r;c++)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}
