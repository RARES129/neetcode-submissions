class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        ind1, ind2 = 0, 0
        sol = ""
        while ind1 != len(word1) or ind2 != len(word2):
            if(ind1 != len(word1)):
                sol += word1[ind1]
                ind1+=1
            if ind2 != len(word2):
                sol += word2[ind2]
                ind2+=1
        return sol