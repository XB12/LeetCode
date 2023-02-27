public class _11 {
/**
 *双指针
 */
    public static int maxArea(int[] height){
        int i =0,j= height.length-1;
        int max=0,temp=0;
        while(i!=j){
            if(height[i]<height[j]){
                temp = (j-i)*height[i];
                i++;
            }else {
                temp = (j-i)*height[j];
                j--;
            }
            if(temp>max){
                max = temp;
            }
        }



        return max;
    }

/**
暴力解法
时间复杂性太大
 */
//    public static int maxArea(int[] height) {
//        int n = height.length;
//        int max = 0, temp1 = 0, temp2 = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int x = j - i;
//                if (height[i] > height[j]) {
//                    temp1 = x * height[j];
//                } else {
//                    temp1 = x * height[i];
//
//                }
//                if (temp1 > temp2) {
//                    temp2 = temp1;
//                }
//            }
//
//            if (temp2 > max) {
//                max = temp2;
//            }
//
//        }
//        return max;
//
//    }

    public static void main(String[] args) {
        int hight[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(hight));

    }
}
