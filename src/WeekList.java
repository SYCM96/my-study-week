import java.util.ArrayList;
/**
* Lead Author(s):
* @author sycm; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2026-11-12
*/

/**
 * Purpose: The responsibility of WeekList is to manage a list of weekly assignments
 * and tracks the student's progress
 *
 * WeekList has-many Assignment objects
 */
public class WeekList
{
	private ArrayList<Assignment> assignments;
	
	/**
	 * 
	 * Purpose: creates an empty list to store weekly assignments
	 */
	public WeekList()
	{
		assignments = new ArrayList<Assignment>();
		
	}
	/**
	 * 
	 * Purpose: adds an assignments to the weekly list
	 * @param assignment
	 */
	public void addAssignment(Assignment assignment)
	{
		assignments.add(assignment);
	}
	/**
	 * 
	 * Purpose: returns the total number of assignments
	 * @return number of assignments
	 */
	public int getTotalAssignments()
	{
		return assignments.size();
	}
	/**
	 * 
	 * Purpose:  counts and returns completed assignments
	 * @return completed assignments
	 */
	public int getCompletedAssignments()
	{
		int count = 0;
		
		for (Assignment currentAssignment : assignments)
		{
			if (currentAssignment.isCompleted())
			{
				count++;
				
			}
		}
		return count;
	}
	/**
	 * 
	 * Purpose: calculates the percentage of completed assignments
	 * @return percentage of completed assignments
	 */
	public double getProgress()
	{
		if (getTotalAssignments() == 0)
		{
			return 0;
		}
		
		return getCompletedAssignments() * 100.0 / getTotalAssignments(); 
	}
}
