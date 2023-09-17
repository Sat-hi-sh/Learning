import java.util.Scanner;

class CountNumDigit
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int count = 0;
		while(num>0){
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}
}