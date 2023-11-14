import java.util.Scanner;


public class StudentPage {
    public void displayHome(){
    int number;
    System.out.println();
    System.out.println("-----------Student Page-----------");
    System.out.println("        1. View Theses");
    System.out.println("        2. Contact form");
    System.out.println("        3. Log Out");
    System.out.println("----------------------------------");
    System.out.println("");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Select number:");
    number = sc.nextInt();
    
    switch(number){
        case 1:
            ThesisSystem ts = new ThesisSystem();
            ts.displayThesis();
            displayHome();
            break;
        case 2:
            ContactForm cf = new ContactForm();
            cf.contactForm();
            break;
        case 3:
            LogIn lo = new LogIn();
            lo.displayUser();
            break;
    }
    
}
}
