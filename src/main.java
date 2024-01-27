import java.util.Scanner;
public class main {
   Scanner sc = new Scanner(System.in);
      public void place()
      {
         Employee f= new Employee();
         int item,bill=0,code;
         String name,contact;
         System.out.println("*********PLACE ORDER*********");
         System.out.println(Employee.Search(0));
         // System.out.println("Enter Your name");
         // name=sc.next();
         // System.out.println("Enter Your Contact Number");
         // contact=sc.next();
         // System.out.println("How many Items you want to order");
         // item=sc.nextInt();
         // for(int i=0;i<item;i++)
         // {
         // System.out.println("Enter ItemCode for product "+(i+1));
         //    code=sc.nextInt();
         //    //bill=bill+e.Search(code);
         //    System.out.println(f.Search(2));
         // }
         //System.out.println(bill);
      }
       public static void main(String[] args)  {
         main m = new main();
        Employee e = new Employee();
        Customer p = new Customer();
      //   e.insertmenu("Pizza", 200, 0);
      //   e.insertmenu("Burger", 100, 1);
      //   e.insertmenu("Macaroni", 100, 2);
      //   e.menu();
        System.out.println(e.Search(0));
         m.place();
       //   p.placeOrder("hamza","0300", 100, 1);
      //   p.placeOrder("sharjeel","0348", 300, 2);
      //   p.placeOrder("ali","0324", 200, 3);
      //   p.viewOrder();
        
     }
}
