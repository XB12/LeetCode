import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 双指针
 */
public class _15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        int i = 0;

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length<3 || nums==null){
            return result;
        }
        Arrays.sort(nums);
        while(nums[i]<=0 && i< nums.length-1 ){
            if(i > 0 && nums[i] == nums[i-1]) {
                i++;
                continue; // 去重
            }
            int L=i+1;
            int R=nums.length-1;

            while(L<R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum<0){
                    L++;
                }else if(sum>0) {
                    R--;
                }else{
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[L]);
                    res.add(nums[R]);
                    result.add(res);
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重


                    L++;
                    R--;
                }

            }
            i++;
        }






        return result;
    }

    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
