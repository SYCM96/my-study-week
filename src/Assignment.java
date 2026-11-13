/**
* Lead Author(s):Sandra Camacho
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
 * Purpose: The responsibility of Assignment is Store information about one assignment and its completion status
 *
 * Assignment is-a class representing a study class
 * Assignment has a name, course, task type and completion status
 */
public class Assignment
{
	// Instance variables
	private String assignmentName;
	private String course;
	private String taskType;
	private boolean completed;
	
	/**
	 * 
	 * Purpose: constructor - creates new assignment and initializes its information 
	 * @param assignmentName 
	 * @param course
	 * @param taskType
	 */
	public Assignment (String assignmentName, String course, String taskType)
	{
		this.assignmentName = assignmentName;
		this.course = course;
		this.taskType = taskType;
		this.completed = false;
	}
	/**
	 * 
	 * Purpose:  return assignment's name
	 * @return assignment 
	 */
	public String getAssignmentName()
	{
		return assignmentName;
	}
	/**
	 * 
	 * Purpose: return the course associated with the assignment
	 * @return course
	 */
	public String getCourse()
	{
		return course;
	}
	/**
	 * 
	 * Purpose: return the task type
	 * @return tasktype
	 */
	public String getTaskType()
	{
		return taskType;
	}
	/**
	 * 
	 * Purpose: returns true if completed otherwise false
	 * @return boolean 
	 */
	public boolean isCompleted()
	{
		return completed;
	}
	/**
	 * 
	 * Purpose: updates the assigment's completion status
	 * @param completed - true if assignment is finished, otherwise false
	 */
	public void setCompleted(boolean completed)
	{
		this.completed = completed;
	}
	
}
