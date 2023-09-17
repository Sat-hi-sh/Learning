import java.util.Scanner;

class SumOfDigits
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0;

		while(num>0){
			sum = sum + num %10;
			num = num / 10;
		}
		System.out.println("Sum of given digits : " +sum);
	}
}
