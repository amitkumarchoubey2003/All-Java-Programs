import java.util.*;

class trying
{


public static void main(String args[])
  {
 Scanner in=new Scanner(System.in);
  int a,b,d,c=0;
  
    try
       {
 System.out.println("enter the three numbers");
       a=in.nextInt();
       b=in.nextInt();

        
         c=a/b;
d=in.nextInt();
        System.out.println("the result is="+c);
     
          }
   catch(Exception e)
    {


     System.out.println("we cannot divide the number with zero"+e);
    }
 finally
   {

   System.out.println("we are in the finally block");

    }


    }









}