import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //scanner to read inputs from terminal
    Scanner read = new Scanner(System.in);
    
    //Intro
    System.out.print("\nHi. So you have come here to learn 2D arrays. Fabulous. However, what is your name? Or not your name. Just input something: ");
      
    String name = read.nextLine();
    while(name.equals("") || name.equals(" ")){
      System.out.print("No. : ");
      name = read.nextLine();
    }

    System.out.println("-------------------------");

    //enters main menu where selection of questions happen. doesn't come back
    Menu.printMenu(name);
    
  }

  //to congratulate user for finishng all taks correctly (supposedly)
  public static void congrat(){
    // to clear screen, but since it's the end of the program, it just brings everything back, welp
    System.out.print("\033[H\033[2J");  
    System.out.flush();

    System.out.println("\n\n\nGood job! You finished all the stuff! Good luck and bye bye now!");

    //fancy print outs. it looks messed up here, but it gets fixed when actually printing out because the extra backslashes go away
    System.out.println("                                               888");            
    System.out.println("                                               888"); 
    System.out.println("                                               888"); 
    System.out.println(" .d8888b .d88b. 88888b.  .d88b. 888d888 8888b. 888888.d8888b"); 
    System.out.println("d88P\"   d88\"\"88b888 \"88bd88P\"88b888P\"      \"88b888   88K"); 
    System.out.println("888     888  888888  888888  888888    .d888888888   \"Y8888b."); 
    System.out.println("Y88b.   Y88..88P888  888Y88b 888888    888  888Y88b.      X88"); 
    System.out.println(" \"Y8888P \"Y88P\" 888  888 \"Y88888888    \"Y888888 \"Y888 88888P'"); 
    System.out.println("                             888");                
    System.out.println("                        Y8b d88P");                     
    System.out.println("                         \"Y88P\""); 


    // pikachu
    System.out.println("`;-.         ___,");
    System.out.println("`.`\\_...._/`.-\"`");
    System.out.println("  \\        /      ,");
    System.out.println("  /()   () \\    .' `-._");
    System.out.println(" |)  .    ()\\  /   _.'");
    System.out.println(" \\  -'-     ,; '. <");
    System.out.println("  ;.__     ,;|   > ");
    System.out.println(" / ,    / ,  |.-'.-'");
    System.out.println("(_/    (_/ ,;|.<`");
    System.out.println("  \\    ,     ;-`");
    System.out.println("   >   \\    /");
    System.out.println("  (_,-'`> .'");
    System.out.println("jgs    (_,'");
  }
}