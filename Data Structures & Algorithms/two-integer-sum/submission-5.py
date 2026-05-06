class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen_numbers = {}
        
        for i in range(len(nums)):
            difference = target-nums[i]
            if(difference in seen_numbers):
                return [seen_numbers[difference], i]
            seen_numbers[nums[i]]=i
        