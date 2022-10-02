class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        for(int i=0;i<heights.length;i++){
            int count=0;
            for(int j=i+1;j<heights.length;j++){
                if(heights[j]>=heights[i]){
                    count++;
                }else{
                    break;
                }
            }
            for(int j=i-1;j>=0;j--){
                if(heights[j]>=heights[i]){
                    count++;
                }else{
                    break;
                }
            }
            max=Math.max((count+1)*heights[i], max);
        }
        return max;
    }
}