import java.awt.Rectangle;

public class E2_2 {	
	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(100, 100, 50, 50);
		System.out.println(box);

		//box.translate(100,100);
		box.grow(100,100);
		box.translate(100,100);
		System.out.println(box);
		
	}
}
