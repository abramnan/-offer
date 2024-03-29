import java.util.ArrayList;
/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
public class PrintFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = listNode;
        while(temp!=null) {
            list.add(0, temp.val);//使用了ArrayList的add（index，value）方法，指定插入的位置，每次指定插入位置都为0；则是倒序
            temp = temp.next;
        }
        return list;
    }


    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}
