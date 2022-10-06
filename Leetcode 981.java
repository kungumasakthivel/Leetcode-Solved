class TimeMap {
    Map<String, String> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.put(key+timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        while(timestamp>0){
            if(map.containsKey(key+timestamp))
                return map.get(key+timestamp);
            timestamp--;
        }
        return "";
    }
}
