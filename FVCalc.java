// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue= Double.parseDouble(args [0]);
		double rate= Double.parseDouble(args [1]);
		double rate1=rate/100;
		double n=Double.parseDouble(args [2]);
		//
		double resultPow= (Math.pow(1+ rate1,n);
		int futureValue= currentValue * resultPow;
		System.out.println("After " + n +" years, " +currentValue+ "$ saved at "+rate +"% will yield " + futureValue);
	}
}