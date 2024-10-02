// Java Program to set specific
// string to progressbar
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class progress extends JFrame {

	// create a frame
	static JFrame f;

	static JProgressBar b;

	public static void main()
	{

		// create a frame
		f = new JFrame("ProgressBar demo");

		// create a panel
		JPanel p = new JPanel();

		// create a progressbar
		b = new JProgressBar();

		// set initial value
		b.setValue(0);

		b.setStringPainted(true);

		// add progressbar
		p.add(b);

		// add panel
		f.add(p);

		// set the size of the frame
		f.setSize(500, 500);
		f.setVisible(true);

		fill();
	}

	// function to increase progress
	public static void fill()
	{
		int i = 0;
		try {
			while (i <= 100) {
				// set text according to the level to which the bar is filled
				if (i > 30 && i < 70)
					b.setString("wait for sometime");
				else if (i > 70)
					b.setString("almost finished loading");
				else
					b.setString("loading started");

				// fill the menu bar
				b.setValue(i + 10);

				// delay the thread
				Thread.sleep(3000);
				i += 20;
			}
		}
		catch (Exception e) {
		}
	}
}
