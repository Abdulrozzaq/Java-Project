package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1, num2, result;
		char operators;
		boolean validInput = true;
		
		//error handling 
		try {
		
		System.out.println("Enter your first number: ");
		num1 = scanner.nextDouble();
		
		
		System.out.println("Enter your operator (+, -, *, /): ");
		
		operators = scanner.next().charAt(0);
		
		
		System.out.println("Enter your second number : ");
		num2 = scanner.nextDouble();
		
		
		if(operators == '+') {
			result = num1 + num2;
		} else  if(operators == '-'){
			result = num1-num2;
		}else if (operators=='*') {
			result =num1*num2;
		}else if (operators == '/'){
			if (num2 !=0) {
				
				result =num1/num2;
			
			}else {
				throw new IllegalArgumentException ("Error division by zero not allow");
			}
		}
		else {
			validInput=false;
			throw new ArithmeticException ("Invalid operator please use (+, -, *, /) ");
		}
	
		if (validInput) {
			
			System.out.println("The result of " + num1 + " " + operators + " " + num2 + " is: " + result);
		}
		
		
		}catch  (Exception e){
			
			System.out.println("An error occur :  " +  e.getMessage());
		}
		
		finally {
			scanner.close();
		}
		

	}

}
