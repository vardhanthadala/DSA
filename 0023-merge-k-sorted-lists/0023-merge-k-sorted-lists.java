
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
     if(lists==null ||lists.length==0){
         return null;
     }   
     PriorityQueue<ListNode>pq=new PriorityQueue<>((a, b) -> a.val - b.val);
     for(ListNode list:lists){
         if(list!=null){
             pq.add(list);
         }
     }
     ListNode dummy=new ListNode(0);
     ListNode curr=dummy;
      while (!pq.isEmpty()) {
            ListNode node = pq.remove();
            curr.next = node;
            curr = curr.next;

            if (node.next != null) {
                pq.add(node.next);
            }
        }
        return dummy.next;
    }
}