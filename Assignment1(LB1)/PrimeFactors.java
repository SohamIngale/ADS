import java.util.*;
public class PrimeFactors{


	static void printPrimeFactors(int num){
		
		if(num%2==0){
			System.out.println(2 + " " );
			num = num/2;
		}
		
		for(int i = 3 ; i<=Math.sqrt(num) ; i=i+2){
			while(num%i==0){
				System.out.print(i+ " ");
				num /= i;
				}
		}
			
		if(num>2){
			System.out.print(num);
		}
}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : " );
		int num = sc.nextInt();
		
		printPrimeFactors(num);
		
	}
}