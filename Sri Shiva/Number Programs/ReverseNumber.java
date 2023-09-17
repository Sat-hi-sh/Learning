import java.util.Scanner;

class ReverseNumber
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int rev = 0;

		while(num > 0){
			rev = rev * 10 + num % 10;
			num = num/10;
		}
		
		System.out.println(rev);
	}
}
