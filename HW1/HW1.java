public class HW1{
	public static void main (String[] args){
		initiateVariables();
		System.out.println(calculateExpression(1,2,3,4));
		System.out.println(compareSum(10,11));
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
}