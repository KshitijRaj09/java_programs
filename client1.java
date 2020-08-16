import java.io.*;
import java.net.*;

public class client1
{
 public static void main(String args[]) throws IOException
 {
  Socket s=null;
  Socket s1=null;
  BufferedReader b=null;
  BufferedReader b1=null;
  try
   {
     s=new Socket(InetAddress.getLocalHost(),98);
	 s1=new Socket(InetAddress.getLocalHost(),99);
     b=new BufferedReader(new InputStreamReader(s.getInputStream()));
	 b1=new BufferedReader(new InputStreamReader(s1.getInputStream()));
   }
  catch(UnknownHostException u)
   { 
     System.err.println("I dont know host");
     System.exit(0);
   } 

String inp;
while((inp=b.readLine())!=null)
{
 System.out.println(inp);
}
while((inp=b1.readLine())!=null)
{
 System.out.println(inp);
}
b.close();
b1.close();
s.close(); 
s1.close(); 
 }
}
