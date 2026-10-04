class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        set_list = set()
        for n in nums:
            if n in set_list:
                return True
            else:
                set_list.add(n)
        return False
        