public class RLLDemo
{
    public static void main(String[] args)
    {
        RLinkedList rList = new RLinkedList();
        Node curr = new Node();
        rList.head = curr;

        //Add the number 100-200 to the rList
        for(int i = 100; i <= 200; i++)
        {
            curr.data = i;
            if(i < 200)
            {
                curr.next = new Node();
            }
            curr = curr.next;
        }

        //Print out each element in the linked list
        curr = rList.head;
        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }

        //Print each two elements multiplied together
        curr = rList.head;
        Node prev = null;

        while(curr != null)
        {
            if(prev != null)
            {
                System.out.println(curr.data * prev.data);
            }
            prev = curr;
            curr = curr.next;
        }

        //Add 5000 after the fifth element in the linked list
        int i = 0;
        while(curr != null && i <= 4)
        {
            if(i == 4)
            {
                Node n = new Node();
                n.next = curr.next;
                n.data = 5000;
                curr.next = n;
            }
            i++;
            curr = curr.next;
        }

        //Add two at the beginning of the linked list
        Node n = new Node();
        n.next = rList.head.next;//Will throw an error if rList.head is null.
        n.data = 2;
        rList.head.next = n;

        //Add 7 to the end of the linked list
        curr = rList.head;
        while(curr != null && curr.next != null)
        {
            curr = curr.next;
        }

        n = new Node();
        n.data = 7;

        curr.next = n;
    }
}
