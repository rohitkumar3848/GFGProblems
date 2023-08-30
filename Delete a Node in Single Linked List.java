class GfG
{
    Node deleteNode(Node head, int x)
    {
	    Node pre=null;
	    Node cur=head;
	    if(x==1 && head!=null){
	        return head.next;
	    }
	   for(int i=0;i<x-2 && cur.next!=null;i++){
	       cur=cur.next;
	   }
	   if(cur==null && cur.next==null){
	       return null;
	   }
	   cur.next=cur.next.next;
	   return head;
    }
}
