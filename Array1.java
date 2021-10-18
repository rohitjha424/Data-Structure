{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil\fcharset0 Calibri;}}
{\colortbl ;\red0\green0\blue255;}
{\*\generator Riched20 10.0.18362}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang9 /* \b\i Source\b0\i0  : {{\field{\*\fldinst{HYPERLINK https://javaconceptoftheday.com/java-array-interview-programs/ }}{\fldrslt{https://javaconceptoftheday.com/java-array-interview-programs/\ul0\cf0}}}}\f0\fs22     \par
\par
\b 1) Write a java program to find duplicate elements in an array?\b0\par
\b First Method : \i Using Brute Force Method                                                              \b0\i0 * /\par
public class MainClass \par
\{   \par
    public static void main(String[] args) \par
    \{\par
        String[] strArray = \{"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"\};\par
        for (int i = 0; i < strArray.length-1; i++)\par
        \{\par
            for (int j = i+1; j < strArray.length; j++)\par
            \{\par
                if( (strArray[i].equals(strArray[j])) && (i != j) )\par
                \{\par
                    System.out.println("Duplicate Element is : "+strArray[j]);\par
                \}\par
            \}\par
        \}\par
    \}    \par
\}\par
\b /* Output :\b0\par
Duplicate Element is : Java\par
Duplicate Element is : JSP      */\par
/*\par
\b Second Method : Using HashSet \par
\b0 import java.util.HashSet;\par
public class MainClass \par
\{   \par
    public static void main(String[] args) \par
    \{\par
        String[] strArray = \{"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"\};\par
        HashSet<String> set = new HashSet<String>();\par
        for (String arrayElement : strArray)\par
        \{\par
            if(!set.add(arrayElement))\par
            \{\par
                System.out.println("Duplicate Element is : "+arrayElement);\par
            \}\par
        \}\par
    \}    \par
\}\par
\b Output :\b0\par
Duplicate Element is : Java\par
Duplicate Element is : JSP\par
*/\par
\par
\par
}
