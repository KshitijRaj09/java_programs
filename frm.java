import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class frm
{
	JFrame f;
	JPasswordField jpf;   
	JTextField jt; 
	
	public frm()
     	{
     		f = new JFrame("Swing Frame");
			f.setLayout(null);
			JLabel user1 = new JLabel("Enter the User Name: ");
			jt = new JTextField(15);
			JLabel pass1 = new JLabel("Enter the Password: ");
			jpf = new JPasswordField(15);
			jpf.setEchoChar('#');
			user1.setBounds(50,20,150,70);
			pass1.setBounds(50,90,150,70);
			jt.setBounds(220, 40,130,27);
			jpf.setBounds(220,110,130,27);
			f.add(jpf);
			f.add(user1);
			f.add(jt);
			f.add(pass1);
			f.setSize(450,250);
			f.setVisible(true);
			f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{	
				System.exit(0);	
			}
		});  
    }

	public static void main(String args[])
	{
		frm ff = new frm();
	}
}


