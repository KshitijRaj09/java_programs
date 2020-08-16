class InvalidStringException extends Exception{  
 InvalidStringException(String s){  
  super(s);  
 }  
}  
class TestCustomException1{
    static void validate(String str)throws InvalidStringException{
     if(str.length()<3){
		 System.out.println("Invalid String: "+str);		 
      throw new InvalidStringException("not valid");
	 }
     else
      System.out.println("Accepted String: "+str);
   }
   
   public static void main(String args[]){
      try{
      validate("Hello");
	  validate("Hi");
      }catch(Exception m)
	  {System.out.println("Exception occured: "+m);}
  }
}
