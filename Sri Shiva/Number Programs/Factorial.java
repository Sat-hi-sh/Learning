import java.util.Scanner;

class Factorial
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i =num ; i >= 2; i--){
			fact = fact * i;
		}
		System.out.println(fact);
	}

}