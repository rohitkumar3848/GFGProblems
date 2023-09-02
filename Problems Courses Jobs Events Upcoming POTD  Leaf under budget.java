class Solution{
    public int getCount(Node node, int bud)
    {
        Queue<Pair> q1=new LinkedList<>(); 
        int sum=0;
        int count=0;
        q1.add(new Pair(node,1));
        while(q1.size()>0){
            Node cur=q1.peek().n;
            int level=q1.peek().d;
            q1.remove();
            if(cur.left==null && cur.right==null){
                count++;
                sum+=level;
                if(sum>bud){
                    return count-1;
                }
                if(sum==bud){
                    return count;
                }
            }
            if(cur.left!=null){
                q1.add(new Pair(cur.left,level+1));
            }
            if(cur.right!=null){
                q1.add(new Pair(cur.right,level+1));
            }
        }
        return count;
    }
    class Pair{
        Node n;
        int d;
        Pair(Node node,int data){
            n=node;
            d=data;
        }
    }
}
