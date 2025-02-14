class Array {
    private int[] data;
    private int size;

    public Array(int size) {
        /**
         * Initialize an array with a fixed size.
         *
         * @param size The size of the array.
         */
        this.size = size;
        this.data = new int[size];
    }

    public int get(int index) {
        /**
         * Get the value at a specific index in the array.
         *
         * @param index The index to retrieve the value from.
         * @return The value at the specified index.
         */
        if(index>size){
            return -1;
        }
        return data[index];
        // pass
       // return 0;
    }

    public void set(int index, int value) {
        /**
         * Set a value at a specific index in the array.
         *
         * @param index The index where the value will be set.
         * @param value The value to be set at the specified index.
         */
        if(index>size){
            System.out.println("index out of bound");
        }else{
        data[index]=value;
        }
        // pass
    }

    public void insert(int index, int value) {
        /**
         * Insert a value at a specific index in the array.
         *
         * @param index The index where the value will be inserted.
         * @param value The value to be inserted.
         */
        // pass
    }

    public void delete(int index) {
        /**
         * Delete the value at a specific index in the array.
         *
         * @param index The index of the value to be deleted.
         */
        int k=size-1;
        int [] array=new int[k];
        for(int i=0;i<index;i++){
            array[i]=data[i];
        }
        for(int i=index;i<k;i++){
            array[i]=data[i+1];
        }
        // pass
    }

    public int search(int value) {
        /**
         * Search for a value in the array and return its index.
         *
         * @param value The value to search for.
         * @return The index of the value if found, otherwise -1.
         */
        for(int i=0;i<size;i++){
            if(data[i]==value) return i;
        }
        // pass
        return -1;
    }

    public int length() {
        /**
         * Get the number of elements in the array.
         *
         * @return The number of elements in the array.
         */
        // pass
        return size;
    }

    public boolean isEmpty() {
        /**
         * Check if the array is empty.
         *
         * @return True if the array is empty, False otherwise.
         */
        if(size==0) return true;
        // pass
        return false;
    }
}