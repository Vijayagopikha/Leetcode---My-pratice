class Solution {
    public boolean isValid(String s) {
        int l = s.length();
        Stack<Character> stack  = new Stack<>();
       
        for(int i=0;i<l;i++){
            char a = s.charAt(i);
            if(a=='(' || a=='[' || a=='{'){
                stack.push(a);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char b = stack.pop();
                if((b=='(' && a!=')') || (b=='{' && a!='}') ||(b=='[' && a!=']')){
                    return false;
                }
            }
        }
       
        return stack.isEmpty();
        }
    
    }
