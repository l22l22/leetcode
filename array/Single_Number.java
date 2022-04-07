import java.util.HashSet;
import java.util.Iterator;

public class Single_Number {
    public int singleNumber(int[] nums) {
        //HashSet<Integer> hashSet = new HashSet<>(Arrays.hashCode(nums));
        HashSet<Integer> hashSet = new HashSet<>();
        int single= 0;
        for(int i = 0 ; i < nums.length; i++) {
            hashSet.add(nums[i]);
            single += nums[i];
        }
        Iterator iter = hashSet.iterator();
        while(iter.hasNext()) {
            single -= 2* (int)iter.next();

        }
        System.out.println(-single);
        //System.out.println(hashSet);
        return -single;
    }
}
