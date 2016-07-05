package schoolWork;


import java.util.ArrayList;

public class ArrayListTester
{

	public static void main(String[] args)
	{
		ListHelper helper = new ListHelper();
		ArrayList<String> strArray = new ArrayList<String>();
		strArray = getStrArray();
		int result = helper.countOddLength(strArray);
		System.out.println("The number of odd length strings is: " + result);
		
		char first = "o".charAt(0);
		helper.removeStrings(strArray, first);
		System.out.println("Removed list: " + strArray.toString());
		
		
		int integerCount = helper.numCount(getIntegers(), 1);
		System.out.println("Number of ones in array: " + integerCount);
	}

	
	public static ArrayList<Integer> getIntegers() {
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(12);
		integers.add(5);
		integers.add(3);
		integers.add(1);
		
		System.out.println("Integer Array: " + integers.toString());
		
		return integers;
	}

	public static ArrayList<String> getStrArray()
	{
		ArrayList<String> strArray = new ArrayList<String>();	
		strArray.add("odd");
		strArray.add("odder");
		strArray.add("even");
		strArray.add("oddalso");
		strArray.add("a");
		strArray.add("");
		
		System.out.println("String Array: " + strArray.toString());
		return(strArray);
	}

}