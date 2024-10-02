import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTwoNumbersApplet extends Applet implements ActionListener {
    TextField num1Field, num2Field;
    Label resultLabel;

    public void init() {
        // Create text fields for user input
        num1Field = new TextField(10);
        num2Field = new TextField(10);

        // Create a button for triggering the addition
        Button addButton = new Button("Add");

        // Create a label for displaying the result
        resultLabel = new Label("Result:");

        // Add action listener to the button
        addButton.addActionListener(this);

        // Add components to the applet
        add(new Label("Enter Number 1:"));
        add(num1Field);
        add(new Label("Enter Number 2:"));
        add(num2Field);
        add(addButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Get the numbers from the text fields
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            // Calculate the sum
            double sum = num1 + num2;

            // Display the result
            resultLabel.setText("Result: " + sum);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter valid numbers.");
        }
    }
}

