class Solution {
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char temp:s.toCharArray()){
            if(temp != ']'){
                stack.push(temp);
            }else{
                StringBuilder repeatChar = new StringBuilder();
                while(stack.peek() != '['){
                    repeatChar.append(String.valueOf(stack.pop()));
                }
                stack.pop();
                StringBuilder repeatTimeString = new StringBuilder();
                while(!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <='9'){
                    repeatTimeString.append(String.valueOf(stack.pop()));
                }
                int repeatTime = repeatTimeString.length() > 0 ? Integer.valueOf(repeatTimeString.reverse().toString()) : 0;
                // System.out.println(repeatTimeString.toString()+"\t"+repeatTime+"\t"+repeatChar.toString());
                StringBuilder resultString = new StringBuilder();
                for(int i = 0;i< repeatTime;i++){
                    resultString.append(repeatChar.toString());
                }
                for(char temp2 : resultString.reverse().toString().toCharArray()){
                    stack.push(temp2);
                }
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}
