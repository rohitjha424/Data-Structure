/*
13) Write a java program to remove duplicate elements from an array?
*/
import java.util.Arrays; 
public class MainClass 
{   
    static void removeDuplicates(int[] arrayWithDuplicates)
    {
        System.out.println("Array With Duplicates : "+Arrays.toString(arrayWithDuplicates));
        //Assuming all elements in input array are unique
        int noOfUniqueElements = arrayWithDuplicates.length;
        //Comparing each element with all other elements
        for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                //If any two elements are found equal
                       if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
                {
                    //Replace duplicate element with last unique element
                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
                    //Decrementing noOfUniqueElements
                    noOfUniqueElements--;
                       //Decrementing j
                    j--;
                }
            }
        }
         //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
        //Printing arrayWithoutDuplicates
              System.out.println("Array Without Duplicates : "+Arrays.toString(arrayWithoutDuplicates));
        System.out.println("==============================");
    }
    public static void main(String[] args) 
    {        
        removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
           removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
           removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
    }    
}
/*
Output :
Array With Duplicates : [4, 3, 2, 4, 9, 2]
Array Without Duplicates : [4, 3, 2, 9]
==============================
Array With Duplicates : [1, 2, 1, 2, 1, 2]
Array Without Duplicates : [1, 2]
==============================
Array With Duplicates : [15, 21, 11, 21, 51, 21, 11]
Array Without Duplicates : [15, 21, 11, 51]
==============================
Array With Duplicates : [7, 3, 21, 7, 34, 18, 3, 21]
Array Without Duplicates : [7, 3, 21, 18, 34]
==============================
*/