class Solution
{
    public void del(Stack<Integer>s1,int n,int count){
        if(count==n){
            s1.pop();
            return;
        }
        int val=s1.pop();
        del(s1,n,count+1);
        s1.push(val);
    }
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int n=(int)Math.floor(sizeOfStack/2);
        del(s,n,0);
    } 
}
