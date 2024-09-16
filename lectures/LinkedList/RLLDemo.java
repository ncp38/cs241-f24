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
    }
}
