class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        freq=Counter(nums)
        return freq.most_common(1)[0][0]