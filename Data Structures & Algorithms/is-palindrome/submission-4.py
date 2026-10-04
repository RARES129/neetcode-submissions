class Solution:
    def isPalindrome(self, s: str) -> bool:
        sol = ''
        for c in s:
            if c.isalnum():
                sol = sol + c.lower()
        return sol == sol[::-1]