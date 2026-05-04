class Solution {
public:
int sumFinder(vector<int>& prefix){
    int n=prefix.size();
     if (n == 0) return 0; 
    for(int i=1;i<n;i++){
            prefix[i]+=prefix[i-1];
        }
        return prefix[n-1];
}
int sumFinder1(vector<int> &suffix){
    int n=suffix.size();
     if (n == 0) return 0; 
        for(int j=n-2;j>=0;j--){
            suffix[j]+=suffix[j+1];
        }
        return suffix[0];
}
    int pivotIndex(vector<int>& nums) {
        for(int i=0;i<nums.size();i++){
            vector<int> prefix(nums.begin(),nums.begin()+i);
            vector<int> suffix(nums.begin()+i+1,nums.end());
            int x=sumFinder(prefix);
            int y=sumFinder1(suffix);
            if (x==y) return i;
        }
        return -1;
    }
};