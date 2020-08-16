import java.awt.*;
class DiffLayout extends Frame
{
	Panel p1,p2,p3;
	Button b1,b2,b3,b4,b5;
	Button reg,submit;
	TextField t1,t2;
	Label l1,l2;
	Button bt1,bt2,bt3,bt4,bt5,bt6;
	DiffLayout()
	{
		setTitle("Different Layout Usage");
		setSize(500,500);
		setVisible(true);
		p1=new Panel();
		add("North",p1);
		p2=new Panel();
		add("East",p2);
		p3=new Panel();
		add("West",p3);
		
		b1= new Button("Button1");
		b2= new Button("Button2");
		b3= new Button("Button3");
		b4= new Button("Button4");
		b5= new Button("Button5");
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		
		p2.setLayout(null); //P2 panel
		p2.setSize(400,400);
		l1= new Label("UserName");
		l2= new Label("Password");
		p2.add(l1);
		p2.add(l2);
		l1.setBounds(100,80,80,30);
		l2.setBounds(100,130,80,30);
		t1= new TextField();
		t2= new TextField();
		p2.add(t1);
		p2.add(t2);
		t1.setBounds(200,80,120,30);
		t2.setBounds(200,130,120,30);
		submit= new Button("Submit");
		reg= new Button("Registration");
		p2.add(submit);
		p2.add(reg);
		submit.setBounds(100,180,80,20);
		reg.setBounds(200,180,80,20);
		
		p3.setSize(200,200);  // P3 Panel
		p3.setLayout(new GridLayout(0,2));
		bt1= new Button("Click1");
		bt2= new Button("Click2");
		bt3= new Button("Click3");
		bt4= new Button("Click4");
		bt5= new Button("Click5");
		bt6= new Button("Click6");
		p3.add(bt1); p3.add(bt2); p3.add(bt3); p3.add(bt4);
		p3.add(bt5); p3.add(bt6);
	}
	public static void main(String[] args)
	{
		new DiffLayout();
	}
 }