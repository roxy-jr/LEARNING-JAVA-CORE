import java.util.*;
public class ArithimaticProgression{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total number of element in the series");
        int n=sc.nextInt();
        if(n%2==0){
        if(n>=4){
         int ar[]=new int[n];
        System.out.println("ENTER THE ARITHIMATIC PROGRESSION SERIES");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        if(ar[1]-ar[0]==ar[2]-ar[1]&&ar[3]-ar[2]==ar[4]-ar[3]&&ar[5]-ar[4]==ar[6]-ar[5]&&ar[7]-ar[6]==ar[8]-ar[7]){
        int a= ar[0];
        int d= ar[1]-ar[0];
        int l= ar[n-1];
        //int sum=n/2*((a+(n-1)*d));
        int sum= n/2*(a+l); // we can use both formula for finding the sum of arithimatic progession
        System.out.println("the sum of your A.P are = " + sum);
    }
    else{
        System.out.println("invalid arithimatic progression");        
    }
        }
        else{
            System.out.println("ENTER A.P SERIES MORE THAN 4 ELEMENTS"); 
}
        }
else{
     if(n>=4){
         int ar[]=new int[n];
        System.out.println("ENTER THE ARITHIMATIC PROGRESSION SERIES");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        if(ar[1]-ar[0]==ar[2]-ar[1]&&ar[3]-ar[2]==ar[4]-ar[3]&&ar[5]-ar[4]==ar[6]-ar[5]&&ar[7]-ar[6]==ar[8]-ar[7]){
        int a= ar[0];
        int d= ar[1]-ar[0];
        int l= ar[n-1];
        //int sum=n/2*((a+(n-1)*d));
        double s= n/2+0.5; // we can use both formula for finding the sum of arithimatic progession
        double sum=s*(a+l);
        System.out.println("the sum of your A.P are = " + sum);
    }
    else{
        System.out.println("invalid arithimatic progression");        
    }
        }
        else{
            System.out.println("ENTER A.P SERIES MORE THAN 4 ELEMENTS"); 
}
}
}
}