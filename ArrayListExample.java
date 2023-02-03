package collections;
import java.util.*;  
public class ArrayListExample{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();
  list.add("Asir");   
  list.add("Rishi");    
  list.add("Kamal");    
  list.add("Kamal");     
  Iterator itr=list.iterator();
  while(itr.hasNext())
  {
   System.out.println(itr.next());
  }  
 }  
}  

//In arraylist duplicate values will not be neglected it will also be added s