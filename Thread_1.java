//Write a program to create two different threads, each printing set of different numbers.
class Def extends Thread 
{ 
	public void run()
	{ 
 	 	Thread t = Thread.currentThread();
		t.setName("Thread-1");
		System.out.println(t.getName()+" Priority: "+ t.getPriority());
 	 	for(int i = 1;i<=5;i++)
			System.out.println(t.getName() + " " + i); 
 	} 
} 
class Xyz extends Thread 
{ 
	public void run()
	{ 
 	 	Thread t = Thread.currentThread();
		t.setName("Thread-2");
		System.out.println(t.getName()+" Priority: "+ t.getPriority());
 	 	for(int i = 6;i<=10;i++) 
		 	System.out.println(t.getName() + " " + i); 
 	} 
} 
class Thread_1 
{ 
 	public static void main(String args[]){ 
 	Def obj = new Def(); 
	Xyz obj1= new Xyz();
	obj.setPriority(1);  
    obj1.setPriority(Thread.MAX_PRIORITY);  
 	obj.start(); 
 	obj1.start(); 
	
 	} 
} 
 	 