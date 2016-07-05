import java.util.Scanner;

public class E7_10
{
   public static void main(String[] args)
   {
      Sequence firstSequence = new Sequence(5);
      Sequence secondSequence = new Sequence(5);
      Sequence thirdSequence = new Sequence(5);

      firstSequence.set(0, 1);
      firstSequence.set(1, 3);
      firstSequence.set(2, 5);
      firstSequence.set(3, 7);
      firstSequence.set(4, 9);

      secondSequence.set(0, 1);
      secondSequence.set(1, 4);
      secondSequence.set(2, 5);
      secondSequence.set(3, 8);
      secondSequence.set(4, 9);

      thirdSequence.set(0, 1);
      thirdSequence.set(1, 3);
      thirdSequence.set(2, 5);
      thirdSequence.set(3, 7);
      thirdSequence.set(4, 9);

      System.out.print("First equals second: ");
      if (firstSequence.equals(secondSequence))
      {
         System.out.println("true");
      }
      else
      {
         System.out.println("false");
      }
      System.out.println("Expected: false");

      System.out.print("First equals third: ");
      if (firstSequence.equals(thirdSequence))
      {
         System.out.println("true");
      }
      else
      {
         System.out.println("false");
      }
      System.out.println("Expected: true");
   }
}