
public class Person implements Measurable 
{
	private String name;
	private double height;
	
	public Person(double height, String name)
	{
		this.name = name;
		this.height = height;
	}
	
	public String getText()
	{
		return this.name;
	}
	
	public double getMeasure() 
	{
		return this.height;
	}
}
