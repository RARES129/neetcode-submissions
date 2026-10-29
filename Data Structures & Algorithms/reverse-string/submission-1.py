class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        l, r = 0, len(s)-1
        aux=0
        while l<r:
            aux=s[l]
            s[l]=s[r]
            s[r]=aux
            r-=1
            l+=1