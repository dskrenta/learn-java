import java.util.Scanner;

public class E13_1 
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle: ");
		int width = in.nextInt();
		System.out.println("Enter the height of the rectangle: ");
		int height = in.nextInt();
		
		Rectangle rectangle = new Rectangle(width, height);
		int area = rectangle.getArea();
		System.out.println("Area: " + area);
	}
}
