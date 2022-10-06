class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse = 0;
        int temp = x;
        while(temp>0)
        {
            int curr = temp%10;
            reverse = reverse * 10 + curr;
            temp = temp/10;
        }
        if(x == reverse)
        {
            return true;
        }
        else
        {
            return false;    
        }
    }
}
