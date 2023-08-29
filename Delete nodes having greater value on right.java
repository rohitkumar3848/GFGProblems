class Solution
{
    Node compute(Node head)
    {
        head=reverse(head);
        Node cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.data>cur.next.data){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        head=reverse(head);
        return head;
    }
    Node reverse(Node head){
        Node next=null;
        Node pre=null;
        while(head!=null)
        {
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
