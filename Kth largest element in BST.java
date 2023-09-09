class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    // public void inorder(Node root,PriorityQueue<Integer> pq,int i){
    //     if(root==null){
    //         return ;
    //     }
    //     inorder(root.left,pq,i);
    //     pq.add(root.data);
    //     inorder(root.right,pq,i);
    // }
    public void inorder(Node root,ArrayList<Integer> a1){
        if(root==null){
            return ;
        }
        inorder(root.left,a1);
        a1.add(root.data);
        inorder(root.right,a1);
    }
    public int kthLargest(Node root,int k)
    {
        //PriorityQueue<Integer> pq= new PriorityQueue<>((a, b) -> b - a);
        // inorder(root,pq,0);
        // for(int i=1;i<k;i++){
        //     pq.poll();
        // }
        // return pq.peek();
        ArrayList<Integer> a1=new ArrayList<>();
        inorder(root,a1);
        return a1.get(a1.size()-k);
    }
}
