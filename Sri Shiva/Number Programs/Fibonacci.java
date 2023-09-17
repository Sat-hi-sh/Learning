import java.util.Scanner;

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