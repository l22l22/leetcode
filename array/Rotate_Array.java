public void rotate(int[] nums, int k) {
        int[] output = new int[nums.length] ;
        k = k % nums.length;
        int length = nums.length;
		for(int i = 0 ; i < nums.length; i++){
            
			if(k>i) {
                output[i] = nums[length-k+i];
            }else {
                output[i] = nums[i-k];
            }
            
		}
        
        for(int j = 0 ; j < nums.length; j++) {
            nums[j] = output[j];
        }
    
    }
