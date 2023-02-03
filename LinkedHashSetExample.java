package collections;

import java.util.*;  

public class LinkedHashSetExample   
{  
  public static void main(String argvs[])  
{  
   
LinkedHashSet<String> lhs = new LinkedHashSet<String>();  
  
lhs.add("Asir");  
lhs.add("was");  
lhs.add("Good");  
lhs.add("at");  
lhs.add("typing");  
  
System.out.println("The hash set is: " + lhs);  
   
System.out.println(lhs.remove("Good"));  
 
System.out.println("After removing the element, the hash set is: " + lhs);  
  
System.out.println(lhs.remove("at"));  
  
}  
}  