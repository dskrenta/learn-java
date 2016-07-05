import java.util.Random;

public class E7_1 
{
	public static void main(String[] args)
	{
		Random generator = new Random(); //open the random generator
		//int randomNum = generator.nextInt(100) + 1;
		
        int[] list = new int[10];
        
        for(int i = 0; i < list.length; i++)
        {
        	list[i] = generator.nextInt(100) + 1;
        }
        
        // Array printout
        System.out.print("Initial array: ");
        for(int num : list)
        {
        	System.out.print(num + " ");
        }
        System.out.print("\n");

        
        // Every element at an even index
        System.out.print("Every even index: ");
        for(int i = 0; i < list.length; i++)
        {
        	if(i % 2 == 0)
        	{
        		System.out.print(list[i] + " ");
        	}
        }
        System.out.print("\n");
        
        // Every even element
        System.out.print("Every even element: ");
        for(int i = 0; i < list.length; i++)
        {
        	if(list[i] % 2 == 0)
        	{
        		System.out.print(list[i] + " ");
        	}
        }
        System.out.print("\n");
        
        // All elements in reverse order
        System.out.print("Reverse order: ");
        for(int i = list.length - 1; i >= 0; i--)
        {
        	System.out.print(list[i] + " ");
        }
        System.out.print("\n");
        
        // Only the first and last element
        System.out.print("First and last element: " + list[0] + " " + list[list.length - 1] + "\n");
        
        /*
        for(int i = 0; i < list.length; i++)
        {
        	System.out.println(list[i]);
        }
        */
	}
}
