public class OddEvenNum{
public static void main(String[] args){

int num = 12345;
int Even_count = 0;
int Odd_count = 0;
int sum = 0;


while(num>0){

	sum = num % 10;

	if(sum %2 == 0){
	Even_count++;
	}
	else{
	Odd_count++;
	}
        
	num = num/10;
}
System.out.println("Even_Count = " + Even_count + "  Odd_Count = " + Odd_count);

}

}