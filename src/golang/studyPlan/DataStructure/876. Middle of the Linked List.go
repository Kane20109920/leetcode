/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func middleNode(head *ListNode) *ListNode {
    var tempHead,result = head,head;
    var count = 0;
    for tempHead != nil {
        if(count % 2 == 1){
            result = result.Next;
        }
        tempHead = tempHead.Next;
        count++;

    }
    return result;
}
