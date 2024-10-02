class thrd2 extends Thread
{    
 public void run()
{    
  for(int i=1;i<5;i++)
{   
  // the thread will sleep for the 500 milli seconds   
    try
  {
     Thread.sleep(5000);
     }
   catch(InterruptedException e)
     {
        System.out.println(e);
         }    
    System.out.println(i);    
  }    
 }    
 public static void main(String args[]){    
  thrd2 t1=new thrd2();    
  thrd2 t2=new thrd2();    
     
  t1.start();    
  t2.start();    
 }    
}    