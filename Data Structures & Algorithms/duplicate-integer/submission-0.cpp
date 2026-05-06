class Solution {
private:
    void bubbleSort(vector<int>& nums) {
        int length = nums.size(); 
        bool sorted = false;
        
        while (sorted == false) {
            sorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums[i], nums[i + 1]);
                    sorted = false;
                }
            }
        }
    }

public:
    bool hasDuplicate(vector<int>& nums) {
       
        if (nums.size() <= 1) {
            return false; 
        }

        bubbleSort(nums);
        
        int length = nums.size();
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        
        return false;
    }
};