import java.util.Scanner;

class DecToBin 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int rem = 0;

		while(num>0){
			rem = num % 2;
			System.out.print(rem);
			num = num / 2;
		}
	}
}
