// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	   int numberN =Integer.parseInt(args[0]);
	   int h= numberN/100;
	   int t=numberN/10%10;
	   int o=numberN%10;
       System.out.println(h+" hundreds, "+t+" tens, and "+ o+" ones.");
	}
}
