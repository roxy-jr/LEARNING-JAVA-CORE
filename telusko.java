class A
{
int z;
public void f1()
{
System.out.println("java");
}
}
class B extends A
{
int z;
public void f1()
{
super.f1();
}
public void f2()
{
int z;
System.out.println(z=2);
System.out.println(this.z=3);
System.out.println(super.z=9);
}
}
}
class garima
{
public static void main(String[] args)
{
B b1=new B();
b1.f1();
b1.f2();
}
}