 class uncle
{
int i=10;
private int a=20; 
public int b=30;
protected int c=40;
public uncle()
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
		subclass u=new subclass();
	}
}
