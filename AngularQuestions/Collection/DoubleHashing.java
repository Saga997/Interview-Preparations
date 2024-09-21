package com.collection.illustration.AngularQuestions.Collection;

class DoubleHashingHashMap {
    private int[] keys;
    private String[] values;
    private int capacity;
    private int size;
    private static final int EMPTY_KEY = -1;

    public DoubleHashingHashMap(int capacity) {
        this.capacity = capacity;
        this.keys = new int[capacity];
        this.values = new String[capacity];
        this.size = 0;

        // Initialize all slots to indicate they are empty
        for (int i = 0; i < capacity; i++) {
            keys[i] = EMPTY_KEY;
        }
    }

    // Primary hash function (hash1)
    private int hash1(int key) {
        return key % capacity;
    }

    // Secondary hash function (hash2) (must return a value > 0)
    private int hash2(int key) {
        return 7 - (key % 7); // The constant 7 is chosen to be a prime number smaller than capacity
    }

    // Method to insert a key-value pair
    public void put(int key, String value) {
        if (size == capacity) {
            System.out.println("Hashmap is full");
            return;
        }

        int index = hash1(key);
        int stepSize = hash2(key);

        // Probe until an empty slot is found
        while (keys[index] != EMPTY_KEY && keys[index] != key) {
            index = (index + stepSize) % capacity; // Double hashing probe
        }

        // Insert the key-value pair
        keys[index] = key;
        values[index] = value;
        size++;
    }

    // Method to get the value associated with a key
    public String get(int key) {
        int index = hash1(key);
        int stepSize = hash2(key);

        // Probe to find the key
        while (keys[index] != EMPTY_KEY) {
            if (keys[index] == key) {
                return values[index]; // Key found
            }
            index = (index + stepSize) % capacity; // Probe using double hashing
        }

        return null; // Key not found
    }

    // Method to remove a key-value pair
    public void remove(int key) {
        int index = hash1(key);
        int stepSize = hash2(key);

        // Probe to find the key
        while (keys[index] != EMPTY_KEY) {
            if (keys[index] == key) {
                keys[index] = EMPTY_KEY;  // Mark the slot as empty
                values[index] = null;
                size--;
                return;
            }
            index = (index + stepSize) % capacity;
        }
    }
}


public class DoubleHashing {
    public static void main(String[] args) {
        DoubleHashingHashMap map = new DoubleHashingHashMap(10);

        map.put(5, "A");
        map.put(15, "B");
        map.put(25, "C");
        map.put(35, "D");

        System.out.println("Value for key 5: " + map.get(5));   // Outputs "A"
        System.out.println("Value for key 15: " + map.get(15)); // Outputs "B"
        System.out.println("Value for key 25: " + map.get(25)); // Outputs "C"

        map.remove(25);
        System.out.println("Value for key 25 after removal: " + map.get(25)); // Outputs null
    }
}
