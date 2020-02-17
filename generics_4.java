package Generics;
import java.util.*;
public class generics_4 
{
	public static void main(String[] args)
	{
      CustomList<Integer> int_list = new CustomList<Integer>();
      int_list.addElement(Integer.valueOf(1));
      int_list.addElement(Integer.valueOf(2));
      System.out.println("element at"+"="+int_list.get(1));
      System.out.println(int_list);
      
      CustomList<String> str_list = new CustomList<String>();
      str_list.addElement("abc");
      str_list.addElement("def");
      System.out.println("element at"+"="+str_list.get(1));
      System.out.println(str_list);
   }
}

class CustomList<T>
{
  ArrayList<T> arrlst = new ArrayList<>();
      
  public void addElement(T element)
  {
	  arrlst.add(element);
	  
  }
  public void remElement(T element)
  {
	  arrlst.remove(element);
  }
  public String toString()
  {
	  return arrlst.toString();
  }
  public T get(int index)
  {
	  return arrlst.get(index);
  }
  
  
}