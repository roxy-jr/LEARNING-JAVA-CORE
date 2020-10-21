import java.util.*;
public class swapNumber{
    public static void main(String args[]){
        System.out.println("enter the value of a and  b");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the swapped value of A= "+a+" and B= "+b);
    }
    }