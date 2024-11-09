// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue=Integer.parseInt(args [0]);
		int  rate=Integer.parseInt(args [1]);
		double rate1=rate/100;
		int n=Integer.parseInt(args [2]);
		//
		double resultPow= (Math.pow(1+ rate1,n));
		double futureValue=currentValue*resultPow;
		System.out.println("After " + n +" years, " +currentValue+ "$ saved at "+rate +"% will yield " + futureValue);
	}
}