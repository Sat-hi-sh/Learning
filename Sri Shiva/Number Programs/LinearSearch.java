import java.util.Arrays;
import java.util.Scanner;
//Linear Search
class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array :"); 
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements :"); 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered  elements :"); 
        System.out.println(Arrays.toString(arr));
        System.out.println("ENter the Target :"); 
        int target=sc.nextInt();
        LinearSearch(arr,target);
        int Found=LinearSearch1(arr,target);
        System.out.println("Element Found at "+Found);
        System.out.println("ENter the Target element :"); 
        int target1=sc.nextInt();
        System.out.println("ENter the Start index :"); 
        int start=sc.nextInt();
        System.out.println("ENter the End :"); 
        int end=sc.nextInt();
        int Answer=LinearSearch2(arr,target1,start,end);
        System.out.println("Target Found at :" +Answer); 
        sc.close();


    }

    private static void LinearSearch(int[] arr, int target) {
        for(int i:arr){
            if(i==target){
                        System.out.println("Element Found"); 
            }
        }
    }
    private static int LinearSearch1(int[] arr, int target) {
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
            
        }
        return -1;
    }
    private static int LinearSearch2(int[] arr, int target,int start,int end) {
       
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
            
        }
        return -1;
    }
}
