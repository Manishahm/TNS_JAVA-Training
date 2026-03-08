package org.tnsif.acc.c2tc.collections;

import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// Create a HashMap with Integer keys and Integer values
        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. Adding key-value pairs
        map.put(1, 100);  // Key: 1, Value: 100
        map.put(2, 200);  // Key: 2, Value: 200
        map.put(3, 300);  // Key: 3, Value: 300
        map.put(4, 400);  // Key: 4, Value: 400

        // 2. Display the map
        System.out.println("Initial Map: " + map);

        // 3. Retrieving a value by key
        int valueForKey1 = map.get(1);
        System.out.println("Value for key '1': " + valueForKey1);

        // 4. Updating a value (replacing the existing value)
        map.put(2, 250);  // Updating value for key 2
        System.out.println("Map after updating value for key '2': " + map);

        // 5. Removing an entry by key
        map.remove(3);  // Removing the entry with key 3
        System.out.println("Map after removing key '3': " + map);

        // 6. Checking if a key exists
        boolean hasKey1 = map.containsKey(1);
        System.out.println("Map contains key '1': " + hasKey1);

        // 7. Checking if a value exists
        boolean hasValue400 = map.containsValue(400);
        System.out.println("Map contains value 400: " + hasValue400);

        // 8. Iterating over keys and values
        System.out.println("Iterating over keys and values:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 9. Getting the size of the map
        int size = map.size();
        System.out.println("Size of the map: " + size);
        
       

        // 10. Clearing all entries in the map
        map.clear();
        System.out.println("Map after clearing: " + map);
        
	}

}