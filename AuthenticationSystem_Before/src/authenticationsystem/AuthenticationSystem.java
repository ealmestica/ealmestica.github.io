/*
 * Elijah Almestica - IT145 
 * 7-1 Final Project: Zoo Authentication System
 * AuthenticationSystem.java - Class definition
 */
package authenticationsystem;

import java.util.Scanner;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.io.IOException;

public class AuthenticationSystem {
                   
   public static void main(String[] args) throws Exception {
   //Initialized variables
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      PasswordDigest userPassword = new PasswordDigest ();
      String option = "1";
      boolean end = false;
      String username = " ";
      String password = " ";
      boolean credentialMatch = false;
      int userAttempts = 0;
      Scanner credentialInput = null;
    
   //Variables useful for matching credentials
      String credentialRecord = " ";
      String credUsername = " ";
      String credMD5 = " ";
      String credProfile = " ";
      
   // Loop to display opening zoo message as default.
      while (end == false) {
         
   //Opening Message menu
      System.out.printf("\n\n********************************************************************\n");
      System.out.printf("*                     88888888 .d88b.  .d88b.                      *\n"); 
      System.out.printf("*    ,-'''''--,-'')      d88P d88''88bd88''88b    /(/./) ____      *\n");
      System.out.printf("*   :|        \\; '|     d88P  888  888888  888    \\__' ''    ''\\.  *\n");
      System.out.printf("*   ;| :',_,: : '\\|    d88P   Y88..88PY88..88P      '(  .-(  ))\\   *\n");
      System.out.printf("*   |_||   |_|   ||    88888888 \"Y88P\"  \"Y88P\"       /_/   \\_\\\\    *\n");
      System.out.printf("*                                                                  *\n");
      System.out.printf("*                  ZOO FILE AUTHENTICATION SYSTEM                  *\n");
      System.out.printf("*                          Instructions:                           *\n");
      System.out.printf("*                 1. Log in with your credentials                  *\n");
      System.out.printf("*                 2. Log out                                       *\n");
      System.out.printf("********************************************************************\n\n");
     
      System.out.println("Please enter number for what you would like to do: ");
      option = scnr.nextLine();
         
         if (option.equals("1")) {
   
   // For loop to iterate user attempt inputs from 1 through 3
            for (userAttempts = 1; userAttempts <= 3; ++userAttempts) {
               System.out.println("\nEnter username: ");
               username = scnr.nextLine(); 

               System.out.println("\nEnter password: ");
               password = scnr.nextLine();
         
   // Method mutator from PasswordDigest class to set password                     
               userPassword.setPassword(password);
                     
   // Read the Credentials File       
               fileByteStream = new FileInputStream("C:\\credentials.txt");
               inFS = new Scanner(fileByteStream); 
              
   // While loop to iterate each line in the file      
               while (inFS.hasNextLine()) {                
                  credentialRecord = inFS.nextLine(); //Takes each line from Credentials into its own string
                  String[] tokens = credentialRecord.split("\t"); //Splits individual line string into each element
                  credUsername = tokens[0]; //Index 0 is the username
                  credMD5 = tokens[1]; //Index 1 is the MD5 Hash
                  credProfile = tokens [2]; //Inddex 2 is the type of profile
                   
   // Matches the inputted credentials against the credentials in the file
                  if (username.equals(credUsername) && (credMD5.equals(userPassword.getHash()))) {
                     credentialMatch = true;
                     userAttempts = 4;
                     break; 
                  }
                  else {
                     credentialMatch = false;
                  }
               }
               
   // Outputs invalid credentials if inputted entry is invalid
                  if (credentialMatch == false && userAttempts < 3) {
                     System.out.println("\nInvalid credentials! Please try again");
                  }
               
   // Will exit the program if inputted credential exceeds 3 count
                  else if (userAttempts == 3) {
                     System.out.println("\nInvalid credentials! Exiting program."); 
                  }
   
   //Closes the credential file
                  fileByteStream.close();
                  }
   
   // Opens file if appropriate credentials are correct(equals true) 
                  if (credentialMatch == true) {
   
   // Opens file based on the appropriate profile when credentials are correct 
   // Matchest the first character of the username in the file   
                  System.out.println("\nAccessing role file for " + credProfile + "...\n");   
                  switch (credProfile.charAt(0)) {
                     case 'a':
                        fileByteStream = new FileInputStream("C:\\admin.txt");
                        break;
                           
                     case 'v':
                        fileByteStream = new FileInputStream("C:\\veterinarian.txt");
                        break;
                           
                     case 'z':
                        fileByteStream = new FileInputStream("C:\\zookeeper.txt");
                        break;
                  
                     default:
                        break;
                  }
   // Reading file based on the profile               
                  inFS = new Scanner(fileByteStream);
                  while (inFS.hasNextLine()) {
                     System.out.println(inFS.nextLine());
                  }
   
   // Closing useer profile               
                  System.out.println("\nClosing the " + credProfile + " file.");                           
                  fileByteStream.close();
   
                  System.out.println("\nReturning to main menu...");      
            }
         }
   
   // If user selects to exit the program.
         else if (option.equals("2")) {
            end = false;
            System.out.println("\nYou have chosen to log off. Thank you for using our system.\n");
            System.out.println("                .-----------------._,,                             ");
            System.out.println("                | Elijah Almestica (_\")=                           ");
            System.out.println("                |   SNHU - IT 145   |||                __          ");
            System.out.println("                |      Goodbye!     ||#\\_____       .-/  \\         ");
            System.out.println("         ssgg   |-------------------|\\# # # #\\    .''  ..'----,_   ");
            System.out.println("    ____SG ..]  |       |/          | \\##_#_#/\\ =:.'-\\         )\\  ");
            System.out.println(" ,-( _   SS(_9)_|      _(\")         | |/|/\\|\\|   ::   |  ,_   /  ` ");
            System.out.println("/ (_____;-.____;;    o(_,\\\\         | I I  I I    `   [|_/\\\\_]     ");
            break;
         } 
         
   // If user input is not one of the options. Prompts user to select from menu.      
         else {
            System.out.println("\nPlease only select from available options.");
         }
         }
   }
}


    

