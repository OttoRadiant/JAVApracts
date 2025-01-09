

import java.util.*;
public class list
{
 public static void main(String[] args) {
 String[] strArray = {"Java", "ADBMS", "Data Structure", "Web Technology"};

 List<String> mylist = Arrays.asList(strArray);

 System.out.println("Immutable list:");
 for(String val : mylist){
 System.out.print(val + " ");
 }
 System.out.println("\n");
 List<String> arrayList = new ArrayList<>(Arrays.asList(strArray));
 System.out.println("New List:");
 arrayList.add("Cloud");
 //print the arraylist
 for(String val : arrayList){
 System.out.print(val + " ");
 }
 }
}