class LRUCache {
    HashMap<Integer, Integer> cache;
    LinkedList<Integer> dll;
    int capacity;
    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        dll = new LinkedList<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            dll.remove(Integer.valueOf(key));
            dll.addLast(key);
        }
        return cache.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.put(key, value);
            dll.remove(Integer.valueOf(key));
            dll.addLast(key);
            return;
        }
        if(cache.size() >= capacity){
            int k = dll.getFirst();
            dll.remove(Integer.valueOf(k));
            cache.remove(k);
            System.out.println("removing " + k);
        }
        dll.addLast(key);
        cache.put(key, value);
    }
}
