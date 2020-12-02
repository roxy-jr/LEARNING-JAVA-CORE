class riya
{
public riya()
{
public int a=10;
private int b=2;
protected int c=5;
int d=4;
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}
class sarika extends riya{
public sarika()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}
class anshika
{
 public anshika()
{
int e=a+d;
System.out.println(e);
}
}
class an
{
public static void main();
{
new anshika();
new sarika();
}
}