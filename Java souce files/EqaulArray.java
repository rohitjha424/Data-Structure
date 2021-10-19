/*
3) Write a java program to check the equality of two arrays?
First Method : Using Iterative Method 
*/

import java.util.Arrays;
public class MainClass
{
    public static void main(String[] args)
    {    
        int[] arrayOne = {21, 57, 11, 37, 24};
        int[] arrayTwo = {21, 57, 11, 37, 24};
        boolean equalOrNot = true;
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }
        System.out.println("Input Arrays :");
        System.out.println("First Array : "+Arrays.toString(arrayOne));                         
         System.out.println("Second Array : "+Arrays.toString(arrayTwo));
        if (equalOrNot)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}

/*
Output :
Input Arrays :
First Array : [21, 57, 11, 37, 24]
Second Array : [21, 57, 11, 37, 24]
Two Arrays Are Equal
Second Method : Using Arrays.equals() MethodS

import java.util.Arrays;
public class MainClass
{
    public static void main(String[] args)
    {    
        int[] arrayOne = {21, 57, 11, 37, 24};
        int[] arrayTwo = {21, 57, 11, 37, 24}; 
        boolean equalOrNot = Arrays.equals(arrayOne, arrayTwo);
        System.out.println("Input Arrays :");
        System.out.println("First Array : "+Arrays.toString(arrayOne));
        System.out.println("Second Array : "+Arrays.toString(arrayTwo));
        if (equalOrNot)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}
Output :
Input Arrays :
First Array : [21, 57, 11, 37, 24]
Second Array : [21, 57, 11, 37, 24]
Two Arrays Are Equal
*/