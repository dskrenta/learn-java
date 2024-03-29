

	import java.util.Arrays;

	/**
	   This class computes the alternating sum
	   of a set of data values.
	*/
	public class DataSet
	{
	   private double[] data;
	   private int dataSize;

	   /**
	      Constructs an empty data set.
	   */
	   public DataSet()
	   {
	      final int DATA_LENGTH = 100;
	      data = new double[DATA_LENGTH];
	      dataSize = 0;
	   }

	   /**
	      Adds a data value to the data set.
	      @param x a data value
	   */
	   public void add(double x)
	   {
	      if (dataSize == data.length)
	         data = Arrays.copyOf(data, 2 * data.length);
	      data[dataSize] = x;
	      dataSize++;
	   }

	   /**
	      Gets the alternating sum of the added data.
	      @return sum the sum of the alternating data or 0 if no data has been added
	   */
	   public double alternatingSum(double[] data)
	   {
		   int i = 0;
	      double alternatingSum = 0; 
		  for(double num : data)
		  {
			if(i%2==1) 
				alternatingSum -= num;
			if(i%2==0)
				alternatingSum += num;
		  i++;
		  }
		  return alternatingSum; 
	   }
	}


