class Solution {
public:
    string sortSentence(string s) {
        string result;
      vector<pair<int,string>>p;
      istringstream ss(s);  //Used Stringstream
      string word;
      while(ss >> word){
          int index=word[word.length()-1];
          word.pop_back();  
          p.push_back({index,word});
      }

      sort(p.begin(),p.end());

      for(auto it:p){
          result +=it.second;
          result+=' ';    
      }
      result.pop_back();   //To remove the last space
      return result;
    }
};