package three.view;

import javax.swing.JOptionPane;

public class StringView
{
	public void displayError()
	{
		int tempNumber;
		String tempString;
		
		JOptionPane.showMessageDialog(null,  "Let's crash the program!!!");
		tempString = JOptionPane.showInputDialog("Type in your favorite number!");
		tempNumber = Integer.parseInt(tempString);
		JOptionPane.showMessageDialog(null,  "Your favorite number is " + tempNumber);
	}


	public String sendParameterMethod()
	{
		//When using a variable in a method you must first assign it a value.
		String temp = null;
		
		JOptionPane.showMessageDialog(null, "Let's pass values!!");
		temp = JOptionPane.showInputDialog("Tpe in your favorite words");
		
		return temp;
	}

	public String getResponse()
	{
		String response = null;
		JOptionPane.showMessageDialog(null,"say something fun.");
		response = JOptionPane.showInputDialog("say the funny thing now!!!");
		return response;
	}
	
	public void ShowPassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null,  "You typed this: " + currentValue);
	}


	public void moreinteractive(String first, String second)
	{
		JOptionPane.showMessageDialog(null, "Hey " + first + "\n" + "says: " + "\n" + second);
	}
	
	public void testStringMethods()
	{
		String testString = "supercallifragilisticexpiladocious";
		JOptionPane.showMessageDialog(null, "The substring method test!");
		JOptionPane.showMessageDialog(null, "We are going to go from the 7th letter in the test string");
		JOptionPane.showMessageDialog(null, "The test string is: " + "\n" + testString);
		JOptionPane.showMessageDialog(null, "The testString.substring(7) call gives us: " +"\n"+ testString.substring(7));
	}
}
