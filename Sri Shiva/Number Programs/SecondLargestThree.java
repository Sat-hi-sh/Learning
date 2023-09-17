import java.util.Scanner;

class SecondLargestThree
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.print("Enter the number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the number2 : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the number3 : ");
		int num3 = sc.nextInt();

		if(num1>num2 && num1>num3){
			// Num1 1st Largest
			if(num2>num3){
				System.out.println(num2+ " is 2nd Largest");
			}
			else{
				System.out.println(num3+ " is 2nd Largest");
			}
		}

		if(num2>num1 && num2>num3){
			// Num2 1st Largest
			if(num1>num3){
				System.out.println(num1+ " is 2nd Largest");
			}
			else{
				System.out.println(num3+ " is 2nd Largest");
			}
		}

		if(num3>num1 && num3>num2){
			// Num3 1st Largest
			if(num1>num2){
				System.out.println(num1+ " is 2nd Largest");
			}
			else{
				System.out.println(num2+ " is 2nd Largest");
			}
		}

	}
}
