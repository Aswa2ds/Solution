package com.aswa2ds.niuke;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class NiukePrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode node = listNode;
        ArrayList<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        int len = list.size();
        int s1 = 0;
        int s2 = len - 1;
        while (s1 < s2) {
            int temp = list.get(s1);
            list.set(s1, list.get(s2));
            list.set(s2, temp);
            s1++;
            s2--;
        }
        return list;
    }
}
