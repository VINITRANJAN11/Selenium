package New_Java;

public class Reverse120 {
	
	int rem, sum=0;

	public int reversenums(int num) 
	  {
		while(num>0) {
		rem = num%10;
		sum = (sum*10)+rem;
		num= num/10;
	                 }
		System.out.println(sum);
		return sum; 	
	                 }
	public static void main(String[] args) 
	{
		Input123test test = new Input123test();
		test.reversenum(120);

	}

}
