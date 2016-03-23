package college.view;

import javax.swing.JOptionPane;

public class CollegeDisplay 
{
	/*
	 * This method shows the codes response to input
	 * (Based off of my Popup tester)
	 */
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	/*
	 *This method gets the students input
	 *(Based off of my Popup tester)
	 */
	public String grabAnswer(String studentInput)
	{
		studentInput = JOptionPane.showInputDialog(null, studentInput);
		return studentInput;
	}
}
