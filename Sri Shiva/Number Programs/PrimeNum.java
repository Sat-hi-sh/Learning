import java.util.Scanner;

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