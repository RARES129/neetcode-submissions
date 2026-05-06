#include <iostream>
using namespace std;

class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length())
            return false;


        for(int i=0;i<s.length();i++)
        {
            auto position = t.find(s[i]);
            if(position!=-1){
                t.erase(position,1);
            } else {
                return false;
            }
        }

        return true;
    }
};
