
// //   Definition for singly-linked list.
//   public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
 


// public class Solution {

//     public ListNode mergeKLists(ListNode[] lists) {
//         if (lists == null || lists.length == 0) return null;
//         return mergeRange(lists, 0, lists.length - 1);
//     }

//     // Divide and conquer: recursively merge from start to end
//     private ListNode mergeRange(ListNode[] lists, int start, int end) {
//         if (start == end) {
//             return lists[start];
//         }

//         int mid = start + (end - start) / 2;
//         ListNode left = mergeRange(lists, start, mid);
//         ListNode right = mergeRange(lists, mid + 1, end);
//         return mergeTwoLists(left, right);
//     }

//     // Recursive merge of two sorted linked lists
//     private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         if (l1 == null) return l2;
//         if (l2 == null) return l1;

//         if (l1.val < l2.val) {
//             l1.next = mergeTwoLists(l1.next, l2);
//             return l1;
//         } else {
//             l2.next = mergeTwoLists(l1, l2.next);
//             return l2;
//         }
//     }
// }
