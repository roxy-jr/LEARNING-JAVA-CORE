class hell
{
static
{System.out.println("****welcome****");}
public void f1()
{
int x=4;
for(x=4;x<10;x++)
System.out.println(x);
}
}
class tell extends hell
{
public void f1()
{int x=4;
for(x=4;x<10;x++)
System.out.println(x);
super.f1();
this.f1();
}
}
class wet
{
public static void main(String[] args)
{
hell h1=new hell();
tell t1=new tell();
t1.f1();
}
}