import java.lang.String;

public class BryceFinal 
{
	public static void main(String[] args)
	{
		String str = "Hello I'm your String";
		String[] splited = str.split(" ");
		
		for(int i = 0; i < splited.length; i++)
		{
			System.out.println(splited[i].length());
		}
	}
}
