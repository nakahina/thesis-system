import java.util.Scanner;


public class ManagerPage {
    public void displayHome(){
    int number;
    System.out.println();
    System.out.println("-----------Manager Page-----------");
    System.out.println("        1. Student System");
    System.out.println("        2. Thesis System");
    System.out.println("        3. Log Out");
    System.out.println("----------------------------------");
    System.out.println("");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Select number:");
    number = sc.nextInt();
    
    switch(number){
        case 1:
            StudentSystem ss = new StudentSystem();
            ss.studentSystem();
            break;
        case 2:
            ThesisSystem ts = new ThesisSystem();
            ts.thesisSystem();
            break;
        case 3:
            LogIn lo = new LogIn();
            lo.displayUser();
            break;
    }
    
}
}
