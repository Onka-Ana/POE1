
package poe1;

import javax.swing.JOptionPane;

public class Task 
{
   String TaskName;
   int TaskNumber;
   String TaskDescription;
   String DeveloperDetails;
   int TaskDuration;
   String TaskStatus;
   String TaskId;
   
   public Task(String NameofTask, int NumberofTask, String DescriptionofTask, String DeveloperDetailsIn, int TaskDurationIn, String TaskStatusIn)
   {
       NameofTask = TaskName;
       NumberofTask = TaskNumber;
       DescriptionofTask =  TaskDescription;
       DeveloperDetailsIn = DeveloperDetails;
       TaskDurationIn = TaskDuration;
       TaskStatusIn = TaskStatus;
       TaskId = generateTaskID();
   }
   
   private String generateTaskId()
   {
       String TaskId = TaskName.substring(0,2).toUpperCase() + ":" + TaskNumber + ":" + DeveloperDetails.substring(DeveloperDetails.length() - 3).toUpperCase();
       return TaskId;
   }

   public boolean checkTaskDescription()
   {
       if (TaskDescription.length() > 50) 
               {
                   JOptionPane.showMessageDialog(null,"Please enter a task desrciption of less than 50 characters");
                   return false;
               }
       return true;
   }
   
   private String generateTaskID()
   {
       String TaskId = TaskName.substring(0,2).toUpperCase() + ":" + TaskNumber + ":" + DeveloperDetails.substring(DeveloperDetails.length() - 3).toUpperCase();
       return TaskId;
   }
   
   public void DisplayTaskDetails()
   {
       if(!checkTaskDescription())
       {
           return;
       }
       String message = "Task Status: " + TaskStatus + 
               "\nDeveloper Details: " + DeveloperDetails +
               "\nTask Number: " + TaskNumber + 
               "\nTask Name: " + TaskName + 
               "\nTask Description: " + TaskDescription + 
               "\nTask ID: " + TaskId + 
               "\nTask Duration: " + TaskDuration + " hours";
       
     JOptionPane.showMessageDialog(null, message);
   }
   
   public String getTaskName()
   {
       return TaskName;
   }
   public void setTaskNumber(String NameofTask)
   {
       TaskName = NameofTask;
   }
   
   public int getTaskNumber()
   {
       return TaskNumber;
   }
   
   public void setTaskNumber(int NumberofTask)
   {
       TaskNumber = NumberofTask;
   }
   
   public String getTaskDescription()
   {
       return TaskDescription;
   }
   
   public void setTaskDescription(String DescriptionofTask)
   {
       TaskDescription = DescriptionofTask;
   }
   
   public String getDeveloperDetails()
   {
       return DeveloperDetails;
   }
   
   public void setDeveloperDetails(String DeveloperDetailsIn)
   {
       DeveloperDetails = DeveloperDetailsIn;
   }
   
   public int getTaskDuration()
   {
       return TaskDuration;
   }
   
   public void setTaskDuration(int TaskDurationIn)
   {
       TaskDuration = TaskDurationIn;
   }
   
   public String getTastStatus()
   {
       return TaskStatus;
   }
   
   public void setTaskStatus(String TaskStatusIn)
   {
       TaskStatus = TaskStatusIn;
   }
}
