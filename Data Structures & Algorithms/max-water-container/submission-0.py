class Solution:
    def maxArea(self, heights: List[int]) -> int:
        res = 0;
        l,r = 0, len(heights)-1
        print(r)
        height, width = 0,0
        while(l<r):
            heigth=min(heights[l],heights[r])
            width=r-l
            res=max(heigth*width,res)
            if(heights[l]<heights[r]):
                l=l+1;
            else:
                r=r-1;
        return res
        