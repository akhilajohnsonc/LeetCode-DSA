class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> para_library = new HashMap<>();
        Stack<Character> open_para_stack = new Stack<>();
        //Add brackets for lookup
        
        para_library.put(')','(');
        para_library.put(']','[');
        para_library.put('}','{');
        
        for(int i=0;i<s.length();i++){
            Character bracket = s.charAt(i);
            if(para_library.containsKey(bracket)){
         
                if(!open_para_stack.isEmpty() && para_library.get(bracket).equals(open_para_stack.peek())){
                    open_para_stack.pop();
                }else{
                    return false;
                }
            }else{
                 open_para_stack.push(bracket);
            }
        }
        
        return open_para_stack.isEmpty();
    }
}