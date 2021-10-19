/*
4) Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number?
*/
import java.util.Arrays;
public class MainClass
{
    static void findThePairs(int inputArray[], int inputNumber)
    {
        System.out.println("Input Array : "+Arrays.toString(inputArray));
        System.out.println("Input Number : "+inputNumber);
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                }
            }
        }
        System.out.println("======================================");
    }
    public static void main(String[] args)
    {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
        findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
        findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
    }
}
/*
Output :

Input Array : [4, 6, 5, -10, 8, 5, 20]
Input Number : 10
Pairs of elements whose sum is 10 are :
4 + 6 = 10
5 + 5 = 10
-10 + 20 = 10
======================================
Input Array : [4, -5, 9, 11, 25, 13, 12, 8]
Input Number : 20
Pairs of elements whose sum is 20 are :
-5 + 25 = 20
9 + 11 = 20
12 + 8 = 20
======================================
Input Array : [12, 13, 40, 15, 8, 10, -15]
Input Number : 25
Pairs of elements whose sum is 25 are :
12 + 13 = 25
40 + -15 = 25
15 + 10 = 25
======================================
Input Array : [12, 23, 125, 41, -75, 38, 27, 11]
Input Number : 50
Pairs of elements whose sum is 50 are :
12 + 38 = 50
23 + 27 = 50
125 + -75 = 50
======================================

*/