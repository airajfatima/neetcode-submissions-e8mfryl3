class TimeMap {
    HashMap<String, String> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        StringBuilder s = new StringBuilder(key);
        s.append(timestamp);
        hm.put(s.toString(), value);
    }
    
    public String get(String key, int timestamp) {
        StringBuilder s = new StringBuilder(key);
        s.append(timestamp);
        for(int i = timestamp; i >= 1; i--){
            if(hm.containsKey(s.toString())) return hm.get(s.toString());
            s.setLength(key.length());
            s.append(i - 1);
        }
        return "";
    }
}
