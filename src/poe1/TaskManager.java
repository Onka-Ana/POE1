package poe1;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;
public class TaskManager 
{
   public ArrayList<Task>Tasks = new ArrayList<>();
   public int taskCount = 0;
  
  public boolean login(Scanner scanner)
  {
      System.out.println("Enter Username: ");
      String Username = scanner.nextLine();
      System.out.println("Enter Password: ");
      String Password = scanner.nextLine();
      
      if (Username.equals("user") && Password.equals("Password"))
      {
          return true;
      }
      return false;
  }
  public void AddTask(Scanner scanner)
  {
      String TaskName =JOptionPane.showInputDialog("Enter task name:");
      String TaskDescription = JOptionPane.showInputDialog("Enter Task Description (Max 50 Characters): ");
      String DeveloperDetails = JOptionPane.showInputDialog("Enter developer's first and lastname: ");
      String TaskDurationInput = JOptionPane.showInputDialog("Enter task duration in hours: ");
      int TaskDuration = Integer.parseInt(TaskDurationInput);
      
      String[] TaskStatuses = {"To Do", "Doing" , "Done"};
      String TaskStatus = (String) JOptionPane.showInputDialog(null,"Select task status: ",
              "Task Status", JOptionPane.QUESTION_MESSAGE, null, TaskStatuses, TaskStatuses[0]);
      
     Task task = new Task(TaskName, taskCount, TaskDescription, DeveloperDetails, TaskDuration, TaskStatus);
     
      if (task.checkTaskDescription())
      {
          Tasks.add(task);
          taskCount++;
          System.out.println("Task Added Successfully!! ");
      }
      else
      {
          System.out.println("Failed to add task due to invalid description. ");
      }
      
      
      }
       public void ShowReport()
       {
           JOptionPane.showMessageDialog(null,"Coming Soon");
       }
       
       
       
       public void DisplayAllTasks()
       {
         for (Task task : Tasks)
         {
             task.DisplayTaskDetails();
         }
       }
       
       public void DisplayTotalHours()
       {
           int TotalHours = 0;
           for(Task task : Tasks)
           {
               TotalHours += task.getTaskDuration();
           }
           JOptionPane.showMessageDialog(null, "Total number of hours across all tasks: " + TotalHours);
       }
}

