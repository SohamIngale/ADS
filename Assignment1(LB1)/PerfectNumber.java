import java.util.*;

class PerfectNumber{
	public static boolean checkPerfect(int num){
		int sum = 1;
		for(int i =2 ; i <= num/2 ; i++){
			if(num%i==0){
				sum += i;
				}
			}
			return sum == num;
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		if (checkPerfect(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
			}
		}
	}