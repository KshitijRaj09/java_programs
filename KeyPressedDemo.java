import java.awt.*;  
import java.awt.event.*;  
class KeyPressedDemo extends KeyAdapter
{  
    Label l;  
    TextArea area;  
    Frame f;  
	String text;
    KeyPressedDemo(){  
        f=new Frame("KeyPressed");
		f.setSize(300,300);
		f.setLayout(null);
        l=new Label("Enter Text: ");  
        l.setBounds(20,50,100,20);  
        area=new TextArea();  
        area.setBounds(140,50,180,50);  
        area.addKeyListener(this);  
        f.add(l);f.add(area);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyChar()=='q'||e.getKeyChar()=='Q')
			System.exit(0);
		else
			text=area.getText();  
	}
    public static void main(String[] args)
	{  
        new KeyPressedDemo();  
    }  
}  