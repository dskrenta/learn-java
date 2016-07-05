public class globals 
{
   public static String globalValue = "";
   
   public globals()
   {
	   // constructors
   }
   
   public void setGlobal(String toBeGlobal)
   {
	   this.globalValue = toBeGlobal;
   }
   
   public String getGlobal()
   {
	   return this.globalValue;
   }
}