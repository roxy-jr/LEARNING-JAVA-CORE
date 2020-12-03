import java.util.*;
class call
{
public static void main(String []arg)
{
int i;
System.out.println("enter the size of aaray");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("enter the elements "+n+" of array");
for(i=0;i<=n-1;i++)
{
ar[i]=sc.nextInt();
}
System.out.println("the reverse of this array are");
for(i=n-1;i>=0;i--)
{
System.out.print(ar[i]+"  ");
}

}
}




