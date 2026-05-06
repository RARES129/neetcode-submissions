class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(int index=0;index<tokens.length;index++){
            if(tokens[index].equals("+") || tokens[index].equals("-") || tokens[index].equals("/") ||tokens[index].equals("*")){
                int rigth = stack.pop();
                int left = stack.pop();

                int result=0;
                switch (tokens[index]){
                    case "+":
                        result = left + rigth;
                        break;
                    case "-":
                        result = left - rigth;
                        break;
                    case "*":
                        result = left * rigth;
                        break;
                    case "/":
                        result = left / rigth;
                        break;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(tokens[index]));
            }
        }
        return stack.pop();

    }
}
