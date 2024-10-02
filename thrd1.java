import java.io.*;
import java.util.*;

public class thrd1 implements Runnable {
	// method to start Thread
	public void run()
	{
		System.out.println("Thread is Running Successfully");
	}

	public static void main(String[] args)
	{
		thrd1 g1 = new thrd1();
		// initializing Thread Object
		Thread t1 = new Thread(g1);
		t1.start();
	}
}
