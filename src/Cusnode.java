public class Cusnode {
    String name;
    String contact;
    int bill;
    int orderNo;
    Cusnode next;
    Cusnode prev;
    public Cusnode(String name, String contact, int bill,int orderNo) {
        this.name = name;
        this.contact = contact;
        this.bill = bill;
        this.orderNo = orderNo;
        this.next = null;
        this.prev = null;
    }
}
