class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result=nums[0]+nums[1]+nums[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    result = (Math.abs(target-sum) > Math.abs(target-result)) ? result : sum;
                }
            }
        }
        return result;
    }
}

class 3SumClosest{
    public static void main(String[] args){
        int[] nums = {-1,2,1,-4};
        int n = 1;
        Solution solution = new Solution();
        int result  = solution.threeSumClosest(nums, n);
        System.out.println(result);
    }
}