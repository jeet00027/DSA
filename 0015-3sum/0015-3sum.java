class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length;
        List<List<Integer>> answer = new ArrayList<>();

        // Three different indices are required.
        if (n < 3) {
            return answer;
        }

        Arrays.sort(nums);

        for (int fixed = 0; fixed < n - 2; fixed++) {
            /*
             * Skip the same fixed value to avoid
             * generating duplicate triplets.
             */
            if (fixed > 0 && nums[fixed] == nums[fixed - 1]) {
                continue;
            }

            int left = fixed + 1;
            int right = n - 1;

            while (left < right) {
                long sum =
                    (long) nums[fixed] +
                    nums[left] +
                    nums[right];

                // A smaller sum needs a larger left value.
                if (sum < 0) {
                    left++;
                }
                // A larger sum needs a smaller right value.
                else if (sum > 0) {
                    right--;
                }
                else {
                    answer.add(Arrays.asList(
                        nums[fixed],
                        nums[left],
                        nums[right]
                    ));

                    left++;
                    right--;

                    /*
                     * Skip repeated values so the same
                     * triplet is not added again.
                     */
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return answer;
    }
}