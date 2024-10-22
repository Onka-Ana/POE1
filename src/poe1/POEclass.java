
package poe1;
public class POEclass 
{
   private String registeredUsername;
   private String registredPassword;
        public static String CheckUsername(String Username)
    {
        if(Username.length() > 5)
        {
            Username = "Username Invalid: Longer than 5 Characters";
        } 
        if (!Username.contains("_"))
        {
            return "Username must contain an undersroce(_)";
        }
            if (Username.length() <= 5 && Username.contains("_") )
                {
                    Username = "Valid Username!!";
                }
               else
            {
                Username = "Username Invalid: Usename does not contain Underscore";
            }
                
        return Username;
    }
        
        
       public String CheckPasswordComplexity(String Password)
       {
           if (Password.length() < 8)
           {
               return "Password must be at least 8 characters long.";
           }
           
           boolean hasUppercase = false;
           boolean hasDigit = false;
           boolean hasSpecialChar = false;
           String specialCharacters = "!@#$%^&*()";
           
           for (char c : Password.toCharArray())
           {
               if (Character.isUpperCase(c))
               {
                   hasUppercase = true;
               }
               if (Character.isDigit(c))
               {
                   hasDigit = true;
               }
               if (specialCharacters.indexOf(c) != -1)
               {
                   hasSpecialChar = true;
               }
           }
           
                    if (!hasUppercase)
                    {
                        return "Password mujst at least contain one capital letter.";
                    }
                    if (!hasDigit)
                    {
                        return "Password must at least contain one number.";
                    }
                    if (!hasSpecialChar)
                    {
                        return "Password must at least contain one special character(!@#$%^&*()).";
                    }
                        return "Password is valid.";
       }
       public String RegisterUser(String Username, String Password)
       {
         if (Username.length() != 5)
         {
             return "Username must be exactly 5 characters long.";
         }
         if (!Username.contains("_"))
         {
             return "Username must contain an underscore(_)";
         }
         
         if(Password.length() < 8 )
         {
             return "Password must be at least 8 characters long";
         }
         
         boolean hasUppercase = false;
         boolean hasDigit = false;
         boolean hasSpecialChar = false;
         String specialCharacter = "!@#$%^&*()";
         
         for (char c : Password.toCharArray())
           {
               if (Character.isUpperCase(c))
               {
                   hasUppercase = true;
               }
               if (Character.isDigit(c))
               {
                   hasDigit = true;
               }
               if (specialCharacter.indexOf(c) != -1)
               {
                   hasSpecialChar = true;
               }
           }
           
                    if (!hasUppercase)
                    {
                        return "Password mujst at least contain one capital letter.";
                    }
                    if (!hasDigit)
                    {
                        return "Password must at least contain one number.";
                    }
                    if (!hasSpecialChar)
                    {
                        return "Password must at least contain one special character(!@#$%^&*()).";
                    }
                    return "User has been registered";
       }
           
       public boolean UserLogin(String UsernameIn, String PasswordIn, String UsernameCheck , String PasswordCheck)
       {
           if (!UsernameCheck.equals(UsernameIn))
           {
               System.out.println("Username does not match.");
               return false;
           }
           if (!PasswordCheck.equals(PasswordIn))
           {
               System.out.println("Password does not match.");
               return false;
           }
           System.out.println("Login Successful!!");
           return true;
       }
       
       public String registerUser(String Username, String Password)
       {
           if (Username.length() != 5)
           {
               return "Username must be excatly 5 characters long.";
           }
           if (!Username.contains("_"))
           {
               return "Username must contain an underscore(_)";
           }
           
           if (Password.length() < 8)
           {
               return "Password must be atleast 8 characters long.";
           }
           
           boolean hasUppercase = false;
         boolean hasDigit = false;
         boolean hasSpecialChar = false;
         String specialCharacter = "!@#$%^&*()";
         
         for (char c : Password.toCharArray())
           {
               if (Character.isUpperCase(c))
               {
                   hasUppercase = true;
               }
               if (Character.isDigit(c))
               {
                   hasDigit = true;
               }
               if (specialCharacter.indexOf(c) != -1)
               {
                   hasSpecialChar = true;
               }
           }
           
                    if (!hasUppercase)
                    {
                        return "Password mujst at least contain one capital letter.";
                    }
                    if (!hasDigit)
                    {
                        return "Password must at least contain one number.";
                    }
                    if (!hasSpecialChar)
                    {
                        return "Password must at least contain one special character(!@#$%^&*()).";
                    }
                    
                    this.registeredUsername = Username;
                    this.registredPassword = Password;
                    
                    return "User has been registered";
       }
           
       public boolean loginUser(String UsernameIn, String PasswordIn)
       {
           if(!registeredUsername.equals(UsernameIn))
           {
               System.out.println("Username does not match.");
               return false;
           }
           if(!registredPassword.equals(PasswordIn))
           {
               System.out.println("Password does not match.");
               return false;
           }
           System.out.println("Login Successful");
           return true;
       }
       public String loginStatus(boolean loginSuccess)
       {
           if (loginSuccess)
           {
               return "Successful Login";
           }
           else
           {
               return "Login Fail";
           }
       }
       }

