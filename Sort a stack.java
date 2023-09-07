class GfG{
	public Stack<Integer> sort(Stack<Integer> s1)
	{
	    sortStack(s1);
	    return s1;
	}
	public void sortStack(Stack<Integer> s1){
	    if(s1.empty()){
	        return ;
	    }
	    int ele=s1.pop();
	    sortStack(s1);
	    sortInsert(s1,ele);
	}
	public void sortInsert(Stack<Integer> s1,int ele){
	    if(s1.empty() || (!s1.empty() && s1.peek()<ele)){
	        s1.push(ele);
	        return ;
	    }
	    int x=s1.pop();
	    sortInsert(s1,ele);
	    s1.push(x);
	}
}
