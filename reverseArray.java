import java.util.*;
class reverseArray
{
public static void main(String []e)
{
	int i;
System.out.println("enter the size of array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("enter the"+ n +" elements of array");
for(i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}

System.out.println("the reverse array is-->>"+"/n");
for(i=n-1;i>=0;i--){
	System.out.println(ar[i]+" ");
}
}
}



