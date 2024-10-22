
package poe1;
import java.util.Scanner;
public class POE1 
{

    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        String Username,FirstName,LastName,Password,Username2,Password2;
        
        //Checking Username
        System.out.println("Please Enter Username");
        Username = Scan.next();
        System.out.println(POEclass.CheckUsername(Username));
        
        
       //Checking Password
       POEclass validate = new POEclass();
        System.out.println("Please Enter Password");
        Password = Scan.next();
        String result = validate.CheckPasswordComplexity(Password);
        System.out.println(result);
        
        // Store FirstName & LastName
        System.out.println("Please Enter FirstName");
        FirstName = Scan.next();
        System.out.println("Please Enter LastName");
        LastName = Scan.next();
        
        //RegisterUser
       POEclass registration = new POEclass();
        System.out.println("Enter Username For Registration");
        Username2 = Scan.next();
        System.out.println("Enter Password For Registration");
        Password2 =     Scan.next();
       String result2 = registration.RegisterUser(Username2, Password2);
       System.out.println(result2);
       
       
        //LoginUser
        POEclass Check = new POEclass();
        Boolean result3 = Check.UserLogin(Username, Password, Username2, Password2);
        System.out.println(result3);
        
        
        Scanner Scan2 = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        Boolean loggedIn = taskManager.login(Scan2);
       
        if (loggedIn) 
        {
            System.out.println("Welcome to EasyKanban");
            boolean running =true;
            
            while (running)
            {
                System.out.println("/n Please select an option: ");
                System.out.println("1) Add tasks");
                System.out.println("2) Show report");
                System.out.println("2) Display all tasks");
                System.out.println("2) Display totla task hours");
                System.out.println("3) Quit");
                
                int choice = Scan2.nextInt();
                Scan2.nextLine();
                
                switch (choice)
                {
                    case 1:
                        taskManager.AddTask(Scan2);
                        break;
                        
                    case 2:
                        taskManager.ShowReport();
                        break;
                        
                    case 3:
                       taskManager.DisplayAllTasks();
                        break;
                        
                    case 4:
                        taskManager.DisplayTotalHours();
                        break;
                        
                    case 5:
                        System.out.println("Exiting the application.");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                
            }
            
        }
        else
        {
            System.out.println("Login failed. Existing application.");
        }
        Scan2.close();
    }


}
