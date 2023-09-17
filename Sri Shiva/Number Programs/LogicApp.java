import java.util.Scanner;

class LogicApp 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("1. Strong Number \n2. Armstrong Number \n3. Prime Number \n4. Xylem Number \n5. Perfect Number \n6. Factorial \n7. Fibonacci \n8. Exit");
		
		String[] s = {};

		boolean condition = true;

		do
		{
		
		System.out.print("Enter the Input : ");
		int input = sc.nextInt();
		
		if(input == 1){
			System.out.println("\t\t\t Welcome to Strong Number");
			StrongNumber.main(s);
			System.out.println("*******************************");
		}
		else if(input == 2){
			System.out.println("\t\t\t Welcome to Armstrong Number");
			ArmstrongNumber.main(s);
			System.out.println("*******************************");
		}
		else if(input == 3){
			System.out.println("\t\t\t Welcome to Prime Number");
			PrimeNum.main(s);
			System.out.println("*******************************");
		}
		else if(input == 4){
			System.out.println("\t\t\t Welcome to Xylem Number");
			Xylem.main(s);
			System.out.println("*******************************");
		}
		else if(input == 5){
			System.out.println("\t\t\t Welcome to Perfect Number");
			PerfectNumber.main(s);
			System.out.println("*******************************");
		}
		else if(input == 6){
			System.out.println("\t\t\t Welcome to Factorial");
			Factorial.main(s);
			System.out.println("*******************************");
		}
		else if(input == 7){
			System.out.println("\t\t\t Welcome to Fibonacci Number");
			Fibonacci.main(s);
			System.out.println("*******************************");
		}
		else {
			// Exit 
			condition = false;
		}

		}
		while (condition);

	}
}
