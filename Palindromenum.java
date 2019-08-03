package vinhh;

public class Palindromenum {
	
	public void checkpalindrome(int num) {
		 
			  int r,sum=0,temp;  
			  
			  temp=num;    
			  while(num>0){    
			   r=num%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   num=num/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("is palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			} 
	
	public static void main(String[] args) {
		Palindromenum plm = new Palindromenum();
		plm.checkpalindrome(121);
			}  
	

	}


