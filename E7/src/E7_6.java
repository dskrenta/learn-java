
public class E7_6 {
	public static void main(String[] args)
	   {
	      double[] data = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
	      DataSet util = new DataSet();
	      double total = util.alternatingSum(data);
	      System.out.println("Expected sum:  -2");
	      System.out.println("Alternating sum: " + total);
	   }
}
