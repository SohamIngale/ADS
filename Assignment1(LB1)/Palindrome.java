import java.util.*;

class Palindrome{

	public static boolean isPal(String str){
		str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		
		int left = 0;
		int right = str.length() - 1;
		
		while(left<right){
			if(str.charAt(left) != str.charAt(right)){
				return false;
				}
				left++;
				right--;
				}
				return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		System.out.println(isPal(input));
}}