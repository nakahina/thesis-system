import java.util.ArrayList;
import java.util.Scanner;

public class AdminPage {
    
 public void displayHome() {
    int number1;
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("-----------Admin Page-----------");
    System.out.println("        1) Manager System");
    System.out.println("        2) Student inquiry");
    System.out.println("        3) Log out");
    System.out.println("--------------------------------");
    
    System.out.println("Select number:");
    number1 = sc.nextInt();
    
    switch(number1){
        case 1:
            ManagerSystem ms = new ManagerSystem();
            ms.managerSystem();
            break;
        
        case 2:
            ContactForm cf = new ContactForm();
            cf.displayContact();
            break;
        
        case 3:
           LogIn lo = new LogIn();
           lo.displayUser();
           break;       
            
    }
}

        
}
