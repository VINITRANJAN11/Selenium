package New_Java;

public class ReverseMinus123test {
	
	int rem, sum=0,multi=-1;

	public int reversenums(int num) {
	   int fn = num*multi;
	  {
		while(fn>0) {
		rem = fn%10;
		sum = (sum*10)+rem;
		fn= fn/10;
	                 }
		int finalnum = multi*sum;
		System.out.println(finalnum);
		return finalnum; 	
	}
}
	public static void main(String[] args) 
	{
		ReverseMinus123test test = new ReverseMinus123test();
		test.reversenums(-12345);
	}

}
