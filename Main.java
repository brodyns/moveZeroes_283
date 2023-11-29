public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        (new Solution()).moveZeroes(nums);
    }
}

class Solution{
    public void moveZeroes(int[] nums){
        if(nums == null){
            return;
        }
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                if(nums[i] == 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                // 如果j位置上是0，则等待j跨过0后来到第一个非零元素位置时，i再移动到该0元素所在位置
                i++;
            }
        }
    }
}
