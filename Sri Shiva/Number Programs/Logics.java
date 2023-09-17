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

class PrimeNum{

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){

	System.out.print("Enter the Number : ");
	int num = sc.nextInt();
	String str = "Prime";
		for(int i=2; i<num ; i++){
			if(num % i == 0){
				str = "Not Prime";
				break;
			}
		}
		System.out.println(str);
	}
}

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

class Factorial
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i =num ; i >= 2; i--){
			fact = fact * i;
		}
		System.out.println(fact);
	}

}

class Fibonacci
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int n1=0;
		int n2 =1;
		System.out.print(n1 + " " + n2); 
		int sum = 0;
		for(int i=2; i<num; i++){
			sum = n1+n2;
			System.out.print( " " +sum);
			n1=n2;
			n2=sum;
		}
		System.out.println();

	}
}