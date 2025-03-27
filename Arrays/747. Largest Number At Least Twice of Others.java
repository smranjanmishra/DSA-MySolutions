class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int idx = -1;
        for(int i=0; i<n; i++) {
            if(nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                idx = i;
            }
            else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        if(max2 * 2 <= max1) {
            return idx;
        }
        return -1;
    }
}