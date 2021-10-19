/*
10) Write a java program to convert an array to ArrayList and an ArrayList to array?
*/
Array To ArrayList :
import java.util.ArrayList;
import java.util.Arrays;
public class MainClass 
{      
    public static void main(String[] args) 
    {    
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
        System.out.println(list);
    }    
}
ArrayList To Array :
import java.util.ArrayList;
public class MainClass 
{      
    public static void main(String[] args) 
    {    
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAVA");
        list.add("JSP");
        list.add("ANDROID");
        list.add("STRUTS");
        list.add("HADOOP");
        list.add("JSF");
        String[] array = new String[list.size()]; 
        list.toArray(array);
              for (String string : array)
        {
            System.out.println(string);
        }
    }    
}