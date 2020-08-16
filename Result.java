import java.awt.*;
import java.awt.event.*;

class Result extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,result;
	Button add,sub,mul,div,clear,exit;
	Panel p1, p2;
	Result()
 	{
 		setTitle("Result");
    		setSize(500,400);
    		setVisible(true);
    		p1= new Panel();
    		add("Center",p1);
    		p2= new Panel();
    		add("South",p2);
    		p1.setLayout(null); //P1 panel
    		p1.setSize(400,400);
    		l1= new Label("Enter First Number");
    		l2= new Label("Enter Second Number");
    		l3= new Label("Result:");
    		p1.add(l1);
    		p1.add(l2);
    		p1.add(l3);
		l1.setBounds(100,80,120,30);
		l2.setBounds(100,130,125,30);
		l3.setBounds(100,180,120,30);
		t1= new TextField();
		t2= new TextField();
		result= new TextField();
		p1.add(t1);
		p1.add(t2);
		p1.add(result);
		t1.setBounds(240,80,120,30);
		t2.setBounds(240,130,120,30);
		result.setBounds(240,180,120,30);
		p2.setSize(200,400);  // P2 Panel
		p2.setLayout(new GridLayout(0,4,5,5));
		add=new Button("Addition");
    		sub=new Button("Subtraction");
    		mul= new Button("Multiply");
    		div= new Button("Division");
    		clear= new Button("Clear");
    		exit= new Button("Exit");
    		p2.add(add); p2.add(sub); p2.add(mul); p2.add(div);
		p2.add(clear); p2.add(exit);
	     add.addActionListener(this);
   		sub.addActionListener(this);
   		mul.addActionListener(this);
   		div.addActionListener(this);
   		clear.addActionListener(this);
   		exit.addActionListener(this);
 	}
	public void actionPerformed(ActionEvent ae)
 	{
  		Double a,b,res;
  		if(ae.getSource()==add)
  		{
  			a=Double.parseDouble(t1.getText());
  			b=Double.parseDouble(t2.getText());
  			res=a+b;
  			result.setText(Double.toString(res));
  		}
  		else if(ae.getSource()==sub)
  		{
  			a=Double.parseDouble(t1.getText());
  			b=Double.parseDouble(t2.getText());
  			res=a-b;
  			result.setText(Double.toString(res));
  		}
  		else if(ae.getSource()==mul)
  		{
  			a=Double.parseDouble(t1.getText());
  			b=Double.parseDouble(t2.getText());
  			res=a*b;
  			result.setText(Double.toString(res));
  		}
  		else if(ae.getSource()==div)
  		{
  			a=Double.parseDouble(t1.getText());
  			b=Double.parseDouble(t2.getText());
  			res=a/b;
		  	result.setText(Double.toString(res));
  		}
		else if(ae.getSource()==clear)
  		{
  			t1.setText(null);
  			t2.setText(null);
  			result.setText(null);
  		}
  		else
			System.exit(0);
	}
 	public static void main(String args[])
	{
		new Result();
 	}
}
