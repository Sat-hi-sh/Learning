class SwipTwoNum
{
   public static void main(String[] args)
  {
   int a = 10;
   int b = 20;
   /*
   int temp;
   temp = a;
   a=b;
   a=temp;
  

   a=a+b;    // + and -, * and/ , ^ (XOR)
   b=a-b;  
   a=a-b;
   */

   a = a+b - (b=a);


   System.out.println(a);
   System.out.println(b);
   
  
  }

}