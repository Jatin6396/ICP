class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int res = 0;
                int num1 = st.pop();
                int num2 =st.pop();
                if (tokens[i].equals("+"))
                    res = num1 + num2;
                if (tokens[i].equals("-"))
                    res = num2 - num1;
                if (tokens[i].equals("/"))
                    res = num2 / num1;
                if (tokens[i].equals("*"))
                    res = num2 * num1;

                st.push(res);
            } else {
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.pop();
    }
}