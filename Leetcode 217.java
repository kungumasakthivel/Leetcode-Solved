class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int idx=0;idx<nums.length;idx++)
        {
            if(map.contains(nums[idx]))
                return true;
            map.add(nums[idx]);
        }
        return false;
    }
}