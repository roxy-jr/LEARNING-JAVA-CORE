class A implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("thread A="+i);
}
}
}
class B implements Runnable
{
public void run()
{
for(int j=1;j<=10;j++)
{
System.out.println("thread B="+j);
}
}
}
class cap
{
public static void main(String []ar)
{
Thread t1=new Thread(new A());
Thread t2=new Thread(new B());
t1.start();
t2.start();
}
}

