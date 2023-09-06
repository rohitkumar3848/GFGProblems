class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> s1=new Stack<>();
        char ch[]=x.toCharArray();
        for(char c:ch){
            if(c=='(' || c=='{' || c=='['){
                s1.push(c);
                continue;
            }
            else if(s1.empty()){
                return false;
            }
            char ele=s1.pop();
            if(ele=='(' && c!=')'){
                return false;
            }
            if(ele=='{' && c!='}'){
                return false;
            }
            if(ele=='[' && c!=']'){
                return false;
            }
        }
        return (s1.empty());
    }
}
