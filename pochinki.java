class pochinki
{
public static void main(String []ar)
{
int balance=500;
int w=6000;
if(balance<w)
{
throw new ArithmaticException("inssufficient balance");
}
balance=balance-w;
System.out.println("your current balance is="+balance);
System.out.println("transaction complete");
}
}

