// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue=Integer.parseInt(args [0]);
		double  rate=Double.parseDouble(args [1]);
		double rate1=rate/100;
		System.out.println(rate1);
		int n=Integer.parseInt(args [2]);
	    double resultPow= (Math.pow(1+ rate1,n));
		System.out.println(resultPow);
		double futureValue= currentValue*resultPow;
		System.out.println(futureValue);
		System.out.println("After " + n +" years, " +currentValue+ "$ saved at "+rate +"% will yield " + futureValue);
	}
}