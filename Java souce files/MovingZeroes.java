/*
7) Write a java program to separate zeros from non-zeros in an integer array?
(i)Moving Zeros To End Of An Array :
*/

import java.util.Arrays;
 public class MainClass
{
    static void moveZerosToEnd(int inputArray[])
    {
        System.out.println("Input Array : "+Arrays.toString(inputArray));
                 //Initializing counter to 0
          int counter = 0;
        //Traversing inputArray from left to right
          for (int i = 0; i < inputArray.length; i++)
        {
            //If inputArray[i] is non-zero
              if(inputArray[i] != 0)
            {
                //Assigning inputArray[i] to inputArray[counter]
                  inputArray[counter] = inputArray[i];
                  //Incrementing the counter by 1
                  counter++;
            }
        }
          //Assigning zero to remaining elements
          while (counter < inputArray.length)
        {
            inputArray[counter] = 0;
              counter++;
        }
          System.out.println("Input Array After moving zeros to end :");           
           System.out.println(Arrays.toString(inputArray));
        System.out.println("======================================");
    }
      public static void main(String[] args)
    {
        moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});
          moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});
          moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});
          moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }
}
/*
Output :
Input Array : [12, 0, 7, 0, 8, 0, 3]
Input Array After moving zeros to end :
[12, 7, 8, 3, 0, 0, 0]
======================================
Input Array : [1, -5, 0, 0, 8, 0, 1]
Input Array After moving zeros to end :
[1, -5, 8, 1, 0, 0, 0]
======================================
Input Array : [0, 1, 0, 1, -5, 0, 4]
Input Array After moving zeros to end :
[1, 1, -5, 4, 0, 0, 0]
======================================
Input Array : [-4, 1, 0, 0, 2, 21, 4]
Input Array After moving zeros to end :
[-4, 1, 2, 21, 4, 0, 0]
======================================

(ii)Moving Zeros To The Front Of An Array :

import java.util.Arrays;
 public class MainClass
{
    static void moveZerosToFront(int inputArray[])
    {
        System.out.println("Input Array :"+Arrays.toString(inputArray));
        //Initializing counter to position of last element
          int counter = inputArray.length-1;
          //Traversing the inputArray from right to left
          for (int i = inputArray.length-1; i >= 0; i--)
        {
            //If inputArray[i] is non-zero
              if(inputArray[i] != 0)
            {
                //Assigning inputArray[i] to inputArray[counter]
                  inputArray[counter] = inputArray[i];
                  //Decrementing the counter by 1
                  counter--;
            }
        }
          //Assigning 0 to remaining elements
          while (counter >= 0)
        {
            inputArray[counter] = 0;
              counter--;
        }
          System.out.println("Input Array After Moving Zeros To The Front :");
        System.out.println(Arrays.toString(inputArray));
        System.out.println("====================================");
    }
      public static void main(String[] args)
    {
        moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});
          moveZerosToFront(new int[] {1, -5, 0, 0, 8, 0, 1});
          moveZerosToFront(new int[] {0, 1, 0, 1, -5, 0, 4});
        moveZerosToFront(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }
}
Output :

Input Array :[12, 0, 7, 0, 8, 0, 3]
Input Array After Moving Zeros To The Front :
[0, 0, 0, 12, 7, 8, 3]
====================================
Input Array :[1, -5, 0, 0, 8, 0, 1]
Input Array After Moving Zeros To The Front :
[0, 0, 0, 1, -5, 8, 1]
====================================
Input Array :[0, 1, 0, 1, -5, 0, 4]
Input Array After Moving Zeros To The Front :
[0, 0, 0, 1, 1, -5, 4]
====================================
Input Array :[-4, 1, 0, 0, 2, 21, 4]
Input Array After Moving Zeros To The Front :
[0, 0, -4, 1, 2, 21, 4]
====================================
*/