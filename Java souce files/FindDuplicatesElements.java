/* Source : https://javaconceptoftheday.com/java-array-interview-programs/    

1) Write a java program to find duplicate elements in an array?
First Method : Using Brute Force Method                                                              
*/


public class MainClass 
{   
    public static void main(String[] args) 
    {
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
        for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
    }    
}

/* Output :
Duplicate Element is : Java
Duplicate Element is : JSP      */


/*
Second Method : Using HashSet 
import java.util.HashSet;
public class MainClass 
{   
    public static void main(String[] args) 
    {
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
        HashSet<String> set = new HashSet<String>();
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
    }    
}
Output :
Duplicate Element is : Java
Duplicate Element is : JSP
*/

