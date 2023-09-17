import java.util.Scanner;

class PerfectNumber
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int sum =0;

		for(int i=1; i < num; i++){
			
			if(num %i == 0){
				sum = sum + i;
			}
		}

		System.out.println((num == sum)? "Perfect Number":"Not a Perfect Number");
	}
}
