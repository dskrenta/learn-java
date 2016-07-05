public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }
   
   /**
    * Computes the max of the measures given
    * @param objects an array of Measurable objects
    * @return the max of the measures
    */
   public static double max(Measurable[] objects)
   {
	   double max = 0;
	   double count = 0;
	   for(Measurable obj : objects)
	   {
		   if(count == 0)
		   {
			   max = obj.getMeasure();
		   }
		   else if(obj.getMeasure() > max)
		   {
			   max = obj.getMeasure();
		   }
		   count++;
	   }
	   return max;
   }
}
