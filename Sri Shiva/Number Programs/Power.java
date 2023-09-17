import java.util.Scanner;

class Power
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Base : ");
		int base = sc.nextInt();
		System.out.print("Enter the Power : ");
		int pow = sc.nextInt();
		int sum = 1;
		for(int i = 1; i <= pow ; i++){
			
			sum = sum * base;
		}

		System.out.println(base + " power of " +pow+ " is : " +sum);
	}
}