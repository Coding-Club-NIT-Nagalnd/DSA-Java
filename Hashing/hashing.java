class HashTable {
    private int size;
    private List<List<Pair>> table;

    public HashTable(int size) {
        /**
         * Initialize a hash table with a fixed size.
         *
         * @param size The size of the hash table.
         */
        this.size = size;
        this.table = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            table.add(new ArrayList<>());
        }
    }

    private int hash(int key) {
        /**
         * Compute the hash value for a given key.
         *
         * @param key The key to hash.
         * @return The hash value (index in the table).
         */
        // pass
        return 0;
    }

    public void insert(int key, int value) {
        /**
         * Insert a key-value pair into the hash table.
         *
         * @param key The key to insert.
         * @param value The value associated with the key.
         */
        // pass
    }

    public Integer get(int key) {
        /**
         * Retrieve the value associated with a key.
         *
         * @param key The key to search for.
         * @return The value associated with the key, or null if the key is not found.
         */
        // pass
        return null;
    }

    public void delete(int key) {
        /**
         * Delete a key-value pair from the hash table.
         *
         * @param key The key to delete.
         */
        // pass
    }
}