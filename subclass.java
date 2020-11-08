
 public class uncle
{
uncle()
{
int i=10;
Private int a=20;
Public int b=30;
Protected int c=40;
}
public void adi()
{
System.out.println("default="+i);
System.out.println("private="+a);
System.out.println("public="+b);
System.out.println("protected="+c);
}
}
class subclass extends uncle
{
}
class modifiers
{
	public static void main(String []args)
	{
		subclass u1=newsubclass();
		u1.adi();
	}
}
