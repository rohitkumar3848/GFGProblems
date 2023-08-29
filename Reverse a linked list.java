class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        if(head==null){
            return null;
        }
        Node next=null;
        Node pre=null;
        Node cur=head;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
