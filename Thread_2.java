class De extends Thread
{
	public void run()
	{
		Thread t= Thread.currentThread();
		System.out.println("Priority of Thread: "+t.getName()+"  "+t.getPriority());
		System.out.println("Thread-0 sleep for 5 seconds");
		try{  
				Thread.sleep(500); 
		}catch(Exception e){System.out.println(e);}  
		for(int i=10;i<=14;i++){
			 	System.out.println(t.getName()+" "+i);  
		}
	}
}
class Def extends Thread 
{ 
	public void run()
	{ 
 	 	Thread t = Thread.currentThread();
		System.out.println(t.getName()+" Priority: "+ t.getPriority());
 	 	for(int i = 1;i<=5;i++)
			System.out.println(t.getName() + " " + i); 
 	} 
} 
class Thread_2
{
	public static void main(String args[])throws InterruptedException
	{
		De obj=new De() ;
		Def obj1= new Def();
		obj.setPriority(Thread.MAX_PRIORITY);
		obj.start();
		obj1.start();
	}	
}