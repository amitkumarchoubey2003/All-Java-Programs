interface Printable{  
void print();  
}  
interface Showable{  
void print();  
}    
class intfa implements Printable, Showable{  
public void print()
{
System.out.println("Hello");
}  
public static void main(String args[])
{  
intfa obj = new intfa();  
obj.print();  
 }  
}  

