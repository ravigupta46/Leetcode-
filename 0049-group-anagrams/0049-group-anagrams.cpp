class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& st) {
        vector<vector<string>> ans;
    unordered_map<string,vector<string>> mp;
    for(string s:st){
        string key=s;
        sort(key.begin(),key.end());
        mp[key].push_back(s);
    }
    for(auto it :mp){
        ans.push_back(it.second);
    }
        return ans;
    }
};