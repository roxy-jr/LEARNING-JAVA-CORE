import java.util.*;
class adi
{
void anshika()
{
System.out.println("enter the nuber of row you want to print the pattern");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int r=1;r<=n;r++)
{
for(int c=1;c<=r;c++)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}
class pattern
{
public static void main(String [] args)
{
adi cs=new adi();
cs.anshika();
}
}