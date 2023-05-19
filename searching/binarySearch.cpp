class Solution {
public:
    int search(vector<int>& nums, int target) {
        size_t n =nums.size();
        int a =0, b = n-1,index=-1;
        while(a<=b){
         int mid = (a+b)/2;
         if(nums[mid] == target){
           index = mid;
           break;
         }else if(target < nums[mid]){
            b = mid -1;
         }else{
             a = mid+1;
         }
        };
       
        return index;
    }
};