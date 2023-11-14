import java.util.ArrayList;
import java.util.Scanner;


public class StudentSystem {
    public static ArrayList<String> names = new ArrayList<String>();
    public static ArrayList<String> ids = new ArrayList<String>();
    public static ArrayList<String> emails = new ArrayList<String>();
    String again;
    
    
    public void studentSystem(){
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("-----------Student System-----------");
    System.out.println("        1) Display Students");
    System.out.println("        2) Add Students");
    System.out.println("        3) Delete Students");
    System.out.println("        4) Manager Page ");
    System.out.println("------------------------------------");
    
    System.out.println("Select number:");
    number = sc.nextInt();
    　　
    switch(number){
        case 1:
            displayStudents();
            break;
        
        case 2:
            addStudents();
            break;
        
        case 3:
            deleteStudents();
            break;
        
        case 4:
            ManagerPage mp = new ManagerPage();
            mp.displayHome();
            break;
            
    }
    
}

public void displayStudents(){
    
    boolean result = names.isEmpty();
    if (result == true){
        System.out.println();
        System.out.println("The Student list is empty");
        studentSystem();
    }else{
        System.out.println();
        System.out.println("====================================");
        for (int i = 0; i < names.size(); i++){
        System.out.println((i + 1) + ": Student Name: " + names.get(i) + "\n" +
                           "   Student Id: " + ids.get(i) + "\n" +
                           "   Student Email: " + emails.get(i) + "\n");
        }
        System.out.println("====================================");
        System.out.println("There are " + names.size() + " Students");
        System.out.println();
        studentSystem();
    }
}

public void addStudents(){
    Scanner sc = new Scanner(System.in);
    String name;
    System.out.println();
    System.out.println("Please enter a Student name: ");
    name = sc.next();
    names.add(name);
    
    String id;
    System.out.println("Please enter a Student ID: ");
    id = sc.next();
    ids.add(id);
    
    String email;
    System.out.println("Please enter a Student email: ");
    email = sc.next();
    emails.add(email);
    
    System.out.println();
    System.out.println("Succesfully added !");
    System.out.println();
    System.out.println("Do you want to add more Students (Y/N): ");
    again = sc.next();
    
    if(again.equalsIgnoreCase("Y")){
        addStudents();
    }else if(again.equalsIgnoreCase("N")){
        studentSystem();
    }else{
        System.out.println("Invalid Choice");
    }
    
}

public void deleteStudents(){
    Scanner sc = new Scanner(System.in);
    int delNumber;
    System.out.println();
        System.out.println("====================================");
        for (int i = 0; i < names.size(); i++){
        System.out.println((i + 1) + ": Student Name: " + names.get(i) + "\n" +
                           "   Student Id: " + ids.get(i) + "\n" +
                           "   Student Email: " + emails.get(i) + "\n");
        }
        System.out.println("====================================");
    System.out.println("Please enter a number you want to delete: ");
    delNumber = sc.nextInt();
    names.remove(delNumber - 1);
    ids.remove(delNumber - 1);
    emails.remove(delNumber - 1);
    studentSystem();
}

}
