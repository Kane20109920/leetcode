class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        for(String token:tokens){
            switch(token){
                case "+":
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    stack.push(num1+num2);
                break;
                case "-":
                    num2 = stack.pop();
                    num1 = stack.pop();
                    stack.push(num1-num2);
                break;
                    case "*":
                    num2 = stack.pop();
                    num1 = stack.pop();
                    stack.push(num1*num2);
                break;
                    case "/":
                    num2 = stack.pop();
                    num1 = stack.pop();
                    stack.push(num1/num2);
                break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
