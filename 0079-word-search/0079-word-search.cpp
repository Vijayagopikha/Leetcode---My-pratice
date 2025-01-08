/*class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        unordered_map<char,int>m;
        int n = board.size();
        int m1 = board[0].size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m1;j++){
                m[board[i][j]] = m[board[i][j]] + 1;
            }
        }
        int l = word.size();
        for(int i=0;i<l;i++){
            if(m[word[i]]==0){
                cout<<word[i];
                cout<<m[word[i]];
                return false;
            }
            m[word[i]] -=1;
        }
        return true;
    }
};*/

class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        int m = board.size();
        int n = board[0].size();

        for(int i=0;i<m;i++){
            for(int j= 0;j<n;j++){
                if(board[i][j] == word[0] && back(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

private:
    bool back(vector<vector<char>>&board, string word, int row, int col,int index){
        int m = board.size();
        int n = board[0].size();
        if(index == word.size()){
            return true;
        }
        if(row<0 || row>=m || col<0 || col>=n || board[row][col] != word[index]){
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '#';

        bool found = back(board,word,row+1, col, index+1) || 
                     back(board, word, row-1,col,index+1) ||
                     back(board, word, row,col+1,index+1) ||
                     back(board, word, row,col-1,index+1);

        board[row][col] = temp;


    
    return found;
}
};
