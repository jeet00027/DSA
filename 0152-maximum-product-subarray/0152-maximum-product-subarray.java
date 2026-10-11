class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftprod = 1;
        int rightprod = 1;
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){

            if(leftprod == 0){
                leftprod = 1;
            }

            if(rightprod == 0){
                rightprod = 1;
            }

            leftprod *= nums[i];
            rightprod *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftprod, rightprod));
        }

        return ans;
    }
}