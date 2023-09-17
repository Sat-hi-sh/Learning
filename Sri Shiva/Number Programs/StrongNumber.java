import java.util.Scanner;

class StrongNumber
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp = num;
		int fact = 0;
		int sum = 0;
		
		while(num>0){
			fact = num % 10;
			int ans = 1;
			for(int i = fact ; i >= 2 ;  i--){
				ans = ans * i;
			}

			sum = sum + ans;
			num = num/10;
		}

		System.out.println((temp == sum)? "Strong Number":"Not a Strong Number");
	}
}