import java.util.ArrayList;
import java.util.Scanner;


public class ContactForm {
    public static ArrayList<String> inquiry = new ArrayList<String>();　//リストの作成
    public static ArrayList<String> studentName = new ArrayList<String>();
    
    public void contactForm(){

    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Please type your name: ");
    studentName.add(sc.nextLine());
    System.out.println("If you have any inquiries, please type : ");
    inquiry.add(sc.nextLine());
    System.out.println("Thank you !");
    StudentPage sp = new StudentPage();
    sp.displayHome();

}

    public void displayContact(){
    System.out.println();
        System.out.println("====================================");
        for (int i = 0; i < studentName.size(); i++){
        System.out.println((i + 1) + ": Student Name: " + studentName.get(i) + "\n" +
                           "   Content of inquiry: " + inquiry.get(i) + "\n");
        }
        System.out.println("====================================");
        AdminPage ad = new AdminPage();
        ad.displayHome();
}

}
