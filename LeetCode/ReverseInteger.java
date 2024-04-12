class Solution {
    public int reverse(int x) {
        int temp = Math.abs(x);
        long reverse = reversed(temp);
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) return 0;
        return (x>0) ? (int)(reverse) : -(int)(reverse); 
    }
    long reversed(int num){
        long reverse = 0;
        while(num > 0){
            reverse = (reverse*10)+(num%10);
            num = num/10;
        }
        return reverse;
    }
}


class ReverseInteger{
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.reverse(1534236469));
        System.out.println(solution.reverse(-1534236469));
        System.out.println(solution.reverse(10));
        System.out.println(solution.reverse(0));
        System.out.println(solution.reverse(-101));
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse(-120));
        System.out.println(solution.reverse(123456789));
        System.out.println(solution.reverse(-123456789));
    }
}