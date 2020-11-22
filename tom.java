import java.util.*;
class adi
{
 public void anshika()
{
System.out.println("enter the number of row to print the pattern");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int r=1;r<=n;r++)
{
for(int c=1;c<=r;c++)
{
	if(c%2==0)
System.out.print("*");
else
	System.out.print("#");
}
System.out.print("\n");
}
}
}
class tom
{
public static void main(String [] args)
{
adi a1=new adi();
a1.anshika();
}
}





