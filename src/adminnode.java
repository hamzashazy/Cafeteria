public class adminnode {
    String id;
    String pswd;
    adminnode next;
    adminnode prev;
    public adminnode(String id, String pswd) {
        this.id = id;
        this.pswd = pswd;
        this.next = null;
        this.prev = null;
    }
    
    }

