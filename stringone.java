class StringOne{

public static void main(String args[]){

String a = "15.20";
String b = "12345678";
String c = "15.invalid";

try{

Double.parseDouble(a);
System.out.println(a+ " is a valid number");

}catch(NumberFormatException e){
System.out.println(a+ " is an invalid number");
}

try{

Integer.parseInt(b);
System.out.println(b+ " is a valid number");

}catch(NumberFormatException e){
System.out.println(b+ " is an invalid number");
}

try{

Double.parseDouble(c);
System.out.println(c+ " is a valid number");

}catch(NumberFormatException e){
System.out.println(c+ " is an invalid number");
}

}
}