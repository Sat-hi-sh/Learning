import java.util.Scanner;

class ArmstrongNumber
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp = num;
		int check = num;
		int count = 0;
		
		while(num>0){
		num = num / 10;
		count++;
		}

		int base = 0;
		int sum = 0;

		while(temp > 0){
			
			base = temp % 10;
			int ans = 1;
			for(int i = 1; i <= count; i++){
				ans = ans * base;
			}

			sum = sum + ans;
			temp = temp/10;
		}

		System.out.println((check == sum)?"Armstrong Number":"Not a Armstrong Number");
	}
}
