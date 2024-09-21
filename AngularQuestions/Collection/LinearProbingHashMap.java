package com.collection.illustration.AngularQuestions.Collection;

class LinearProbingHashMap {
    private int[] keys;
    private String[] values;
    private int capacity;
    private int size;

    public LinearProbingHashMap(int capacity) {
        this.capacity = capacity;
        this.keys = new int[capacity];
        this.values = new String[capacity];
        this.size = 0;
    }

    // Simple hash function
    private int hash(int key) {
        return key % capacity;
    }

    public void put(int key, String value) {
        int index = hash(key);

        // Linear probing
        while (keys[index] != 0 && keys[index] != key) {
            index = (index + 1) % capacity; // Wrap around if necessary
        }

        // Insert key-value pair
        keys[index] = key;
        values[index] = value;
        size++;
    }

    public String get(int key) {
        int index = hash(key);

        // Linear probing to find the key
        while (keys[index] != 0) {
            if (keys[index] == key) {
                return values[index];
            }
            index = (index + 1) % capacity;
        }
        return null; // Key not found
    }

    public void remove(int key) {
        int index = hash(key);

        // Linear probing to find the key
        while (keys[index] != 0) {
            if (keys[index] == key) {
                // Mark the slot as deleted (use a sentinel value or handle carefully)
                keys[index] = 0; // Handle carefully to avoid search chain break
                values[index] = null;
                size--;
                return;
            }
            index = (index + 1) % capacity;
        }
    }
}

