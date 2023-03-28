import java.util.*;

public class _16 {
    /**
     * 三重循环
     */
//    public static int threeSumClosest(int[] nums, int target) {
//        int temp =99999,sum=0;
//        for (int i = 0; i < nums.length-2 ; i++) {
//
//            for (int L = i+1; L < nums.length-1; L++) {
//                for (int R = L+1; R < nums.length; R++) {
//                    if(nums[i]+nums[L]+nums[R]-target==0){
//                        return nums[i]+nums[L]+nums[R];
//                    }else if(Math.abs(nums[i]+nums[L]+nums[R]-target) <temp){
//                        temp = Math.abs(nums[i]+nums[L]+nums[R]-target);
//                        sum = nums[i]+nums[L]+nums[R];
//                    }
//                }
//            }
//
//        }
//        return  sum;
//
//    }

    /**
     * 排序加双指针
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int temp=99999,sum=0;
        int i = 0;

        for ( i = 0; i < nums.length-1; i++) {
            int L = i+1, R = nums.length-1;
            while(L<R){
                if(nums[i]+nums[L]+nums[R]<target){

                    if(Math.abs(nums[i]+nums[L]+nums[R]-target) <temp){
                        temp = Math.abs(nums[i]+nums[L]+nums[R]-target);
                        sum = nums[i]+nums[L]+nums[R];
                    }
                    L++;
                }else if(nums[i]+nums[L]+nums[R]>target ){

                    if(nums[i]+nums[L]+nums[R]-target <temp){
                        temp = nums[i]+nums[L]+nums[R]-target;
                        sum = nums[i]+nums[L]+nums[R];
                    }
                    R--;
                }else{
                    return nums[i]+nums[L]+nums[R];
                }
            }
        }
        return sum;



    }

    public static void main(String[] args) {
        int [] nums = {-1,2,1,-4};
        int target= 1;
        System.out.println(threeSumClosest(nums,target));
    }
   
    

}
