class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        res = defaultdict(list)
        
        for s in strs:
            key = tuple(sorted(s))  
            res[key].append(s)
            
        return list(res.values())