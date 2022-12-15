//import java.util.Arrays;
import java.util.Scanner;

class Menu{

  //private String choice;
  private static String[] done = {"","","","","",""};// = new String[]{"","","","","",""};

  public Menu(){
    //choice = "";
  }
  
  public static void printMenu(String name){

    // ✔
    Scanner read = new Scanner(System.in);

    while(true){
      System.out.print("\033[H\033[2J");  
      System.out.flush(); 
      
      System.out.println("What level would you like to try to do " + name + "?" );
      System.out.println("Please type in number of activity: ");
      System.out.println("0 - Initializing an array " + done[0]);
      System.out.println("1 - Initializing an empty 2D array " + done[1]);
      System.out.println("2 - Initializing a 2D int array " + done[2]);
      System.out.println("3 - Calling specific indices " + done[3]);
      System.out.println("4 - Nested looping and adding to an array " + done[4]);
      System.out.println("5 - Better naviagate 2D arrays " + done[5]);
  
      String input = read.nextLine();
      while(!input.equals("0") && !input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4") && !input.equals("5")){
        System.out.println("\nThat is not valid " + name + ".");
        input = read.nextLine();
      }
      
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
    }
    
  }
  
}