class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r=k-1;
        int sol=100001;
        while(r<nums.length){
            int diff=nums[r]-nums[l];
            sol=Math.min(sol,diff);
            r++;
            l++;
        }
        return sol;
    }
}