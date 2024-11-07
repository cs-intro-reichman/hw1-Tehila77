// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		Double currentValue= Double.parseDouble(args [0]);
		Double rate= Double.parseDouble(args [1]);
		Double n= Double.parseDouble(args [2]);
		Double futureValue= currentValue* (Math.pow(1+rate,n)); 
		System.out.println("After " + n +" years, " +currentValue+ "$ saved at "+rate +"% will yield " + futureValue);
}
}
