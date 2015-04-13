public class TestCalculator {
	public static void main (String[] args) {
		System.out.println(Calculator.getSum(5, 5));
		double [] num = new double [3];
		num[0]=1;
		num[1]=2.5;
		num[2]=3;
		System.out.println(Calculator.getSum(num));
		
		System.out.println(Calculator.getAverage(5, 10, 15));
		double [] num1 = new double [3];
		num1[0]=10;
		num1[1]=5;
		num1[2]=10;
		System.out.println(Calculator.getAverage(num1));
		
		System.out.println(Calculator.getProduct(5, 5));
		double [] num2 = new double [3];
		num2[0]=5;
		num2[1]=5;
		num2[2]=4;
		System.out.println(Calculator.getProduct(num2));
		
		System.out.println(Calculator.getFactorial(4));
		
		
	}

}
