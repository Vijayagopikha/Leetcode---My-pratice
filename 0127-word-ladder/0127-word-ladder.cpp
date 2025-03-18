class Solution {
public:
    int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
         set<string> s;
        int flag = 0;
        for(string word  : wordList){
            s.insert(word);
            if(word.compare(endWord) ==  0){
                flag = 1;
            }
        }
        if(flag == 0){
            return  0;
        }
        else{
            queue<string> q;
            q.push(beginWord);
            int level = 0;
            int size;
            while(!q.empty()){
             level++;
             size = q.size();
             while(size--){
                string cur = q.front();
                q.pop();
                for(int i=0;i<cur.length();i++){
                    string temp = cur;
                    for(char c = 'a';c<='z';c++){
                        temp[i] = c;
                        if(temp.compare(endWord) == 0){
                            return level+1;
                        }
                        if(s.contains(temp)){
                            q.push(temp);
                            s.erase(temp);
                        }
                    }
                }
             }
            

            }
        }
        return 0;
    }
};