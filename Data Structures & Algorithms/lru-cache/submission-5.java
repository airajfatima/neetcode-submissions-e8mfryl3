class Node {
    int key;
    int value;
    Node next;
    Node prev;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
class LRUCache {

    private int capacity;
    private HashMap<Integer, Node> cache;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
    }

    public void remove(Node n){
        if(n.prev == null){
            head = head.next;
            if (head != null) head.prev = null;
        }else{
            n.prev.next = n.next;
        }
        if(n.next == null){
            tail = tail.prev;
            if (tail != null) tail.next = null;
        }else{
            n.next.prev = n.prev;
        }
    }
    public void insert(Node n){
        if(head == null){
            head = tail = n;
        }else{
            tail.next = n;
            n.prev = tail;
            n.next = null;
            tail = n;
        }
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node n = cache.get(key);
            remove(n);
            insert(n);
            return n.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node n = cache.get(key);
            n.value = value;
            remove(n);
            insert(n);
            return;
        }
        if(cache.size() >= capacity){
            cache.remove(head.key);
            remove(head);
        }
        Node n = new Node(key, value);
        insert(n);
        cache.put(key, n);
    }
}
