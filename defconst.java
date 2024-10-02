public class defconst {  
  
int id;  
String name;  
  
defconst(){  
System.out.println("this a default constructor");  
}  
  
defconst(int i, String n){  
id = i;  
name = n;  
}  
  
public static void main(String[] args) {  
//object creation  
defconst s = new defconst();  
System.out.println("\nDefault Constructor values: \n");  
System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
  
System.out.println("\nParameterized Constructor values: \n");  
defconst student = new defconst(10, "David");  
System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
}  
}  