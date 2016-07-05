import java.awt.Rectangle;

public class E2_1 {	
	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(1, 10 , 20, 40);
		double h1 = box.getHeight();
		double w1 = box.getWidth();
		
		double area = w1*h1;
		
		System.out.println("Area:" + area);
		
		//System.out.println("Height" + h1 + "\n" + "Width" + w1);
	}
}
