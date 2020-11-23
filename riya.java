import java.util.*;
class riya
{
public static void main(String []args)
{
System.out.println("enter the numeber o row you want to print the the pattern");
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int c=1;c<=n;c++)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}

