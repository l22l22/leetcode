public class Move_Zeros {
    //배열 복사하면 안된다.
    public void moveZeros(int[] nums) {

        for(int i = 0 ; i < nums.length-1; i++) {
            if(nums[i] == 0 && i != nums.length-1) {
                int j = i;
                while(nums[j] == 0 && j != nums.length-1) {
                    j++;
                }
                System.out.println(j);
                nums[i]  = nums[j];
                nums[j] = 0;
            }
        }


    }
}
