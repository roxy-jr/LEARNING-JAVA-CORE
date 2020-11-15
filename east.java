import java.util.*;
class east
{
public static void main(String []ar)
{
System.out.println("enter the number of row");
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
for(int r=1;r<=n;r++)
{
for(int c=1;c<=n;c++)
{
	if(c!=1)
	System.out.print("* ");
}
	
System.out.print("\n");
}
}
}