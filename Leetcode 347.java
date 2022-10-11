class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap();
        List<Integer> rev = new ArrayList();
        
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        for(int n:map.keySet()){
            if(bucket[map.get(n)] == null){
                bucket[map.get(n)] = new LinkedList<>();
            }
            bucket[map.get(n)].add(n);
        }
        
        for(int i = bucket.length-1; i>=0 && rev.size()<k; i--){
            if(bucket[i]!=null)
                rev.addAll(bucket[i]);
        }
        return rev.stream().mapToInt(i->i).toArray();
    }
}