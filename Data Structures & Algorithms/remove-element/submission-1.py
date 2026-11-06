class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i = 0
        sol = 0
        while i<len(nums):
            if nums[i]!=val:
                nums[sol]=nums[i]
                sol+=1
            i+=1
        return sol