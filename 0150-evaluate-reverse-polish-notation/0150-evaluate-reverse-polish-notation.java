class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int num2 = 0;
        int num1 = 0;
        for(String token : tokens){
            switch (token) {
            case "+":
                num2= stack.pop();
                num1 = stack.pop();
                ans = num1 + num2;
                stack.push(ans);
                break;  
            case "-":
                num2= stack.pop();
                num1 = stack.pop();
                ans = num1 - num2;
                stack.push(ans);
                break;
            case "*":
                num2= stack.pop();
                num1 = stack.pop();
                ans = num1 * num2;
                stack.push(ans);
                break;
            case "/":
                num2= stack.pop();
                num1 = stack.pop();
                ans = num1 / num2;
                stack.push(ans);
                break;
            default:
                stack.push(Integer.parseInt(token));
        }
        }

        System.out.print(stack);
        return stack.pop();
    }

}