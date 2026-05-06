class Solution {
private:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            auto position = t.find(s[i]);
            if (position != -1) {
                t.erase(position, 1);
            } else {
                return false;
            }
        }
        return true;
    }

public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> solution;
        vector<bool> visited(strs.size(), false); 

        for (int i = 0; i < strs.size(); i++) {
            if (visited[i] == true) {
                continue; 
            }
            vector<string> currentGroup;
            
            currentGroup.push_back(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.size(); j++) {
                
                if (visited[j] == false && isAnagram(strs[i], strs[j])) {
                    currentGroup.push_back(strs[j]);
                    visited[j] = true;
                }
            }
            
            solution.push_back(currentGroup);
        }
        
        return solution;
    }
};