class MyHashMap {
    int[] array;
    public MyHashMap() {
        array = new int[10000001];
        Arrays.fill(array, -1);
    }
    
    public void put(int key, int value) {
        array[key] = value;
    }
    
    public int get(int key) {
        return array[key];
    }
    
    public void remove(int key) {
        array[key] = -1;
    }
}