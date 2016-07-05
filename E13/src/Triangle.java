public class Triangle 
{
	private double width;
	private double height;
	
	public Triangle(double width)
	{
		this.width = width;
		this.height = width;
	}
	
	public double getArea()
	{
		if (width <= 0) 
		{ 
			return 0; 
		}
		else if (width == 1) 
		{ 
			return 1; 
		}
		else
		{
			Triangle smallerTriangle = new Triangle(width - 1);
			double smallerArea = smallerTriangle.getArea();
			return smallerArea + width;
		}
	}
}
