import java.util.*;
 
public class pancake {
 
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number of elements: ");
	   int n=sc.nextInt();
	   System.out.println("Enter the array elements: ");
	   int[] arr = new int[n];
	   for(int i=0;i<n;i++)
	   {
		  arr[i]=sc.nextInt();
	   }
      System.out.println("Unsorted: " + Arrays.toString(arr));
 
      pancakeSort(arr);
      System.out.println("Sorted  : " + Arrays.toString(arr));
   }
 
   public static void pancakeSort(int[] arr) {
      int max = 0;
      int index = 0;
      int length = arr.length;
 
      for (int i = 0; i < length-1; i++) {
         max = arr[0];
         index = 0;
         for (int j = 0; j < length - i; j++) {
            if (arr[j] > max) {
               max = arr[j];
               index = j;
            }
         }
         flip(arr, index, length - 1 - i);
      }
   }
 
   public static void flip(int[] arr, int i, int j) {
      while (i <= j) {
         int temp = arr[i];
         arr[i++] = arr[j];
         arr[j--] = temp;
      }
   }
 
}