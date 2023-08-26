class Solution{
    public static int kthSmallest(int[] nums, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:nums){
            pq.add(ele);
            if(pq.size()>r-k+2){
                pq.remove();
            }
        }
        return pq.peek();
    } 
}
