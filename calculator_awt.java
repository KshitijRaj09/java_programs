import java.awt.*;
class Calculator extends Frame
{
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Button decimal,add,sub,mul,div,equal,on,off,exit;
	TextField t1;
	Panel p;
	Calculator()
	{
		setTitle("Calculator");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		t1= new TextField(20);
		p = new Panel();
		p.setLayout(new GridLayout(4,5,5,5));
		b0=new Button("0");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		decimal=new Button(".");
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		equal=new Button("=");
		on=new Button("ON");
		off=new Button("OFF");
		exit=new Button("EXIT");
		add(t1);add(p);p.add(b0);p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);
		p.add(b9);p.add(add);p.add(sub);p.add(mul);p.add(decimal);p.add(div);p.add(equal);p.add(on);p.add(off);p.add(exit);
	}
	public static void main(String args[])
	{
		new Calculator();
	}
}