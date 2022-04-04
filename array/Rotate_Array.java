public void rotate(int[] nums, int k) {
	//make array that I add nums to keep.
        int[] output = new int[nums.length] ;
	
	// if k is bigger that length of nums, it it same as rotate (k%nums.length) times. 
        k = k % nums.length;
	
	/*
	the rotated array is same as array that cutted from the kth to the end and prepend it to the cutted one.
	ex) input : [0,1,2,3,4] k = 3 
	   => output : [2,3,4,0,1] 
	   cut three form the end [2,3,4]
	   and prepend it to cutted one([0,1])
	   is [2,3,4,0,1]
	*/
	
	for(int i = 0 ; i < nums.length; i++){
		// k times
		if(k>i) {
			//add to output which have to prepent to cutted one.
			output[i] = nums[nums.length-k+i];
            	}else {
			//insert rest
                	output[i] = nums[i-k];
            	}
            
	}
        //deep copy arrays
        for(int j = 0 ; j < nums.length; j++) {
            nums[j] = output[j];
        }
	
	/*
	 k번째 rotate 하는건 뒤에서 k개를 잘라 남은 배열 앞에 붙이는 것과 같다.
	 따라서 앞에서 k개를 복사할 배열에 넣어준 뒤 남은 수를 그 뒤로 넣어준다.
	 배열을 깊은 복사하기 위해서 for문으로 nums의 값을 하나씩 변경해준다. 
	*/
    
    }
