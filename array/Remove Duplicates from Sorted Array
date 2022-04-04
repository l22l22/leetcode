class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0; 
        boolean isDuplicate;
        for(int i = 0 ; i < nums.length; i++) {
            if(i == 0) {
                k = 1;
            }else{
                isDuplicate = false;
                for(int j = 0 ; j < i; j++ ){
                    if(nums[j]==nums[i]) {
                        isDuplicate = true; 
                    }
                }
                if(!isDuplicate) {
                    k = k + 1;
                    nums[k-1] = nums[i];   
                }
            }
        }
        System.out.println(nums.toString());
        return k;
    }
}
