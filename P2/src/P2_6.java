public class P2_6 {
	public static void main(String[] args)
	   {
	      Day day1 = new Day(2014, 2, 28); // February 15, 2010
	      Day dayLater1 = day1.addDays(1);
	      Day day2 = new Day(2015, 2, 28);
	      Day dayLater2 = day2.addDays(1);
	      Day day3 = new Day(2016, 2, 28);
	      Day dayLater3 = day3.addDays(1);
	      
	      System.out.println("Expected: 2014-03-01");
	      System.out.println(dayLater1);
	      System.out.println("Expected: 2015-03-01");
	      System.out.println(dayLater2);
	      System.out.println("Expected: 2016-03-29");
	      System.out.println(dayLater3);
	   }
}
