// Write a Java program using Map interface containing list of items having keys
// and associated values and perform the following operations:
// a. Add items in the map.
// b. Remove items from the map
// c. Search specific key from the map
// d. Get value of the specified key
// e. Insert map elements of one map in to other map.
// f. Print all keys and values of the map.



// a.Add items in the map.
import java.util.*;
// class MapInterface {
// public static void main(String args[])
// {
// // Default Initialization of a
// // Map
// Map<Integer, String> hm1 = new HashMap<>();
// // Initialization of a Map
// // using Generics
// Map<Integer, String> hm2
// = new HashMap<Integer, String>();
// // Inserting the Elements
// hm1.put(1, "Geeks");
// hm1.put(2, "For");
// hm1.put(3, "Geeks");
// hm2.put(new Integer(1), "Geeks");
// hm2.put(new Integer(2), "For");
// hm2.put(new Integer(3), "Geeks");
// System.out.println(hm1);
// System.out.println(hm2);
// }
// }




// b. Remove items from the map
// import java.util.*;
// public class MapInterface {
// public static void main(String args[])
// {
// // Initialization of a Map
// // using Generics
// Map<Integer, String> hm1
// = new HashMap<Integer, String>();
// // Inserting the Elements
// hm1.put(new Integer(1), "Geeks");
// hm1.put(new Integer(2), "Geeks");
// hm1.put(new Integer(3), "Geeks");
// System.out.println("Initial Map " + hm1);
// hm1.put(new Integer(2), "For");
// System.out.println("Updated Map " + hm1);
// }
// }




// c. Search specific key from the map
// import java.util.*;
// class MapInterface {
// public static void main(String args[])
// {
// // Initialization of a Map
// // using Generics
// Map<Integer, String> hm1
// = new HashMap<Integer, String>();
// // Inserting the Elements
// hm1.put(new Integer(1), "Geeks");
// hm1.put(new Integer(2), "For");
// hm1.put(new Integer(3), "Geeks");
// hm1.put(new Integer(4), "For");
// // Initial Map
// System.out.println(hm1);
// hm1.remove(new Integer(4));
// // Final Map
// System.out.println(hm1);
// }
// }



// d. Get value of the specified key
// import java.util.*;
// class MapInterface{
// public static void main(String args[])
// {
// // Initialization of a Map
// // using Generics
// Map<Integer, String> hm1
// = new HashMap<Integer, String>();
// // Inserting the Elements
// hm1.put(new Integer(1), "Geeks");
// hm1.put(new Integer(2), "For");
// hm1.put(new Integer(3), "Geeks");
// for (Map.Entry mapElement : hm1.entrySet()) {
// int key
// = (int)mapElement.getKey();
// // Finding the value
// String value
// = (String)mapElement.getValue();
// System.out.println(key + " : "
// + value);
// }
// }
// }




// e. Insert map elements of one map in to other map.
// f. Print all keys and values of the map.
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

    public static void main(String[] args) {

        // Creating two maps to demonstrate the operations
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        // Inserting elements into the first map
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");

        // Inserting elements into the second map
        map2.put(4, "Mango");
        map2.put(5, "Orange");

        // 1. Insert map elements of map2 into map1
        map1.putAll(map2);

        // 2. Print all keys and values of map1
        System.out.println("Keys and Values of map1 after inserting map2 elements:");
        printMap(map1);
    }

    // Method to print all keys and values of a map
    public static void printMap(Map<Integer, String> map) {
        // Get all keys in the map
        Set<Integer> keys = map.keySet();
        
        // Iterate through the keys and print the corresponding values
        for (Integer key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
