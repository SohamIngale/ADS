import java.util.*;

class Automorphic{
	public static boolean checkAM(int n){
		int square = n*n;
		while(n > 0){
			if(n%10 != square%10)
				return false;
			
			n /= 10;
			square /= 10;
			}
			return true;
		}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(checkAM(num)){
			System.out.println(num + " is an automorphic number.");
			}
			else{
			System.out.println(num + " is an not automorphic number.");
			}
	}
}