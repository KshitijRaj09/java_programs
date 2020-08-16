import java.awt.*;
class MenuDemo extends Frame
{
	MenuBar mb;
	Menu file,f3;
	MenuItem f1,f2,f4,f5;
	MenuItem s1,s2,s3;
	MenuDemo()
	{
		setVisible(true);
		setSize(600,600);
		setTitle("Menu Demo");
		mb= new MenuBar();
		setMenuBar(mb);
		file= new Menu("File");
		mb.add(file);
		f1= new MenuItem("New          Ctrl+N");
		file.add(f1);
		file.addSeparator();
		f2= new MenuItem("Open...      Ctrl+O");
		file.add(f2);
		file.addSeparator();
		f3= new Menu("Save         Ctrl+S");
		file.add(f3);
		file.addSeparator();
		s1= new MenuItem("Save Current ");
		f3.add(s1);
		s2= new MenuItem("Save As      ");
		f3.add(s2);
		s3= new MenuItem("Save All      ");
		f3.add(s3);
		f4= new MenuItem("Print...      Ctrl+P");
		file.add(f4);
		file.addSeparator();
		f5= new MenuItem("Quit");
		file.add(f5);
	}
	public static void main(String[] args)
	{
		new MenuDemo();
	}
}