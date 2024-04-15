import java.util.*;

class PrimeCheck{
	public static boolean isPrime(int num, int i){
		if(num<2)
			return false;
		
		if(num==2)
			return true;
			
		if(num%i==0)
			return false;
		
		
		if(i*i<=num)
			return isPrime(num, i+1);
			
		else
			return true;
		
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		System.out.println(num + " is : " + isPrime(num,2));
		}
}
		