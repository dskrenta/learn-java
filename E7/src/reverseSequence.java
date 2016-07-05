public class reverseSequence 
{
	public reverseSequence()
	{
		// Constructor
	}
	
	public double[] changeOrder(double[] data)
	{
		/*
		 * // All elements in reverse order
        System.out.print("Reverse order: ");
        for(int i = list.length - 1; i >= 0; i--)
        {
        	System.out.print(list[i] + " ");
        }
        System.out.print("\n");
		 */		
		//		double[] data = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };

		for(int i = 0; i < data.length / 2; i++)
		{
		    int temp = (int) data[i];
		    data[i] = data[data.length - i - 1];
		    data[data.length - i - 1] = temp;
		}
		return data;
	}
}
