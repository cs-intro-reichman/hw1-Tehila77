// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	   int numberN =Integer.parseInt(args[0]);
	   int a= numberN/100;
	   int b=numberN/10%10;
	   int c=numberN%10;
       System.out.println(a +" "+ "hundreds ,"+ b +" "+" tens ,"+ c+" " +"ones.");
	}
}
