// Last updated: 11/08/2026, 16:15:21
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int ele:nums2){
            while(!st.isEmpty() && ele >st.peek()){
                m.put(st.pop(),ele);
            }
            st.push(ele);
        }
        int[]ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(m.containsKey(nums1[i]))
                ans[i] =m.get(nums1[i]);
            else
                ans[i] = -1;
        }
        return ans;
    }

}