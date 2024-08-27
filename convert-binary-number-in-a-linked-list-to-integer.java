class Solution {
    public int getDecimalValue(ListNode head) {
        int size = 0;
        ListNode temp = head;

        // Calculate the size of the linked list
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        ListNode p = head;
        int result = 0;

        // Traverse the linked list and compute the decimal value using Math.pow()
        while (p != null) {
            result += p.val * Math.pow(2, --size);
            p = p.next;
        }

        return result;
    }
}
