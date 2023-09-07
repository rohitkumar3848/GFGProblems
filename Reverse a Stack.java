class Solution
{ 
    static void insert(Stack<Integer> s1,int x){
        if(s1.empty()){
            s1.push(x);
            return ;
        }
        int ele=s1.pop();
        insert(s1,x);
        s1.push(ele);
    }
    static void reverse(Stack<Integer> s)
    {
        if(s.empty()){
            return ;
        }
        int ele=s.pop();
        reverse(s);
        insert(s,ele);
        
    }
}
