class Solution {
    public String simplifyPath(String path) {
        String arr[] = path.split("/+");
       
        Stack<String> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("..")) {
                if(!st.isEmpty()) {
                      st.pop();
                }
            } else if (arr[i].equals(".")||arr[i].equals("")) {
                continue;
            } else {
                st.push(arr[i]);
            }
        }
        String ans = "";
        for(String s: st){
            ans+= "/"+s;
        }
        if(ans.equals("")) ans = "/";

        return ans;
    }
}