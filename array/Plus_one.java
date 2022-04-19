package array;

import java.math.BigInteger;
import java.util.Arrays;

public class Plus_one {
    public int[] plusOne(int[] digits) {

        String str_digits = "";

        //마지막 배열에 1을 더한다.
        digits[digits.length-1] = digits[digits.length-1] +1;

        int len = digits.length;
        int i = len -1;

        while(digits[i] == 10 ) {
            if(i != 0 ){
                digits[i-1] += 1;
                digits[i] = 0;
                i--;
            }else {
                len += 1;
                break;
            }
        }

        int[] output = new int[len];

        for(int k = 0 ; k < len; k++) {
            if(k == len-1 && len != digits.length){
                output[1] = 0;
                output[0] = 1;
            }else{
                output[len-k-1] = digits[digits.length-k-1];
            }
        }
        return output;



    }
}
