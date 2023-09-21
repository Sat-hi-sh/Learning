import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {
        int n=5;
        Scanner sc = new Scanner(System.in);
         System.out.println("Here is your Solution.....To get answer to the questions . ");
        int choice;
        do{
           
            System.out.println("Enter the choice According to the Qn number(0-10).") ;
    
            System.out.println("To exit press \'0\' ") ;
    
            choice =sc.nextInt();

            switch(choice){
                case 1 :   
                          /*
                               0 0 0 0 0 
                               1 1 1 1 1
                               0 0 0 0 0 
                               1 1 1 1 1
                               0 0 0 0 0
                          */                          
                           qn1(n);
                           break;
                           
                case 2:  
                        /*
                            0 1 0 1 0
                            0 1 0 1 0
                            0 1 0 1 0
                            0 1 0 1 0
                            0 1 0 1 0
                        */
                           qn2(n);
                           break;
                case 3:
                                 /*
                                   1 2 3 4 5
                                   5 4 3 2 1 
                                   1 2 3 4 5
                                   5 4 3 2 1 
                                   1 2 3 4 5 
                                 */                
                           qn3(n);
                           break;
                case 4:
                           /*
                           5 5 5 5 5 
                           4 4 4 4 4
                           3 3 3 3 3
                           2 2 2 2 2
                           1 1 1 1 1
                        */
                           qn4(n);
                           break;
                case 5:
                        /*
                           1 2 1 2 1 
                           2 1 2 1 2
                           1 2 1 2 1 
                           2 1 2 1 2
                           1 2 1 2 1 
                        */                
                           qn5(n);
                           break;
                case 6:
                        /*
                           A A A A A 
                           B B B B B
                           C C C C C
                           D D D D D
                           E E E E E
                       */                
                           qn6(n);
                           break;
                case 7:
                       /*
                            A F K P U 
                            B G L Q V
                            C H M R W 
                            D I N S X
                            E J O T Y
                      */                
                           qn7(n);
                           break;
                case 8:    
                         /*
                            A B C D E 
                            B C D E F
                            C D E F G
                            D E F G H
                            E F G H I
                         */                
                           qn8(n);
                           break;
                case 9:
                         /*
                           1 2 3 4 5 
                           2 3 4 5 6
                           3 4 5 6 7
                           4 5 6 7 8
                           5 6 7 8 9
                        */               
                           qn9(n);

                           break;
                case 10:
                        /*
                          1 3 5 7 9 
                          3 5 7 9 11
                          5 7 9 11 13 
                          7 9 11 13 15 
                          9 11 13 15 17 
                        */                
                           qn10(n);
                           break;
                default:
                           System.out.println("You entered wrong choice . Try numbers >=10.");
            }
        System.out.println("Thankyou..");


        }while(choice !=0);
        sc.close();
       
    }

    private static void qn10(int n) {
         /*
            1 3 5 7 9 
            3 5 7 9 11
            5 7 9 11 13 
            7 9 11 13 15 
            9 11 13 15 17 

            or 
        for (int i = 0; i < n; i++) {
         int currentNum = i * 2 + 1;
           for (int j = 0; j < n; j++) {
            System.out.print(currentNum + " ");
            currentNum += 2;
           }
           System.out.println();
        }   
        */  
        int pos=0;
        for(int i=1;i<=n;i++)
        {   
            //using k for increment
            int k=0;
            
            for(int j=1;j<=n;j++){
                
                System.out.print((j+k+pos)+ " ");
                k+=1;
                  
            }
            //To Increase the position
            pos+=2;
            
            System.out.println("");
                
        }
    }

    private static void qn9(int n) {
           /*
            1 2 3 4 5 
            2 3 4 5 6
            3 4 5 6 7
            4 5 6 7 8
            5 6 7 8 9
           */ 
        
        for(int i=0;i<n;i++)
        {   
            //using k for increment
           int currentNo=i+1;
            
            for(int j=0;j<n;j++){
                
                System.out.print((currentNo)+ " ");
                currentNo++;

            }
            //To Increase the position
           
            
            System.out.println("");
                
        }
    }

    private static void qn8(int n) {
        /*
          A B C D E 
          B C D E F
          C D E F G
          D E F G H
          E F G H I
        */ 
        
        for(int i=0;i<n;i++)
        {   
            //using k for increment
            int currentChar=('A'+i);
            
            for(int j=0;j<n;j++){
                
                System.out.print((char)(currentChar)+ " ");
                currentChar++;
                  
            }
            //To Increase the position
          
            
            System.out.println("");
                
        }
    }

    private static void qn7(int n) {
         /*
         A F K P U 
         B G L Q V
         C H M R W 
         D I N S X
         E J O T Y
          */ 
        
        for(int i=0;i<n;i++)
        {   
            int letter =('A'+i);
            for(int j=0;j<n;j++){
                
                System.out.print((char)(letter)+ " ");
                letter+=n;    
            }
            System.out.println("");     
        }
    }

    private static void qn6(int n) {
        /*
      A A A A A 
      B B B B B
      C C C C C
      D D D D D
      E E E E E
     */  
        
        for(int i=0;i<n;i++)
        {   int letter='A'+i; 
            for(int j=0;j<n;j++){
                
                System.out.print((char)(letter)+ " ");
                
                
            }
            System.out.println("");
                
        }

    }

    private static void qn5(int n) {
        /*
          1 2 1 2 1 
          2 1 2 1 2
          1 2 1 2 1
          2 1 2 1 2
          1 2 1 2 1
          or for (int i = 0; i < n; i++) {
               int startValue = i % 2 == 0 ? 1 : 2;
        
               for (int j = 0; j < n; j++) {
                      System.out.print(startValue + " ");
                      startValue = (startValue == 1) ? 2 : 1;
                }
        */   
        for(int i=0;i<n;i++)
        {    
            for(int j=0;j<n;j++){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print("1"+ " ");
                    }
                    else{
                        System.out.print("2"+ " ");
                    }
                }
                else {
                    if(j%2==0){
                        System.out.print("2"+ " "); 
                    }
                    else{
                       System.out.print("1"+ " ");
                    }
                } 
            }
            System.out.println("");
        }
    
    }

    private static void qn4(int n) {
        /*
            5 5 5 5 5 
            4 4 4 4 4
            3 3 3 3 3
            2 2 2 2 2
            1 1 1 1 1
          */
        for(int i=0;i<n;i++)
        {    
            for(int j=0;j<n;j++){
                
                System.out.print((n-i)+ " ");
                
                
            }
            System.out.println("");
                
        }

    }

    private static void qn3(int n) {
        /*
         1 2 3 4 5
         5 4 3 2 1
         1 2 3 4 5
         5 4 3 2 1 
         1 2 3 4 5
        */ 
        for(int i=0;i<n;i++)
        {    
            for(int j=0;j<n;j++){
                if(i%2==0){
                      System.out.print(j+1+ " ");
                }
                else{
                    System.out.print((n-j )+ " ");
                }
                
            }
            System.out.println("");
                
        }
    }

    private static void qn2(int n) {
        /*0 1 0 1 0
          0 1 0 1 0 
          0 1 0 1 0
          0 1 0 1 0
          0 1 0 1 0
          */

        System.out.println("Qn2");
        for(int i=0;i<n;i++)
        {    
            for(int j=0;j<n;j++){
                if(j%2==0){
                      System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }
                
            }
            System.out.println("");
                
        }
    }

    private static void qn1(int n) {
         for(int i=0;i<n;i++)
        {    
            for(int j=0;j<n;j++){
                if(i%2==0){
                      System.out.print("0"+" ");
                }
                else{
                    System.out.print("1"+" ");
                }
                
            }
            System.out.println("");
                
        }
    }
}
