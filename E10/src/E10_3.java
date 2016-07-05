public class E10_3 
{
	public static void main(String[] args)
	{
		int size = 3;
	
		Measurable[] persons = new Measurable[size];
	
		persons[0] = new Person(165, "John");
		persons[1] = new Person(182, "Bob");
		persons[2] = new Person(176, "Phil");
	
		double averagePersonHeight = Data.average(persons);
		double maxPersonHeight = Data.max(persons);
		String maxPersonName = null;
		
		for(int i = 0; i < persons.length; i++)
		{
			if(persons[i].getMeasure() == maxPersonHeight)
			{
				maxPersonName = persons[i].getText();
			}
		}
		
		System.out.println("Average Person Height: " + averagePersonHeight);
		System.out.println("Max Person Height: " + maxPersonHeight + " " + maxPersonName);
	}
}
