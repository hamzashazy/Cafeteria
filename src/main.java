import java.util.Scanner;
public class main {
   Scanner sc = new Scanner(System.in);
      public void place(Employee e,Customer p)
      {
         e.menu();
         int item,bill=0,code,orderNo=1;
         String name,contact;
         System.out.println("*********PLACE ORDER*********");
         System.out.println(e.Search(2));
         System.out.println("Enter Your name");
         name=sc.next();
         System.out.println("Enter Your Contact Number");
         contact=sc.next();
         System.out.println("How many Items you want to order");
         item=sc.nextInt();
         System.out.println("Your Order is placed Successfuly");
         for(int i=0;i<item;i++)
         {
         System.out.println("Enter ItemCode for product "+(i+1));
            code=sc.nextInt();
            bill=bill+e.Search(code);
         }
         p.placeOrder(name, contact, bill, orderNo);
      }

      public void addItem(Employee e)
      {
         String name;
         int item,price;
         System.out.println("Enter Item name");
         name=sc.next();
         System.out.println("Enter item Price");
         price=sc.nextInt();
         System.out.println("Enter item code");
         item=sc.nextInt();
         e.insertItem(name, price, item);
      }
      public void deleteItem(Employee e)
      {
         int code;
         System.out.println("Enter Item code");
         code=sc.nextInt();
         e.deleteProduct(code);
      }
      public void Emp(Employee e, Customer c,main m)
      {
         System.out.println("MANAGE ORDERS\n1-View Orders\n2-Submit order\nUPDATE MENU\n3-Add new Item\n4-Remove any Item");
            int opt = sc.nextInt();
            switch (opt) {
               case 1:
                  c.viewOrder();
                  m.backEmp(e, c, m);
                  break;
               case 2:
                  c.submitOrder();
                  m.backEmp(e, c, m);
                     break;
               case 3:
                  m.addItem(e);
                  m.backEmp(e, c, m);
                     break;
               case 4:
                  m.deleteItem(e);
                  m.backEmp(e, c, m);
                     break;
               default:
                  break;
            }
      }
      public void empMenu(Employee e, Customer c,main m)
      {
         System.out.println("Enter Username");
         String user=sc.next();
         System.out.println("Enter Password");
         String pwd=sc.next();
         if(e.username.equals(user)&&e.pswd.equals(pwd))
         {
            m.Emp(e, c, m);
         }
         else
         {
            System.out.println("Username or Password is incorrect ");
         }
      }
      
      public void backEmp(Employee e, Customer c, main m)
      {
         System.out.println("1-back\n2-back to main Menu");
                  int op=sc.nextInt();
                  switch (op) {
                     case 1:
                     m.Emp(e, c, m);
                     break;
                     case 2:
                     m.mainMenu(e, c, m);
                     break;
                  }
      }
      public void backCus(Employee e, Customer c, main m)
      {
         System.out.println("1-back\n2-back to main Menu");
                  int op=sc.nextInt();
                  switch (op) {
                     case 1:
                     m.cusMenu(e, c, m);
                     break;
                     case 2:
                     m.mainMenu(e, c, m);
                     break;
                  }
      }
      public void cusMenu(Employee e, Customer c,main m)
      {

            System.out.println("CUSTOMER INTERFACE\n1-View Menu\n2-Place Order");
            int opt = sc.nextInt();
            switch (opt) {
               case 1:
                  e.menu();
                  m.backCus(e, c, m);
                  break;
               case 2:
                  m.place(e, c);
                  m.backCus(e, c, m);
                     break;
               default:
                  break;
            }
         }
         
      public void mainMenu(Employee e, Customer p,main m)
      {
         System.out.println("********************CAFETERIA MANAGEMENT SYSTEM********************");
         System.out.println("1-Admin\n2-Employee\n3-Customer");
         int opt = sc.nextInt();
         switch (opt) {
            case 1:
            System.out.println("Admin is Sleeping");
               break;
            case 2:
            m.empMenu(e, p, m);
               break;
            case 3:
            m.cusMenu(e, p, m);
               break;
            default:
               break;
         }
      }
       public static void main(String[] args)  {
         main m = new main();
        Employee e = new Employee();
        Customer p = new Customer();
        e.insertItem("Pizza", 200, 0);
        e.insertItem("Burger", 100, 1);
        e.insertItem("Macaroni", 100, 2);
        p.placeOrder("hamza","0300", 100, 10);
        p.placeOrder("sharjeel","0348", 300, 20);
        p.placeOrder("ali","0324", 200, 30);
        m.mainMenu(e, p, m);
        
     }
}
