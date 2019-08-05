// class Solution {
//     public void reorderList(ListNode head) {
//         if (head == null || head.next == null) return;
        
//         ListNode mid = findMid(head);
//         ListNode l2 = mid.next;
//         mid.next = null; // 将前半部分链表截断
//         l2 = reverse(l2); // 将后半部分链表反转
//         ListNode l1 = head;
//         // 组装新的链表
//         while (l1 != null && l2 != null) {
//             ListNode tmp = l1.next;
//             l1.next = l2;
//             l2 = l2.next;
//             l1.next.next = tmp;
//             l1 = tmp;
//         }
//     }
    
//     // 返回链表的中间节点
//     // 龟兔赛跑，每秒钟乌龟跑1步，兔子跑2步，当兔子跑完全程时乌龟正好跑完一半
//     ListNode findMid(ListNode head) {
//         ListNode fast = head;
//         ListNode slow = head;
//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
//         }
//         return slow;
//     }
    
//     // 返回反转后的链表
//     ListNode reverse(ListNode head) {
//         ListNode newHead = null;
//         while (head != null) {
//             ListNode tmp = head.next;
//             head.next = newHead;
//             newHead = head;
//             head = tmp;
//         }
//         return newHead;
//     }
// }


class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<difficulty.length;i++)
            list.add(new int[] {difficulty[i],profit[i]});
        Collections.sort(list,(a,b) -> {return a[0]-b[0];});
        Arrays.sort(worker);
        int res = 0, maxProfit =0;
        for(int i=0,j=0;i<worker.length;i++){
            while(j<list.size() && list.get(j)[0] <= worker[i])
                maxProfit = Math.max(fit,list.get(j)[1]);
            j++;
            }
        res += fit;
        }
        return res;
}