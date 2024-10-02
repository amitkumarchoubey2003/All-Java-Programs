import java.io.*;
import java.util.*;

public class thrd extends Thread {
	// initiated run method for Thread
	public void run()
	{
		System.out.println("Thread Started Running...");
	}
	public static void main(String[] args)
	{
		thrd g1 = new thrd();

		// Invoking Thread using start() method
		g1.start();
	}
}
