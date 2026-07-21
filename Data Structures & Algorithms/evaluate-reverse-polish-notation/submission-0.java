class Solution {

    public static boolean isInteger(String str){
        if(str == null || str.isEmpty()){
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    private static int evaluate(int num2, int num1, String token){
        if(token.equals("+")){
            return num1 + num2;
        }else if(token.equals("-")){
            return num1 - num2;
        }else if(token.equals("*")){
            return num1 * num2;
        }else if(token.equals("/")){
            return num1 / num2;
        }else{
            return 0;
        }
    }

    public int evalRPN(String[] tokens) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        int currentEvaluation = 0;

        for(String token : tokens){
            if(isInteger(token)){
                stack.push(Integer.parseInt(token));
            }else if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                    if(stack.size() >= 2){
                        currentEvaluation = evaluate(stack.pop(), stack.pop(), token);
                        stack.push(currentEvaluation);
                    }else{
                        return 0;
                    }
            }
        }
        if(!stack.isEmpty()){
            return stack.pop();
        }

        return 0;
    }
}
