// Last updated: 11/08/2026, 16:12:41
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> sk = new Stack<>();
      for(char c : s.toCharArray()){
        if(c!='#'){
            st.push(c);
        }else if(!st.isEmpty()){
            st.pop();
        }
      }
      for(char c:t.toCharArray()){
        if(c!='#'){
            sk.push(c);
        }else if(!sk.isEmpty()){
            sk.pop();
        }
      }
      return st.equals(sk);
    }
}