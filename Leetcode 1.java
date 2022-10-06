class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer x =map.get(target - nums[i]);
            if(x != null){
                return new int[]{x, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{1, 1};
    }
}