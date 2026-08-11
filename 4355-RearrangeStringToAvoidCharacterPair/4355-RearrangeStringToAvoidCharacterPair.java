// Last updated: 11/08/2026, 16:10:26
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder middle = new StringBuilder();
        int xCount =0,yCount =0;
        for(char ch :s.toCharArray()){
            if(ch == x){
                xCount++;
            }else if(ch==y){
                yCount++;
            }else{
                middle.append(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(yCount-->0){
            ans.append(y);
        }
        ans.append(middle);
        while(xCount-->0){
            ans.append(x);
        }
        return ans.toString();
    }
}