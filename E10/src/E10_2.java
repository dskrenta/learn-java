public class E10_2 
{
	public static void main(String[] args)
	{
		boolean done = false;
		int count = 0;
		int size = 3;
		
		Measurable[] quizzes = new Measurable[size];
		
		quizzes[0] = new Quiz(80, "B");
		quizzes[1] = new Quiz(90, "A");
		quizzes[2] = new Quiz(70, "C");
		
		double averageQuiz = Data.average(quizzes);
		double maxQuiz = Data.max(quizzes);
		String maxQuizLetter = null;
		
		for(int i = 0; i < quizzes.length; i++)
		{
			if(quizzes[i].getMeasure() == maxQuiz)
			{
				maxQuizLetter = quizzes[i].getText();
			}
		}
		
		System.out.println("Average Quiz: " + averageQuiz);
		System.out.println("Max Quiz: " + maxQuiz + " " + maxQuizLetter);
	}
}
