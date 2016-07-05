
public class Quiz implements Measurable 
{	
	private double gradePercentage;
	private String gradeLetter;
	
	public Quiz(double gradePercentage, String gradeLetter)
	{
		this.gradePercentage = gradePercentage;
		this.gradeLetter = gradeLetter;
	}
	
	public String getText()
	{
		return this.gradeLetter;
	}
	
	public double getMeasure() 
	{
		return this.gradePercentage;
	}
}
