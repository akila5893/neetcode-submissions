class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }
        Arrays.sort(nums);
        int largest=0,count=0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1]+1 == nums[i]) {
                count++;
            }else if(nums[i-1] == nums[i]) {
                continue;
            }else{
                if(count > largest) {
                    largest = count;
                }
                count=0;
            }
        }
        if(largest > count) {
            return largest+1;
        }
        return count+1;
        
    }
}
