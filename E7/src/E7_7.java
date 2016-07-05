

public class E7_7 
{
	public static void main(String[] args)
	{
		//reverseSequence test = new reverseSequence();
		int[] data = {1, 4, 9, 16, 9, 7, 4, 9, 11};
		
		System.out.println(reverseArray(data));
		
		//System.out.println(test.changeOrder(data));
		//reverse(data);
		//System.out.println(data);
		
		
	}
	
	public static int[] reverseArray(int[] data)
    {
        int[] reversedData = new int[data.length];
        for(int i=0; i < data.length; i++)
        {
            reversedData[i] = data[(data.length - i -1)];
        }
        return reversedData;
    }
	
	public static void reverse(int[] a)
	{
	    int l = a.length;
	    for (int j = 0; j < l / 2; j++)
	    {
	        int temp = a[j];
	        a[j] = a[l - j - 1];
	        a[l - j - 1] = temp;
	    }
	}
	
	private static double[] changeOrder(double[] data) {
		for(int i = 0; i < data.length / 2; i++)
		{
		    int temp = (int) data[i];
		    data[i] = data[data.length - i - 1];
		    data[data.length - i - 1] = temp;
		}
		return data;
	}
}
