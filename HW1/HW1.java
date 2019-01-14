public class HW1{
	public static void main (String[] args){
		initiateVariables();
		System.out.println(calculateExpression(1,2,3,4));
		System.out.println(compareSum(10,11));
		checkPositiveOrNegative(0);
		System.out.println(checkNegativeNumber(-78941));
		printHelloName("Sergei");
		checkLeapYear(4000);
	}
	
	static void initiateVariables(){
		byte bt = 120;
		short st = 32700;
		int it = 45000;
		long lng = 900000L;
		float fl = 5689.7f;
		double dbl = 468.45489;
		boolean bl = true;
		char ch = 'r';
		String str = "First homework";
	}
	
	static int calculateExpression(int a, int b, int c, int d){
		return a * (b + (c / d));
	}
	
	static boolean compareSum(int a, int b){
		int sum = a + b;
		if ((sum>=10) && (sum<=20)){
			return true;
		} else {
			return false;
		}
	}
	
	static void checkPositiveOrNegative(int a){
		if (a>=0){
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}
	
	static boolean checkNegativeNumber(int a){
		return (a<0);
	}
	
	static void printHelloName(String name){
		System.out.println ("Hello, " + name + "!");
	}
	
	static void checkLeapYear(int year){
		
		if (year%4 == 0) {
			if ((year%100 == 0)&&(year%400 == 0)){
				System.out.println ("Leap year");
			} else if ((year%100 == 0)&&(year%400 != 0)){
				System.out.println ("Not leap year");
			} else {
				System.out.println ("Leap year");
			}
		} else {
			System.out.println ("Not leap year");
		}
		
	}
}