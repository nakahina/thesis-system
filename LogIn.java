import java.util.Scanner;

public class LogIn {
    
    String userName;　　　
    String admin = "admin";
    String manager = "manager";
    String student = "student";
    
    String password;
    String adminPassword = "123";
    String managerPassword = "456";
    String studentPassword = "789";
    
public void displayUser(){
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("****** Welcome to Thesis repository *****");
    System.out.println("-----------------Log In------------------");
    System.out.println("              1) Admin");
    System.out.println("              2) Manager");
    System.out.println("              3) Student");
    System.out.println("-----------------------------------------");
    
    System.out.println("Select number:");
    number = sc.nextInt();
    
    switch(number){
        case 1:
            System.out.println("Hello Admin !");
            System.out.println();
            login();
            break;
        case 2:
            System.out.println("Hello Asistant Maager !");
            System.out.println();
            login();
            break;
        case 3:
            System.out.println("Hello Student !");
            System.out.println();
            login();
            break;
    }
    
}
    
public void login(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Username: ");
    userName = sc.next();
    
    System.out.println("Enter Password: ");
    password = sc.next();
    
    
    if (userName.equals(admin) && password.equals(adminPassword)){
        System.out.println();
        System.out.println("Succesfully logged in !");
        AdminPage ad = new AdminPage();
        ad.displayHome();
        
        
    }else if (userName.equals(manager) && password.equals(managerPassword)){
        System.out.println();
        System.out.println("Succesfully logged in !");
        ManagerPage mp = new ManagerPage();　//インスタンスの生成
        mp.displayHome();
        
        
    }else if (userName.equals(student) && password.equals(studentPassword)){
        System.out.println();
        System.out.println("Succesfully logged in !");
        StudentPage sp = new StudentPage();
        sp.displayHome();
        
        
    }else {
        System.out.println();
        System.out.println("Incorrect Username or Password");
        System.out.println();
        login();
    }
}
    
}
