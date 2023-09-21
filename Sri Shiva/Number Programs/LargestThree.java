public class LargestThree{
public static void main(String[] args){
int a = 40; int b= 70; int c = 30;
/*
if (a>b && a>c){
	System.out.println("A is Greater");
}
else if (b>a && b>c){
	System.out.println("B is Greater");
}
else{
	System.out.println("C is Greater");
}


 int lar = a>b? a:b;
  lar = lar>c? lar : c;
*/
int lar = 0;
lar =  lar > (a>b?a:b)?lar:(a>b?a:b);

int largestofThree=(a>b) ? ((a>c) ? a:c) : (b>c) ? (b:c);
	
System.out.println(lar);

}
}
