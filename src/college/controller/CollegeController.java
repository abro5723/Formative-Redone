package college.controller;

import college.view.CollegeDisplay;

public class CollegeController 
{
	private CollegeDisplay popupDisplay;
	private String studentGrade;
	private String studentMajor;	

	public CollegeController()
	{
		popupDisplay = new CollegeDisplay();
	}
	
	/**
	 * This method starts the program with my CollegeDisplay's help
	 */
	public void start()
	{
		String studentInput = popupDisplay.grabAnswer("");
		studentGrade = Character.toString(studentInput.charAt(1));
		studentMajor = Character.toString(studentInput.charAt(0));

		showStudentGrade();
		showStudentMajor();
		popupDisplay.showResponse("Your current major is " + studentMajor + " and you're a " + studentGrade + " congratulations on being in college!");
		
	}
		
	/**
	 * This method will determine the students grade level based on the student's input
	 */
	private void showStudentGrade()
	{
		if(studentGrade.equals("1"))
		{
			studentGrade = "Freshman(Too fresh)";
		}
		else if(studentGrade.equals("2"))
		{
			studentGrade = "Sophomore(kinda young man)";
		}
		else if(studentGrade.equals("3"))	
		{
			studentGrade = "Junoir(almost old man)";
		}
		else if(studentGrade.equals("4"))
		{
			studentGrade = "Senior(old man)";
		} 
		else
		{
			studentGrade = "Excuse me, but your year is: error, error, error. System failure.... You've destroyed me... Blegh";
		}
	}
	
	/**
	 * This method will determine the students Major for college
	 */
	private void showStudentMajor()
	{
		if(studentMajor.equals("C"))
		{
			studentMajor = "Computer Science";
		}
		else if(studentMajor.equals("I"))
		{
			studentMajor = "Information Technology";
		}
		else if(studentMajor.equals("M"))
		{
			studentMajor = "Mathematics";
		}
		else
		{
			studentMajor = "Sorry, but you are INVALID FOOL!";
		}
	}
}
