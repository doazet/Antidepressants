public class Pattern132 {
    /**Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k]
     * such that i < j < k and nums[i] < nums[k] < nums[j].
     * Return true if there is a 132 pattern in nums, otherwise, return false.**/

    public static
    boolean find132pattern(int[] nums) {
        int n = nums.length, highest = n, third = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (highest < n && nums[i] > nums[highest]) third = nums[highest++];
            nums[--highest] = nums[i];
        }
        return false;
    }



}
