public class Customer {
    Cusnode head=null;
    Cusnode tail=null;
    public void placeOrder(String name, String contact, int bill, int orderNo)
    {
    Cusnode newnode = new Cusnode(name, contact, bill, orderNo) ;
    if(head==null)
    {
        head=newnode;
        tail=newnode;
    } 
    else
    {
        newnode.next=head;
        head.prev=newnode;
        head=head.prev;
    }
    }
    public void viewOrder()
    {
        System.out.println("***************Orders***************");
        System.out.println("CUSTOMER NAME     CONTACT NUMBER    ORDER NO     BILL");
        Cusnode s= tail;
    while(s.prev!=null)
    {
        System.out.println(s.name+"         "+s.contact+"           "+s.orderNo+"           "+s.bill);
        s=s.prev;
    }
    System.out.println(s.name+"         "+s.contact+"           "+s.orderNo+"           "+s.bill);
    }
}
