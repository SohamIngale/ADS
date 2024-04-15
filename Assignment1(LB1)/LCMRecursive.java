public class LCMRecursive{
	public static int gcd(int a, int b){
		if(b==0)
			return a;
		return gcd(b, a%b);
		}
		
		public static int lcm(int a, int b){
			return Math.abs(a * b)/gcd(a,b);
			}
			
			
		public static void main(String args[]){
			int num1 = 12;
			int num2 = 18;
			
			int lcmResult = lcm(num1, num2);
			
			System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);
		}
	}