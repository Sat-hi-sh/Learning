import java.util.Scanner;

class AddFirstLastNum
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		int last = num % 10;

		while(num>9){
			
			num = num / 10;
		}

		int total = num + last;
		System.out.println(total);
	}
}
