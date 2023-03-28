import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18 {
    @SuppressWarnings({"all"})

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) {
            return quadruplets;
        }
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            for (int j = i + 1; j < length - 2; j++) {
                int left = j + 1, right = length - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
//                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        ArrayList list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        quadruplets.add(list);

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return quadruplets;

    }

    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
//        int [] nums = {2,2,2,2,2};
//        int [] nums = {-2,-1,-1,1,1,2,2};//预期结果[[-2,-1,1,2],[-1,-1,1,1]]

        int target = 0;
        System.out.println(fourSum(nums,target));
    }
}
