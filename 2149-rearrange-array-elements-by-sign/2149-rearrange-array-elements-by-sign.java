class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int positveindex=0;
        int negativeindex=1;


        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
             ans[positveindex]=nums[i];
             positveindex+=2;
            } else{
                ans[negativeindex]=nums[i];
                negativeindex+=2;
            }
        }  return ans;
    }
}