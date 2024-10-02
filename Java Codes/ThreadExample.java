import java.io.*;
import java.util.*;

public class ThreadExample extends Thread
 {
   public void run ()
   {
      for (int i = 1; i <= 100; i++) 
      {
         System.out.println(“Thread: ” + i);
      }
   }
public static void main(String[] args)
  {

   ThreadExample t1=new ThreadExample();
   t1.start(); 
    }

}