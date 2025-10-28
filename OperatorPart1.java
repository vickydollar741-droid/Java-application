public class OperatorPart1{
	public static void main(String[] argrs){
		//assingment operators are used to assign variable eg equal sign "="
		
		//compund assingment operators shorthand way to update variables eg below
		int num = 50;
		num += 8;
		System.out.println(num);
		
		num -= 7;
		System.out.println(num);
		
		num *= 10;
		System.out.println(num);
		
		num /= 5;
		System.out.println(num);
		
		num %= 3;
		System.out.println(num);
		
		
		// aritimetic operators
		
		int num1 = 10;
		int num2 = 4;
		int sum = num1 + num2;
		int product = num1 * num2;
		int minus = num1 - num2;
		double divide = num1/num2;
		String name = "matthew";
		System.out.printf("the sum of %d and %d is %d is ur real age my de %s %n",num1,num2,sum,name);
		System.out.printf("the product of %d and %d is %d %n",num1,num2,product);
		System.out.printf("the product of %d and %d is %d %n",num1,num2,minus);
		
	}
}