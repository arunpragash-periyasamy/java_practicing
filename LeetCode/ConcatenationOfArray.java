import java.util.Arrays;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        for(int i = 0, j = nums.length; i < nums.length; i++, j++ ){
            result[i]=nums[i];
            result[j]=nums[i];
        }
        return result;
    }
}

class ConcatenationOfArray{
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {1,2,3,4};
        int[] result = solution.getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}