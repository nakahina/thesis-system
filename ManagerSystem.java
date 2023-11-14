import java.util.ArrayList;
import java.util.Scanner;


public class ManagerSystem {
    
    public static ArrayList<String> names = new ArrayList<String>();
    public static ArrayList<String> ids = new ArrayList<String>();
    public static ArrayList<String> emails = new ArrayList<String>();
    String again;
    
    
    public void managerSystem(){
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("-----------Manager System-----------");
    System.out.println("        1) Display Managers");
    System.out.println("        2) Add Managers");
    System.out.println("        3) Delete Managers");
    System.out.println("        4) Admin Page ");
    System.out.println("------------------------------------");
    
    System.out.println("Select number:");
    number = sc.nextInt();
    
    switch(number){
        case 1:
            displayManager();
            break;
        
        case 2:
            addManager();
            break;
        
        case 3:
            deleteManager();
            break;
        
        case 4:
            AdminPage ad = new AdminPage();
            ad.displayHome();
            break;
            
    }
    
}

public void displayManager(){
    
    boolean result = names.isEmpty();
    if (result == true){
        System.out.println();
        System.out.println("The manager list is empty");
        managerSystem();
    }else{
        System.out.println();
        System.out.println("====================================");
        for (int i = 0; i < names.size(); i++){
        System.out.println((i + 1) + ": Manager Name: " + names.get(i) + "\n" +
                           "   Manager Id: " + ids.get(i) + "\n" +
                           "   Email: " + emails.get(i) + "\n");
        }
        System.out.println("====================================");
        System.out.println("There are " + names.size() + " Managers");
        System.out.println();
        managerSystem();
    }
}

public void addManager(){
    Scanner sc = new Scanner(System.in);
    String name;
    System.out.println();
    System.out.println("Please enter a manager name: ");
    name = sc.next();
    names.add(name);
    
    String id;
    System.out.println("Please enter a manager ID: ");
    id = sc.next();
    ids.add(id);
    
    String email;
    System.out.println("Please enter a manager email: ");
    email = sc.next();
    emails.add(email);
    
    System.out.println();
    System.out.println("Succesfully added !");
    System.out.println();
    System.out.println("Do you want to add more managers (Y/N): ");
    again = sc.next();
    
    if(again.equalsIgnoreCase("Y")){
        addManager();
    }else if(again.equalsIgnoreCase("N")){
        managerSystem();
    }else{
        System.out.println("Invalid Choice");
    }
    
}

public void deleteManager(){
    Scanner sc = new Scanner(System.in);
    int delNumber;
    System.out.println();
        System.out.println("====================================");
        for (int i = 0; i < names.size(); i++){
        System.out.println((i + 1) + ": Manager Name: " + names.get(i) + "\n" +
                           "   Manager Id: " + ids.get(i) + "\n" +
                           "   Email: " + emails.get(i) + "\n");
        }
        System.out.println("====================================");
    System.out.println("Please enter a number you want to delete: ");
    delNumber = sc.nextInt();
    names.remove(delNumber - 1);
    ids.remove(delNumber - 1);
    emails.remove(delNumber - 1);
    managerSystem();
}

}
