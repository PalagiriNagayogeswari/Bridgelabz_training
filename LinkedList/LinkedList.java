
//created main LinkedListclass
public class LinkedList
{
    Node head;

    //Created Node class to represent a single node in linkedlist
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //addFirst method to add at starting of linkedlist
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null)
            head=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    //addlast to add at last of the linkedlist
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null)
            head=newNode;
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }

    //size method to return the size of the linkedlist
    public int size(Node head){
        Node curr=head;
        int size=1;
        while(curr.next!=null){
            size++;
            curr=curr.next;
        }
        return size;
    }


    //created a method to add at specific index in the linkedlist
    public void addAtIndex(int data,int index){
        Node newNode=new Node(data);
        if(head==null)
            head=newNode;
        else if(index==0)
            addFirst(data);
        else if(index==size(head)){
            addLast(data);
        }
        else{
            int count=1;
            Node curr=head;
            while(count<index){
                curr=curr.next;
                count++;
            }
            newNode.next=curr.next;
            curr.next=newNode;

        }
    }


    //created a method to remove the first element and return it.
    public int pop(){
        Node curr=head;
        if(head==null)
            System.out.println("List is Empty");
        else{
            head=head.next;
            //curr.next=null;
            return curr.data;
        }
        return curr.data;
    }

    //created a method to remove the last element of linkedlist and return it.
    public int popLast(){
        Node curr=head;
        int temp=0;
        if(head==null)
            System.out.println("List is Empty");
        else{
            while(curr.next.next!=null){
                curr=curr.next;
            }
            temp=curr.next.data;
            curr.next=null;
        }
        return temp;
    }

    //method to print the linkedlist.
    public void print(){
        Node curr=head;
        while(curr.next!=null){
            System.out.print(curr.data+"---->");
            curr=curr.next;
        }
        System.out.print(curr.data);
    }

    //created a method to add the element after a specific element.
    public void addAfterElement(int ele,int data){
        Node newNode=new Node(data);
        Node curr=head;
        while(curr.data!=ele){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;

    }

    //created a method to delete a specific element.
    public int deleteTheElement(int ele){
        Node curr=head;
        while(curr.next.data!=ele){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return size(head);
    }


    //main method.
    public static void main(String[] args){

        //Use case 1 and Use case 2.
        LinkedList LL=new LinkedList();
        LL.addFirst(70);
        LL.addFirst(30);
        LL.addFirst(56);
        System.out.println("Adding First-USE CASE 2");
        LL.print();

        System.out.println();

        //use case 3
        LinkedList LL1=new LinkedList();
        LL1.addFirst(56);
        LL1.addLast(30);
        LL1.addLast(70);
        System.out.println("Adding LAST-USE CASE 3");
        LL1.print();

        System.out.println();

        //use case 4
        LinkedList LL2=new LinkedList();
        LL2.addFirst(56);
        LL2.addLast(70);
        LL2.addAtIndex(30,1);
        System.out.println("Adding At Middle-USE CASE 4");
        LL2.print();

        System.out.println();

        //use case 5
        LinkedList LL3=new LinkedList();
        LL3.addFirst(56);
        LL3.addLast(30);
        LL3.addLast(70);
        System.out.println("USE CASE 5-Before Deletion: ");
        LL3.print();
        System.out.println();
        int res1= LL3.pop();
        System.out.println("USE CASE 5-After Deletion: ");
        LL3.print();



        System.out.println();

        //use case 6
        LinkedList LL4=new LinkedList();
        LL4.addFirst(56);
        LL4.addLast(30);
        LL4.addLast(70);
        System.out.println("USE CASE 6-Before Deletion: ");
        LL4.print();
        System.out.println();
        int res2=LL4.popLast();
        System.out.println("USE CASE 6-After Deletion: ");
        LL4.print();

        System.out.println();


        //use case 7
        LinkedList LL5=new LinkedList();
        LL5.addFirst(56);
        LL5.addLast(30);
        LL5.addLast(70);
        System.out.println("USE CASE 7-Before Adding: ");
        LL5.print();

        System.out.println();

        LL5.addAfterElement(30,40);
        System.out.println("USE CASE 7-After Adding: ");
        LL5.print();
        System.out.println();

        //use case 8
        int res= LL5.deleteTheElement(40);
        LL5.print();
        System.out.println();
        System.out.println(res);
    }
}
