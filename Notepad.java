import java.awt.*;
class Notepad extends Frame
{
	MenuBar mb;
	Menu file,edit,format,view,help;
	MenuItem f1,f2,f3,f4,f5,f6,f7;
	MenuItem e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11;
	MenuItem fm1,fm2;
	MenuItem v1;
	MenuItem h1,h2;
	TextArea ta;
	Notepad()
	{
		setVisible(true);
		setSize(600,600);
		setTitle("Untitled - Notepad");
		mb= new MenuBar();
		setMenuBar(mb);
		file= new Menu("File");
		mb.add(file);
		f1= new MenuItem("New          Ctrl+N");
		file.add(f1);
		f2= new MenuItem("Open...      Ctrl+O");
		file.add(f2);
		f3= new MenuItem("Save         Ctrl+S");
		file.add(f3);
		f4= new MenuItem("Save As");
		file.add(f4);
		file.addSeparator();
		f5= new MenuItem("Page Setup");
		file.add(f5);
		f6= new MenuItem("Print...     Ctrl+P");
		file.add(f6);
		file.addSeparator();
		f7= new MenuItem("Exit");
		file.add(f7);
		
		edit= new Menu("Edit"); //Edit Menu
		mb.add(edit);
		e1= new MenuItem("Undo          Ctrl+Z");
		edit.add(e1);
		e2= new MenuItem("Cut           Ctrl+X");
		edit.add(e2);
		e3= new MenuItem("Copy          Ctrl+C");
		edit.add(e3);
		e4= new MenuItem("Paste         Ctrl+V");
		edit.add(e4);
		e5= new MenuItem("Delete           Del");
		edit.add(e5);
		edit.addSeparator();
		e6= new MenuItem("Find...       Ctrl+F");
		edit.add(e6);
		e7= new MenuItem("Find Next         F3");
		edit.add(e7);
		e8= new MenuItem("Replace...     Ctrl+H");
		edit.add(e8);
		e9= new MenuItem("Go To...        Ctrl+G");
		edit.add(e9);
		edit.addSeparator();
		e10= new MenuItem("Select All      Ctrl+A");
		edit.add(e10);
		e11= new MenuItem("Time/Date         F5");
		edit.add(e11);
		
		format= new Menu("Format"); //Format Menu
		mb.add(format);
		fm1= new MenuItem("Word Wrap     ");
		format.add(fm1);
		fm2= new MenuItem("Font...       ");
		format.add(fm2);
		
		view= new Menu("View"); //View Menu
		mb.add(view);
		v1= new MenuItem("Status Bar    ");
		view.add(v1);
		
		help= new Menu("Help"); //Help
		mb.add(help);
		h1= new MenuItem("View Help    ");
		help.add(h1);
		help.addSeparator();
		h2= new MenuItem("About Notepad   ");
		help.add(h2);
		
		ta= new TextArea(); //TextArea
		ta.setBounds(0,0,560,560);
		add(ta);
		
	}
	public static void main(String[] args)
	{
		new Notepad();
	}
}