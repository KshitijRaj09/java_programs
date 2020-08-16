import java.awt.*;
import java.awt.event.*;
class Studentinfo extends Frame implements ActionListener
{	
	TextField txt1,txt2;
	TextArea textar1;
	Label l1,l2,l3,l4,l5,l6;
	Choice c1;
	CheckboxGroup cbg;
	Checkbox cb,cb1,cb2,cbg1,cbg2;
	Button btn1, btn2;
	DialogText dt;
	Studentinfo()
	{
		txt1= new TextField();
		txt2= new TextField();
		textar1= new TextArea();
		cbg= new CheckboxGroup();
		cbg1= new Checkbox("Male",cbg,false);
		cbg2= new Checkbox("Female",cbg,false);
		cb= new Checkbox("Reading");
		cb1= new Checkbox("Writing");
		cb2= new Checkbox("Cricket");
		c1= new Choice();
		l1= new Label("Name");
		l2= new Label("Age");
		l3= new Label("Address");
		l4= new Label("City");
		l5= new Label("Gender");
		l6= new Label("Hobbies");
		btn1 = new Button("Clear");
		btn2= new Button("Save");
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		l1.setBounds(30,100,50,20);
		l2.setBounds(30,200,50,20);
		l3.setBounds(30,300,50,20);
		l4.setBounds(30,450,50,20);
		l5.setBounds(30,550,50,20);
		l6.setBounds(30,580,50,20);
		add(txt1);
		txt1.setBounds(100,100,150,20);
		txt2.setBounds(100,200,150,20);
		textar1.setBounds(100,300,150,100);
		c1.setBounds(100,450,150,20);
		cbg1.setBounds(100,550,60,20);
		cbg2.setBounds(180,550,60,20);
		cb.setBounds(100,580,63,20);
		cb1.setBounds(180,580,63,20);
		cb2.setBounds(242,580,63,20);
		txt1.setForeground(Color.blue);
		txt2.setForeground(Color.magenta);
		textar1.setForeground(Color.green);
		txt1.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,15));
		txt2.setFont(new Font("Serif", Font.PLAIN,15));
		textar1.setFont(new Font("Serif", Font.PLAIN,15));
		add(txt2);
		add(textar1);
		add(c1);
		c1.add("Delhi");
		c1.add("Mumbai");
		c1.add("Kanpur");
		c1.add("Chennai");
		add(cbg1);
		add(cbg2);
		add(cb);
		add(cb1);
		add(cb2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		dt = new DialogText(this);
		add(btn1);
		add(btn2);
		btn1.setBounds(100,620,50,20);
		btn2.setBounds(200,620,50,20);
		setSize(500,1000);
		setLayout(null);
		setVisible(true);
		setTitle("Student Information");
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn2){
		dt.display();
		}else if(e.getSource()==btn1){
			txt1.setText(" ");
			txt2.setText(" ");
			textar1.setText(" ");
		}
	}
	public static void main(String args[])
	{
		Studentinfo obj= new Studentinfo();
	}
}
class DialogText extends Dialog implements ActionListener{
	Label lb1;
	Studentinfo obj1;
	Button bt1;
	public DialogText(Frame f){
		super(f,"Message Box",true);
		bt1 = new Button("ok");
		bt1.addActionListener(this);
		setLayout(new FlowLayout());
		add(new Label("Data Successfully Saved"));
		add(bt1);
		setSize(225,125);
	}
	public void actionPerformed(ActionEvent e){
		setVisible(false);
	}
	public void display(){
		setVisible(true);
	}	
}