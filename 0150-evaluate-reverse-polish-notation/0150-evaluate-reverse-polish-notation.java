class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<>();
        
        for(String c : tokens){
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                int b = num.pop();
                int a = num.pop();

                switch(c){
                    case "+": num.push(a + b);
                    break;
                    case "-": num.push(a - b);
                    break;
                    case "*": num.push(a * b);
                    break;
                    case "/": num.push(a / b);
                    break;
                }
            }
            else{
                num.push(Integer.parseInt(c));
            }
        }
        return num.pop();
    }
}