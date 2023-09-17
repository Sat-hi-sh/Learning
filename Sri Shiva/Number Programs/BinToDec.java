import java.util.Scanner;

class BinToDec 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int ans = 0;
		int result = 0;
		int pow = 0;
		
		while(num > 0){
			
			ans = num % 10;

			int res = 1;
			int base = 2;

			for(int i = 1 ; i <= pow ; i++){
				
				res = res * base;
			}
			pow++;
			
			result = result + res * ans;

			num = num / 10;
		}

		System.out.println(result);
	}
}
