import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;
public class pool extends Applet
{
	Button b1,b2,b3,b4,b5;
		TextField t1,t2,t3;
		Image i1,i2;
		Label l1,l2,l3,l4,l5,l6,l7,l8;
	public void init()
	{
		i1=getImage(getCodeBase(),"3.jpg");
		l1=new Label("first number");
		l2=new Label("second number");
		setBackground(Color.magenta);
		t1=new TextField();
		t2=new TextField();
		b1=new Button("ADD");
		b2=new Button("MUL");
		b3=new Button("SUB");
		b4=new Button("DIV");
		b5=new Button("AVG");
	    l3=new Label("CALCULATOR-version0.3");
		l4=new Label();
		l5=new Label();
		l6=new Label();
	    l7=new Label();
		l8=new Label();
		t3=new TextField();
		setLayout(null);
		add(t1);
		add(t2);
		add(l8);
		add(l1);
		add(l2);
		add(b1);
		add(b2);
	    add(b3);
		add(b4);
		add(b5);
		add(l3);
		add(t3);
        add(l4);
		add(l5);
		add(l6);
		add(l7);
		b1.addActionListener(new dew());
			b2.addActionListener(new coca());
			b3.addActionListener(new appy());
			b4.addActionListener(new up());
			b5.addActionListener(new lemon());
		l1.setBounds(100,150,160,180);
		l2.setBounds(100,250,160,180);
		t1.setBounds(200,230,50,20);
		t2.setBounds(200,330,50,20); 
		b1.setBounds(150,500,80,20);
		b2.setBounds(231,500,80,20);
		b3.setBounds(312,500,80,20);
		b4.setBounds(393,500,80,20);
		b5.setBounds(474,500,80,20);
		l3.setBounds(150,50,180,180);
		l4.setBounds(360,150,160,80);
		l5.setBounds(360,231,160,80);
		l6.setBounds(360,312,160,80);
		l7.setBounds(360,393,160,80);
		l8.setBounds(360,90,160,80);
	}
	public void paint(Graphics g)
	{
		g.drawImage(i1,500,200,250,190,this);
	}
	 public class dew implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int s=a+b;
			l4.setText("sum is=  "+s);
		}
	}
	 public class coca implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int s=a*b;
			l5.setText("mul is=  "+s);
		}
	}
	 public class appy implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int s=a-b;
			l6.setText("sub is=  "+s);
		}
	}
	 public class up implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			float a=Float.parseFloat(t1.getText());
			float b=Float.parseFloat(t2.getText());
			float s=a/b;
			l7.setText("div is=  "+s);
		}
	}
	 public class lemon implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			float a=Float.parseFloat(t1.getText());
			float b=Float.parseFloat(t2.getText());
			float s=(a+b)/2;
			l8.setText("avg is=  "+s);
		}
	}
}
/*<applet code="pool" width="1024" height="1000"> </applet>*/

