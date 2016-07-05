package schoolWork;

import java.util.ArrayList;

public class ListHelper 
{
	public ListHelper()
	{
		// Constructor 
	}
	
	public int countOddLength(ArrayList<String> rayList)
	{
		int odd = 0;
		for(int i = 0; i < rayList.size(); i++)
		{	
			if(rayList.get(i).length() % 2 != 0)
			{
				odd++;
			}
		}
		return odd;
	}
	
	public void removeStrings(ArrayList<String> rayList, char firstLetter)
	{
		String stringValueOf = String.valueOf(firstLetter);
		for(int i = rayList.size(); --i >= 0;)
		{
			String test = rayList.get(i);
			
			if(test.startsWith(stringValueOf))
			{
				rayList.remove(i);
			}
		}
	}
	
	public int numCount(ArrayList<Integer> rayList, int num)
	{
		int count = 0;
		for(int i = 0; i < rayList.size(); i++)
		{
			if(rayList.get(i) == num)
			{
				count++;
			}
		}
		return count;
	}
}
