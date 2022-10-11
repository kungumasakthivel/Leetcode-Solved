class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(int i=0;i<=s.length()-10;i++){
            String temp = s.substring(i, i+10);
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }
        for(String str:map.keySet())
            if(map.get(str)>1)
                ans.add(str);
        return ans;
    }
}
