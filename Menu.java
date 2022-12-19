//import java.util.Arrays;
import java.util.Scanner;

class Menu{

  //this is adding the checkmarks at the end if a questions has been correctly completed
  private static String[] done = {"","","","","","",""};// = new String[]{"","","","","",""};

  // like the name, prints out the menu and tells users what to enter. from here calls the questions
  public static void printMenu(String name){

    Scanner read = new Scanner(System.in);

    //checker to see if user has all checkmarks
    boolean con = false;
    for(String y : done){
      //if a single index in done is not a y, con, short for continue, is true, then the user should continue the program
      if(!y.equals("y")){
        con = true;
      }
    }

    //while the program should continue, meaning not every question has checkmarks
    while(con){
      //clearing the screen
      System.out.print("\033[H\033[2J");  
      System.out.flush(); 

      //checking if all assignments done
      con = false;
      for(String y : done){
        //if a single index in done is not a y, con, short for continue, is true, then the user should continue the program
        if(!y.equals("✔")){
          con = true;
        }
      }
      if(con == false){ // breaks out of while loop where menu is running
        break;
      }
      
      //question + ✔
      System.out.println("What level would you like to try to do " + name + "?" );
      System.out.println("Please type in number of activity: ");
      System.out.println("0 - Initializing an array " + done[0]);
      System.out.println("1 - Initializing an empty 2D array " + done[1]);
      System.out.println("2 - Initializing a 2D int array " + done[2]);
      System.out.println("3 - Calling specific indices " + done[3]);
      System.out.println("4 - Nested looping and adding to an array " + done[4]);
      System.out.println("5 - Better naviagate 2D arrays " + done[5]);
      System.out.println("6 - Initializing a 3D array " + done[6]);
  
      //checker if input isn't a number
      String input = read.nextLine();
      while(!input.equals("0") && !input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4") && !input.equals("5") && !input.equals("6")){
        System.out.println("\nThat is not valid " + name + ".");
        input = read.nextLine();
      }
      
      // if statements for which question the user wishes to enter
      // the second if in each one is calling the respective function in Problems and that returns y or n, which it checks to put ✔ or not
      // if a user accidently puts ✔, they can also go back into a problem and change y to n, and get rid of the ✔
      if(input.equals("0")){
        if(Problems.Q0(name).equals("y")){
          done[0] = "✔";
        }
        else{
          done[0] = "";
        } 
      }
      else if(input.equals("1")){
        if(Problems.Q1(name).equals("y")){
          done[1] = "✔";
        }
        else{
          done[1] = "";
        }
      }
      else if(input.equals("2")){
        if(Problems.Q2(name).equals("y")){
          done[2] = "✔";
        }
        else{
          done[2] = "";
        }
      }
      else if(input.equals("3")){
        if(Problems.Q3(name).equals("y")){
          done[3] = "✔";
        }
        else{
          done[3] = "";
        }
      }
      else if(input.equals("4")){
        if(Problems.Q4(name).equals("y")){
          done[4] = "✔";
        }
        else{
          done[4] = "";
        }
      }
      else if(input.equals("5")){
        if(Problems.Q5(name).equals("y")){
          done[5] = "✔";
        }
        else{
          done[5] = "";
        }
      }
      else if(input.equals("6")){
        if(Problems.Q6(name).equals("y")){
          done[6] = "✔";
        }
        else{
          done[6] = "";
        }
      }
    }   

    Main.congrat(); // function in main that is the end

  }
}