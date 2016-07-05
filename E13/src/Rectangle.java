
public class Rectangle 
{
	private int width;
	private int height;
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public int getArea()
	{
		if(this.width <= 0)
		{
			return 0;
		}
		else if(this.width == 1)
		{
			return 1 * this.height;
		}
		else
		{
			Rectangle smallerRectangle = new Rectangle(this.width - 1, height);
			int smallerArea = smallerRectangle.getArea();
			return smallerArea + this.width;
		}
	}
}
