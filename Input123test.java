package New_Java;

public class Input123test {
	
	int rem, sum=0;
	
	public int reversenum(int num) 
	{
		while(num>0) {
		rem = num%10;
		sum = (sum*10)+rem;
		num= num/10;
	                 }
		System.out.println(sum);
		return sum; 	
	}

    
	public static void main(String[] args) {
		Input123test test = new Input123test();
		test.reversenum(123);
	}

}
