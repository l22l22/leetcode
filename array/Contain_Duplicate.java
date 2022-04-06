/*
Time Limit Exceeded........
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean containDupli = false;
        for(int i = 0 ; i < nums.length-1; i++) {
            for(int j = i+1 ; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    containDupli = true;
                    return containDupli;
                }
            }
        }
        return containDupli;
    }
}
