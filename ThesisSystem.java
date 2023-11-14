import java.util.ArrayList;
import java.util.Scanner;


public class ThesisSystem {
    public static ArrayList<String> titles = new ArrayList<String>();
    public static ArrayList<String> authors = new ArrayList<String>();
    public static ArrayList<String> dates = new ArrayList<String>();
    String again;
    
    
    public void thesisSystem(){
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("-----------Thesis System-----------");
    System.out.println("        1) Display Thesis");
    System.out.println("        2) Add Thesis");
    System.out.println("        3) Delete Thesis");
    System.out.println("        4) Manager Page ");
    System.out.println("------------------------------------");
    
    System.out.println("Select number:");
    number = sc.nextInt();
    
    switch(number){
        case 1:
            displayThesis();
            thesisSystem();
            break;
        
        case 2:
            addThesis();
            break;
        
        case 3:
            deleteThesis();
            break;
        
        case 4:
            ManagerPage mp = new ManagerPage();
            mp.displayHome();
            break;
            
    }
    
}

public void displayThesis(){
    
    boolean result = titles.isEmpty();
    if (result == true){
        System.out.println();
        System.out.println("The Thesis list is empty");
    }else{
        System.out.println();
        System.out.println("====================================");
        for (int i = 0; i < titles.size(); i++){
        System.out.println((i + 1) + ": Thesis title: " + titles.get(i) + "\n" +
                           "   Thesis author: " + authors.get(i) + "\n" +
                           "   Thesis issued date: " + dates.get(i) + "\n");
        }
        System.out.println("====================================");
        System.out.println("There are " + titles.size() + " Theses");
        System.out.println();
    }
}

public void addThesis(){
    Scanner sc = new Scanner(System.in);
    String title;
    System.out.println();
    System.out.println("Please enter a Thesis name: ");
    title = sc.next();
    titles.add(title);
    
    String author;
    System.out.println("Please enter a Thesis ID: ");
    author = sc.next();
    authors.add(author);
    
    String date;
    System.out.println("Please enter a Thesis email: ");
    date = sc.next();
    dates.add(date);
    
    System.out.println();
    System.out.println("Succesfully added !");
    System.out.println();
    System.out.println("Do you want to add more Thesis (Y/N): ");
    again = sc.next();
    
    if(again.equalsIgnoreCase("Y")){
        addThesis();
    }else if(again.equalsIgnoreCase("N")){
        thesisSystem();
    }else{
        System.out.println("Invalid Choice");
    }
    
}

public void deleteThesis(){
    Scanner sc = new Scanner(System.in);
    int delNumber;
    System.out.println();
        System.out.println("====================================");
        for (int i = 0; i < titles.size(); i++){
        System.out.println((i + 1) + ": Thesis Name: " + titles.get(i) + "\n" +
                           "   Thesis Id: " + authors.get(i) + "\n" +
                           "   Thesis Email: " + dates.get(i) + "\n");
        }
        System.out.println("====================================");
    System.out.println("Please enter a number you want to delete: ");
    delNumber = sc.nextInt();
    titles.remove(delNumber - 1);
    authors.remove(delNumber - 1);
    dates.remove(delNumber - 1);
    thesisSystem();
}

}
