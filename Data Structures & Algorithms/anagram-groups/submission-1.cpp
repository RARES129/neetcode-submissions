#include <vector>
#include <string>
#include <unordered_map>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> anagramMap;

        for (string word : strs) {
        
            string label = word;
            sort(label.begin(), label.end());
            
            anagramMap[label].push_back(word);
        }

        vector<vector<string>> solution;
        
        for (auto pair : anagramMap) {
            solution.push_back(pair.second);
        }
        
        return solution;
    }
};