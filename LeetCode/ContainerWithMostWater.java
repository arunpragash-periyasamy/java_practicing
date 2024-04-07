// https://leetcode.com/problems/container-with-most-water/?source=submission-ac
import java.util.Scanner;
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length-1;
        while(start<end){
            int space = end - start;
            int minHeight = (height[start] > height[end]) ? height[end--] : height[start++];
            int water = space * minHeight;
            max = (max < water) ?  water : max;
        }
        return max;
    }
}
class ContainerWithMostWater{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        Solution solution=new Solution();
        int result = solution.maxArea(array);
        System.out.println(result);
    }
}

 //sample input:
//      [1,8,6,2,5,4,8,3,7]
// sample output:
//      49 