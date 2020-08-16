import java.awt.*;
import java.awt.event.*;
class ColorChange extends Frame implements AdjustmentListener
{                  
    Scrollbar red, green, blue;                            
    Label redLabel, greenLabel, blueLabel;  
    Panel p,p1;
	TextField t1;
    ColorChange()
    {
        setTitle("C the Change");
		setSize(300,300);
        setVisible(true);
		p = new Panel();
		p1= new Panel();
        p.setLayout(new GridLayout(3, 2, 5, 5)); 
		add(p,"South");
		add(p1,"North");
		t1= new TextField(30);
		p1.add(t1);
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0,  0, 255);
        p.add(redLabel = new Label("RED"));  
        p.add(red);
        
        green= new Scrollbar(Scrollbar.HORIZONTAL, 0, 0, 0, 255);
        p.add(greenLabel = new Label("GREEN"));
        p.add(green);
 
        blue = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,255);
        p.add(blueLabel = new Label("BLUE"));
        p.add(blue);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
    }
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        int r = red.getValue();  
        int g = green.getValue();
        int b = blue.getValue();
        redLabel.setText("RED: "+ r);
        greenLabel.setText("GREEN: "+ g);
        blueLabel.setText("BLUE: "+ b);
        t1.setBackground(new Color(r, g, b));
    }
    public static void main(String args[])
    {
        new ColorChange();
    }
}