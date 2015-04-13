
public class Calculator {
	public static double getSum(double first, double second) {
		return (first + second);
	}
	
	public static double getSum(double [] num) {
		double sum = 0.0;
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	
	public static double getAverage(double first, double second, double third) {
		return (first + second + third)/3;
	}
	
	public static double getAverage(double [] num) {
		double sum = 0.0;
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		return sum/num.length;
	}
	
	public static double getProduct(double first, double second) {
		return (first*second);
	}
	
	public static double getProduct(double [] num) {
		double sum = 1.0;
		for(int i=0; i<num.length; i++) {
			sum*=num[i];
		}
		return sum;
	}
	
	public static double getFactorial (int first) {
		int result = 1;
		for(int i=1; i<=first; i++) {
			result *=i;
		}
		return result;
	}
	
}
