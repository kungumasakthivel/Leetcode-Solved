class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int curr=0;
        int max=0;
        HashSet<Character>set=new HashSet<>();
        while(curr<s.length()){
            if(!(set.contains(s.charAt(curr)))){
                set.add(s.charAt(curr));
                curr++;
                max=Math.max(max, set.size());
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}