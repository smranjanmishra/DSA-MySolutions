class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(st.isEmpty() || st.peek() != s.charAt(i)) {
                st.push(s.charAt(i));
            }
            else {
                st.pop();
            }
        }
        char[] arr = new char[st.size()];
        for(int j=arr.length - 1; j>=0; j--) {
            arr[j] = st.pop();
        }
        return String.valueOf(arr);
    }
}