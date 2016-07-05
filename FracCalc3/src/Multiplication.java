public class Multiplication {
 
 private Fraction fraction1;
 private Fraction fraction2;
 private Fraction answer;
 
 // Constructor
 public Multiplication(Fraction fraction1, Fraction fraction2) {
  this.fraction1 = fraction1;
  this.fraction2 = fraction2;
  this.answer = new Fraction();
  Calculate();
 }
 
 // perform the calculation
 public void Calculate() 
 {
  answer.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
  answer.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
 }
 
 public String getAnswer()
 {
	 return this.answer.getNumerator() + "/" + this.answer.getNumerator();
 }
 
 public String getAnswer2()
 {
	 return this.answer.display();
 }
 
 // display the answer
 public void display() {
  Messages.displayAnswer("Multiplication", "*", fraction1, fraction2, answer);
 }

}