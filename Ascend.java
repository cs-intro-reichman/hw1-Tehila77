// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	 int lim=Integer.parseInt(args[0]);
	 int a= (int)(Math.random()*lim);
	 int b= (int)(Math.random()*lim);
	 int c= (int)(Math.random()*lim);
	//find the min
	 int cMin=Math.min(a,b);
	 int theMin=Math.min(cMin,c);
	 //find the max
	 int cMax=Math.max(a,b);
	 int theMax= Math.max(c,cMax);
	 //find the medum
	 int medum= Math.max(Math.min(a, b),c);
     System.out.println(theMax+" "+medum+" "+theMin);
	 System.out.println(theMin+" "+medum+" "+theMax);
	}
}
