import java.util.Scanner;

class Factors 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		for(int i=1; i < num; i++){
			
			if(num %i == 0){
				System.out.println("Factors of " +num+ " : " + i);
			}
		}
	}
}
