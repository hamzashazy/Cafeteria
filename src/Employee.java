public class Employee {
    static empnode head=null;
    static empnode tail=null;
    public void insertmenu(String name, int price, int code)
    {
        empnode newnode = new empnode(name,price,code);
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
    public static int Search(int code)
    {
        empnode s = head;
        while(s!=null)
        {
            if(s.code==code)
            {
                return s.price;
            }
            s=s.next;
        }
        return 0;
    }
    public void menu()
    {
     System.out.println("***************MENU***************");
     System.out.println("ITEM NAME     ITEM PRICE    ITEMCODE");
    empnode s= tail;
    while(s.prev!=null)
    {
        System.out.println(s.name+"         "+s.price+"           "+s.code);
        s=s.prev;
    }
    System.out.println(s.name+"         "+s.price+"           "+s.code);
    }
  



}