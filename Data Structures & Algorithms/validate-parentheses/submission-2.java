class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='('||sb.charAt(i)=='['||sb.charAt(i)=='{'){
                stack.push(sb.charAt(i));
            } else if(sb.charAt(i)==')'&& !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            } else if(sb.charAt(i)==']'&& !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            } else if(sb.charAt(i)=='}'&& !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            } else{
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
