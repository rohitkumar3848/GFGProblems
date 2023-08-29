class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        Node cur=head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        if(count<n){
            return -1;
        }
        cur=head;
        for(int i=1;i<count-n+1;i++){
            cur=cur.next;
        }
        return cur.data;
    }
}
