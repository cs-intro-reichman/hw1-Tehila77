// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	 int lim=Integer.parseInt(args[0]);
	 System.out.println(lim);
	 int a= (int)(Math.random()*lim);
	 int b= (int)(Math.random()*lim);
	 int c= (int)(Math.random()*lim);
	System.out.println(a + " "+b + " "+c);
	 int cMin=Math.min(a,b);
	 int theMin=Math.min(cMin,c);
	 int cMax=Math.max(a,b);
	 int theMax=Math.max(cMax,c);
     System.out.println(theMax+" "+ theMin);

	}
}
