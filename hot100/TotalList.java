import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//1.case:注意本题没有保证 k 小于数组长度 n。由于轮转 n 次等于没有轮转，轮转 n+1 等于轮转 1 次，依此类推，轮转 k 次等于轮转 kmodn 次。
// 时间复杂度：O(n)，空间复杂度O(1)
public class TotalList {

    //160. 相交链表
    //给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
    //题目数据 保证 整个链式结构中不存在环。
    public ListNode getListNode160a(ListNode headA, ListNode headB){
        ListNode Pa = headA;
        ListNode Pb = headB;
        while (Pa != Pb) {
            Pa = Pa == null ? headB : Pa.next;
            Pb = Pb == null ? headA : Pb.next;
        }
        return Pa;
    }

    //创建链表
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
            this.next = null;
        }
    }

    //打印链表
    public static void PrintList(ListNode head) {
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }

    //链表添加元素
    public static ListNode AddListNode(){
        ListNode newNode = new ListNode((int)(Math.random() * 100));
        ListNode tmp = newNode;
        for (int i = 0; i < 20; i++) {
            int randomElement = (int)(Math.random() * 100);
            ListNode curNode = new ListNode(randomElement);
            tmp.next = curNode;
            tmp = curNode;
        }
        return newNode;

    }
    //main
    public static void main(String[] args) {
        ListNode head = AddListNode();
        PrintList(head);
    }
}

