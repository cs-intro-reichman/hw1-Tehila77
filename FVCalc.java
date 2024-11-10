// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue=Integer.parseInt(args [0]);
		//System.out.println(currentValue);
		double  rate=Double.parseDouble(args [1]);
		//System.out.println(rate);
		double rate1=rate/100;
		//System.out.println(rate1);
		int n=Integer.parseInt(args [2]);
	    double resultPow= (Math.pow(1+ rate1,n));
		double futureValue= (currentValue*resultPow);
		int theFutureValue=((int)futureValue);
		System.out.println("After " + n +" years, a $" +currentValue+ " saved at "+rate +"% will yield $" +theFutureValue);
	}
}