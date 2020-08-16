import java.io.*;
import java.net.*;
public class server1
{
 public static void main(String args[]) throws IOException
 {
  ServerSocket s1=null;
  try
   {
     s1=new ServerSocket(98);
   }
  catch(IOException u1)
   { 
     System.err.println("could not found port 98");
     System.exit(1);
   } 
  Socket c=null;
  try
   {
    c=s1.accept();
    System.out.println("Connection from"+c);
   }
  catch(IOException e)
  {
    System.out.println("accept failed");
    System.exit(1);
  }
PrintWriter out=new PrintWriter(c.getOutputStream(),true);
String l;
BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
System.out.println("I am ready type now");
while((l=sin.readLine())!=null)
{
 out.println(l);
}
out.close();
sin.close();
c.close();
s1.close(); 
 }
}
