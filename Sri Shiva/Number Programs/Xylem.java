import java.util.Scanner;

class Xylem
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		int last = num % 10;
		num = num/10;
		int sum = 0;
		int ans = 0;

		while(num>9){
			ans = num % 10;
			sum = sum + ans;
			num = num / 10;
		}

		int total = num + last;
		System.out.println((total==sum)? "Xylem" : "Peloem");
	}
}
