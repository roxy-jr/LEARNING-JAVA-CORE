import java.util.*;
public class TableNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to print table");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int data=n*i;
            System.out.println(n +"*"+ i +"="+ data);
        }
    }
    }