class QueueNode
{
    int value;
    QueueNode link;
    QueueNode(int val)
    {
        this.value = val;
        link = null;
    }
}
public class queue {
    QueueNode head;
    queue()
    {
        head = null;
    }
    void enqueue(int value)
    {
        QueueNode n = new QueueNode(value);
        if(head == null)
            head = n;
        else
        {
            QueueNode temp = head;
            while(temp.link!=null)
            {
                temp=temp.link;
            }
            temp.link = n;
        }
    }
    int dequeue()
    {
        QueueNode temp = head;
        head = temp.link;
        return temp.value;
    }
    boolean isEmpty()
    {
        return head == null;
    }
    void display()
    {
        QueueNode temp = head;
        while(temp.link!=null) {
            System.out.print(temp.value+"->");
            temp = temp.link;
        }
        System.out.println(temp.value);
    }
    public static void main(String[] args)
    {
        queue q = new queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        System.out.println("The queue after enqueue operation");
        q.display();
        q.dequeue();
        System.out.println("The queue after dequeue operation");
        q.display();
        if(q.isEmpty())
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");
    }
}


