import java.util.*;
class adi{
  //  private int a=10;
int i=4; // default is also accessible throughtout the program
protected int d=60;// it will only acessible in class adi and class inherited it and not in other class
public int c=40;// it can access throught this java file but in same package.

}
class sarika extends adi{
    public void dc(){
        System.out.println("I: " + i +"C: " + c + "D: " + d);
        // System.out.println("A: "+a); it gives error coz a has a private acess

    }

}
public class acessModifier{
    public static void main(String args[]){
        sarika s1=new sarika();
        s1.dc();
    }
}