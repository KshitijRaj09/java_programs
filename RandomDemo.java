//program using Random Class.
import java.util.Random;
class RandomDemo extends Thread
{
	static int n;
	public void run(){
		Random rnd= new Random();
		n = rnd.nextInt(10);
		System.out.println("Generated Random Number: "+ n);
	}
	public static void main(String args[])throws InterruptedException {
		RandomDemo robj= new RandomDemo();
		robj.start();
		robj.join();
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"= "+n*i);
		}
	}
}