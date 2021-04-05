import java.util.Scanner;

public class DescendingOrder {
   
   public static void readArray(int [] numbers, int numElements){   //Method to output the array. Takes in the array and the #elements.
      for(int i = 0; i < numElements; i++){
         System.out.print(numbers[i] + " ");  
      }
      System.out.println();               //Sends a new line ending this itteration
   }
   
   public static void swap(int [] numbers, int i, int j){         //Method to swap two values within an array
      int temp = numbers[i];
      numbers[i] = numbers[j];
      numbers[j] = temp;
   }
   
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
      for(int i = 0; i < numElements - 1; i++){
         int index = i;
         for(int j = i + 1; j < numElements; j++){
            if(numbers[j] > numbers[index]){          
               index = j;  
            }
         }
         swap(numbers, i, index);
         readArray(numbers, numElements);
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];
      input = scnr.nextInt();
      
      while(input != -1){
         numbers[i] = input;
         i++;
         numElements++;
         input = scnr.nextInt();
      }
      
      selectionSortDescendTrace(numbers, numElements);
   }
}
