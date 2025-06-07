// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) { val = x; }
//  * }
//  */
// class Solution {
//     public void deleteNode(ListNode node) {
//         if(node == null || node.next == null) return;

//         node .val = node.next.val; // here we changing the current node value as by its next value
//         node .next= node.next.next; // skipping the next node as it alredy copied on the node.val

//         // by this we can delete the given  node.
//     }
// }